package POM;

import Base.ConstantBase;
import Base.POMBase;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import javax.swing.text.Element;
import java.util.List;

public class HomePOM extends POMBase {

    HomeLocator homeLocator;
    ConstantBase constantBase;

        public HomePOM(WebDriver testDriver) {
            super(testDriver);
            homeLocator = new HomeLocator(testDriver);
    }

    @Step("Open Menu")
    public void openMenu(){
        homeLocator.menuBar().click();

    }

    @Step("Click TV & Appliances")
    public void clickTV(){
            //homeLocator.waitForSecondMenu();
            homeLocator.tvAppliances().click();
    }

    @Step("Click Television")
    public void clickSubMenuItemTelevision(){
            homeLocator.television().click();

    }

    @Step("Click Samsung")
    public void clickSamsung(){
            homeLocator.brandSamsung().click();
    }

    @Step("Sorting")
    public void sortResults(String sortBy){
            homeLocator.sortDropDown().click();
            if(sortBy.equalsIgnoreCase("feature")){
                homeLocator.sortFeatured().click();
            }else
                if(sortBy.equalsIgnoreCase("price low to high")){
                    homeLocator.sortPriceLowToHigh().click();
                } else
                    if(sortBy.equalsIgnoreCase("price high to low")){
                        homeLocator.sortPriceHighToLow().click();
                    }else
                        if(sortBy.equalsIgnoreCase("new arrivals")){
                            homeLocator.newReleases().click();
                        }else
                            if(sortBy.equalsIgnoreCase("customer review")){
                                homeLocator.sortCustomerReview().click();
                            }
    }

    @Step("Count total results")
    public int calculateResults(){
        int results;
        List<WebElement> allElements = homeLocator.totalResults();
        results = allElements.size();
        return results;
    }

    @Step("Return second highest item")
    private WebElement returnSecondHighest(){
        List<WebElement> allElements = homeLocator.totalResults();

        return allElements.get(1);
    }

    @Step("Click on the selected item")
    public void clickSecondHighest(){
            WebElement secondHighest = returnSecondHighest();
            secondHighest.click();
    }

    @Step("Switch windows")
    public void switchToNewTab(){
            homeLocator.switchWindow();
    }

    @Step("Check the availability of 'About This Item'")
    public String  aboutThisItemAvailable(){
            WebElement about = homeLocator.aboutThisItem();
            return  about.getText();

    }
}