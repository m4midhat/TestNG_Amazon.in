package Test;

import Base.TestBase;
import POM.HomePOM;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SamsungTVDetails extends TestBase {


    HomePOM homePOM;

    @BeforeTest
    public void setUpTests(){
        homePOM=new HomePOM(driver);
        homePOM.openMenu();
        homePOM.clickTV();
        homePOM.clickSubMenuItemTelevision();
        homePOM.clickSamsung();
        homePOM.sortResults("Price low to high");
    }

    @Test(description = "Verify if the records filtered are more than 0", priority = 0)
    protected void recordsFiltered(){
        int totalRecordsFound = homePOM.calculateResults();
        System.out.println(totalRecordsFound+ ": Records found .....");
        Assert.assertNotEquals(totalRecordsFound,0);
    }

    @Test(description = "Click on the second highest record to check the details", priority = 1)
    protected void clickRecord(){
        homePOM.clickSecondHighest();
    }

    @Test(description = "Switch to newly opened tab", priority = 2)
    protected void switchTab(){
        homePOM.switchToNewTab();
    }

    @Test(description = "Verify the 'About This Item' is available", priority = 3)
    protected void aboutThisItemAvailable(){
        String aboutDetails = homePOM.aboutThisItemAvailable();
        Assert.assertEquals(aboutDetails, "About this item");
    }

}
