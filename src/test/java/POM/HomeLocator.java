package POM;

import Base.ConstantBase;
import Base.LocatorBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomeLocator extends LocatorBase {
    private ConstantBase constantBase;

    public HomeLocator(WebDriver locatorBaseDriver) {
        super(locatorBaseDriver);
        constantBase=new ConstantBase();
    }

    protected void scrollToView(String webLocatorType, String webLocator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = null;
        if(webLocatorType.equalsIgnoreCase("linkText")){
            //Find element by link text and store in variable "Element"
            Element = driver.findElement(By.linkText(webLocator));
        }else if(webLocatorType.equalsIgnoreCase("xpath")){
            //Find element by link text and store in variable "Element"
            Element = driver.findElement(By.xpath(webLocator));
        }else if(webLocatorType.equalsIgnoreCase("id")){
            //Find element by link text and store in variable "Element"
            Element = driver.findElement(By.id(webLocator));
        }else if(webLocatorType.equalsIgnoreCase("css")){
            //Find element by link text and store in variable "Element"
            Element = driver.findElement(By.cssSelector(webLocator));
        }else if(webLocatorType.equalsIgnoreCase("class")){
            //Find element by link text and store in variable "Element"
            Element = driver.findElement(By.className(webLocator));
        }

        // This will scroll the page till the element is found
        if (Element != null) {
            js.executeScript("arguments[0].scrollIntoView();", Element);
        }
    }

    protected void waitForSecondMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(constantBase.getSubMenu())));
    }

    protected WebElement menuBar() {
        WebElement menuBar;
        menuBar = driver.findElement(By.className(constantBase.getMenuContent()));
        return menuBar;
    }

    protected WebElement secondMenu(){
        WebElement secondMenu;
        secondMenu = driver.findElement(By.className(constantBase.getSubMenu()));
        return secondMenu;
    }

    protected WebElement bestSeller() {
        WebElement bestSeller;
    scrollToView("xpath", constantBase.getBestSeller());
        bestSeller = driver.findElement(By.xpath(constantBase.getBestSeller()));
        return bestSeller;
    }

    protected WebElement newReleases() {
        WebElement newReleases;
    scrollToView("xpath", constantBase.getNewReleases());
        newReleases = driver.findElement(By.xpath(constantBase.getNewReleases()));
        return newReleases;
    }

    protected WebElement moversAndShakers() {
        WebElement movers;
    scrollToView("linkText", constantBase.getMoversAndShakers());
        movers = driver.findElement(By.linkText(constantBase.getMoversAndShakers()));
        return movers;
    }

    protected WebElement echoAndAlexa() {
        WebElement echoAndAlexa;
    scrollToView("xpath", constantBase.getEchoAndAlexa());
        echoAndAlexa = driver.findElement(By.xpath(constantBase.getEchoAndAlexa()));
        return echoAndAlexa;
    }

    protected WebElement fireTV() {
        WebElement fireTV;
    scrollToView("xpath", constantBase.getFireTV());
        fireTV = driver.findElement(By.xpath(constantBase.getFireTV()));
        return fireTV;
    }

    protected WebElement eReadersBook() {
        WebElement eReadersBook;
    scrollToView("xpath", constantBase.getEReadersBook());
        eReadersBook = driver.findElement(By.xpath(constantBase.getEReadersBook()));
        return eReadersBook;
    }

    protected WebElement audioBooks() {
        WebElement audioBooks;
    scrollToView("xpath", constantBase.getAudioBooks());
        audioBooks = driver.findElement(By.xpath(constantBase.getAudioBooks()));
        return audioBooks;
    }

    protected WebElement amazonPrimeVideo() {
        WebElement amznPrimeVideo;
        scrollToView("xpath",constantBase.getAmazonPrimeVideo());
        amznPrimeVideo = driver.findElement(By.xpath(constantBase.getAmazonPrimeVideo()));
        return amznPrimeVideo;
    }

    protected WebElement amazonPrimeMusic() {
        WebElement amznPrimeMusic;
        scrollToView("xpath",constantBase.getAmazonMusic());
        amznPrimeMusic = driver.findElement(By.xpath(constantBase.getAmazonMusic()));
        return amznPrimeMusic;
    }

    protected WebElement mobileComputers() {
        WebElement mobileComputers;
        scrollToView("xpath",constantBase.getMobileComputers());
        mobileComputers = driver.findElement(By.xpath(constantBase.getMobileComputers()));
        return mobileComputers;
    }

    protected WebElement tvAppliances() {
        WebElement tvAppliances;
        scrollToView("xpath",constantBase.getTvAppliances());
        tvAppliances = driver.findElement(By.xpath(constantBase.getTvAppliances()));
        return tvAppliances;
    }

    protected WebElement menFashion() {
        WebElement menFashion;
        scrollToView("xpath",constantBase.getMenFashion());
        menFashion = driver.findElement(By.xpath(constantBase.getMenFashion()));
        return menFashion;
    }

    protected WebElement womenFashion() {
        WebElement womenFashion;
        scrollToView("xpath",constantBase.getWomenFashion());
        womenFashion = driver.findElement(By.xpath(constantBase.getWomenFashion()));
        return womenFashion;
    }

    protected WebElement television() {
        WebElement television;
        scrollToView("xpath",constantBase.getTelevision());
        television = driver.findElement(By.xpath(constantBase.getTelevision()));
        return television;
    }

    protected WebElement modelYear2022() {
        WebElement modelyear2022;
        scrollToView("xpath",constantBase.getModelYear2022());
        modelyear2022 = driver.findElement(By.xpath(constantBase.getModelYear2022()));
        return modelyear2022;
    }

    protected WebElement modelYear2021() {
        WebElement modelyear2021;
        scrollToView("xpath",constantBase.getModelYear2021());
        modelyear2021 = driver.findElement(By.xpath(constantBase.getModelYear2021()));
        return modelyear2021;
    }

    protected WebElement modelYear2020() {
        WebElement modelyear2020;
    scrollToView("xpath", constantBase.getModelYear2020());
        modelyear2020 = driver.findElement(By.xpath(constantBase.getModelYear2020()));
        return modelyear2020;
    }

    protected WebElement modelYear2019() {
        WebElement modelyear2019;
        scrollToView("xpath",constantBase.getModelYear2019());
        modelyear2019 = driver.findElement(By.xpath(constantBase.getModelYear2019()));
        return modelyear2019;
    }

    protected WebElement modelYear2018() {
        WebElement modelyear2018;
    scrollToView("xpath", constantBase.getModelYear2018());
        modelyear2018 = driver.findElement(By.xpath(constantBase.getModelYear2018()));
        return modelyear2018;
    }

    protected WebElement modelYear2017() {
        WebElement modelYear2017;
    scrollToView("xpath", constantBase.getModelYear2017());
        modelYear2017 = driver.findElement(By.xpath(constantBase.getModelYear2017()));
        return modelYear2017;
    }

    protected WebElement modelYear2016() {
        WebElement modelYear2016;
    scrollToView("xpath", constantBase.getModelYear2016());
        modelYear2016 = driver.findElement(By.xpath(constantBase.getModelYear2016()));
        return modelYear2016;
    }

    protected WebElement andriodTV() {
        WebElement andriodTV;
    scrollToView("xpath", constantBase.getAndriodTV());
        andriodTV = driver.findElement(By.xpath(constantBase.getAndriodTV()));
        return andriodTV;
    }

    protected WebElement fireOSTV() {
        WebElement fireOSTV;
    scrollToView("xpath", constantBase.getFireTV());
        fireOSTV = driver.findElement(By.xpath(constantBase.getFireTV()));
        return fireOSTV;
    }

    protected WebElement tizenTV() {
        WebElement tizenTV;
    scrollToView("xpath", constantBase.getTizenTV());
        tizenTV = driver.findElement(By.xpath(constantBase.getTizenTV()));
        return tizenTV;
    }

    protected WebElement webOSTV() {
        WebElement webOSTV;
        webOSTV = driver.findElement(By.xpath(constantBase.getWebOS()));
        return webOSTV;
    }

    protected WebElement lessThan4Ft() {
        WebElement lessThan4Ft;
        lessThan4Ft = driver.findElement(By.xpath(constantBase.getLessThan4ft()));
        return lessThan4Ft;
    }

    protected WebElement feet4to6() {
        WebElement feet4to6;
        feet4to6 = driver.findElement(By.xpath(constantBase.getFeet4to6()));
        return feet4to6;
    }

    protected WebElement feet6to8() {
        WebElement feet6to8;
        feet6to8 = driver.findElement(By.xpath(constantBase.getFeet6to8()));
        return feet6to8;
    }

    protected WebElement feet8to10() {
        WebElement feet8to10;
        feet8to10 = driver.findElement(By.xpath(constantBase.getFeet8to10()));
        return feet8to10;
    }

    protected WebElement feet10to12() {
        WebElement feet10to12;
        feet10to12 = driver.findElement(By.xpath(constantBase.getFeet10to12()));
        return feet10to12;
    }

    protected WebElement feet12to15() {
        WebElement feet12to15;
        feet12to15 = driver.findElement(By.xpath(constantBase.getFeet12to15()));
        return feet12to15;
    }

    protected WebElement feetAbove15() {
        WebElement above15;
        above15 = driver.findElement(By.xpath(constantBase.getFeetAbove15()));
        return above15;
    }

    protected WebElement brandMI() {
        WebElement MICheckBox;
        MICheckBox = driver.findElement(By.xpath(constantBase.getBrandMI()));
        return MICheckBox;
    }

    protected WebElement brandLG() {
        WebElement brandLG;
        brandLG = driver.findElement(By.xpath(constantBase.getBrandLG()));
        return brandLG;
    }

    protected WebElement brandSamsung() {
        WebElement brandSamsung;
        scrollToView("xpath", constantBase.getBrandSamsung());
        brandSamsung = driver.findElement(By.xpath(constantBase.getBrandSamsung()));
        return brandSamsung;
    }

    protected WebElement brandIffalacon() {
        WebElement brandIffalacon;
        brandIffalacon = driver.findElement(By.xpath(constantBase.getBrandiFFALCON()));
        return brandIffalacon;
    }

    protected WebElement brandCroma() {
        WebElement brandCroma;
        brandCroma = driver.findElement(By.xpath(constantBase.getBrandCroma()));
        return brandCroma;
    }

    protected WebElement brandVU() {
        WebElement brandVU;
        brandVU = driver.findElement(By.xpath(constantBase.getBrandVU()));
        return brandVU;
    }

    protected WebElement brandAirTec() {
        WebElement brandAirTec;
        brandAirTec = driver.findElement(By.xpath(constantBase.getBrandAirTec()));
        return brandAirTec;
    }

    protected WebElement brandOnePlus() {
        WebElement brandOnePlus;
        brandOnePlus = driver.findElement(By.xpath(constantBase.getBrandOnePlus()));
        return brandOnePlus;
    }

    protected WebElement sortDropDown() {
        WebElement sortDropDown = driver.findElement(By.id(constantBase.getSortDownArrow()));
        return sortDropDown;
    }

    protected WebElement sortFeatured() {
        WebElement sortByFeatured;
        sortByFeatured = driver.findElement(By.id(constantBase.getSortByFeature()));
        return sortByFeatured;
    }

    protected WebElement sortPriceLowToHigh() {
        WebElement sortPriceLowToHigh;
        sortPriceLowToHigh = driver.findElement(By.id(constantBase.getSortPriceLowToHigh()));
        return sortPriceLowToHigh;
    }

    protected WebElement sortPriceHighToLow() {
        WebElement sortPriceHighToLow;
        sortPriceHighToLow = driver.findElement(By.id(constantBase.getSortPriceHightoLow()));
        return sortPriceHighToLow;
    }

    protected WebElement sortCustomerReview() {
        WebElement sortCustomerReview;
        sortCustomerReview = driver.findElement(By.id(constantBase.getSortCustomerReview()));
        return sortCustomerReview;
    }

    protected WebElement sortNewArrivals() {
        WebElement sortNewArrivals;
        sortNewArrivals = driver.findElement(By.id(constantBase.getSortNewArrivals()));
        return sortNewArrivals;
    }

    protected List<WebElement> totalResults(){
        List<WebElement> filteredRecords;
        filteredRecords = driver.findElements(By.className(constantBase.getFilteredRecords()));
        if(filteredRecords.size() !=0){
            return filteredRecords;
        }else
            return null;
    }

    protected void switchWindow(){
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    protected WebElement aboutThisItem(){
        scrollToView("id", constantBase.getFeatureList());
        WebElement aboutItem = driver.findElement(By.id(constantBase.getFeatureList())).findElement(By.tagName("h1"));
        return aboutItem;
    }

}
