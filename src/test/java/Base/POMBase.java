package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class POMBase {
    WebDriver driver;
    LocatorBase locatorBase;
    ConstantBase constantBase;
    public POMBase(WebDriver locatorBaseDriver) {
        driver = locatorBaseDriver;
        locatorBase = new LocatorBase(driver);
        constantBase = new ConstantBase();
    }

    public void openURL(String url){
        driver.get(url);
    }

    protected String getPageTitle(){
        return driver.getTitle();
    }

    protected void sendKeysInTextBox(String inputValue, WebElement texBox){
        texBox.clear();
        texBox.sendKeys(inputValue);
    }

    protected void clickButton(WebElement buttonName){
        buttonName.click();
    }

    protected void openMenu(){
        locatorBase.sideMenu().click();
    }

    protected void closeMenu(){
        locatorBase.menuCloseBtn().click();
    }



}
