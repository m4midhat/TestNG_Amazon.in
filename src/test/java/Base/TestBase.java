package Base;

import io.qameta.allure.Step;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
  protected WebDriver driver;
  protected static String baseUrl;
  protected int implicitWait;
  protected int timeOut;
  private String browser;

  protected POMBase pomBase;

  private static Logger logger = LoggerFactory.getLogger(TestBase.class);

  @BeforeSuite(description = "Read configurations")
  protected void readConfigurations() throws IOException {

    Properties properties = new Properties();
    FileInputStream ip = new FileInputStream("config.properties");
    properties.load(ip);

    baseUrl = properties.getProperty("url");
    browser = properties.getProperty("browser");
    timeOut = Integer.parseInt(properties.getProperty("pageLoadTimeout"));
    implicitWait = Integer.parseInt(properties.getProperty("implicitWait"));
    pomBase = new POMBase(driver);
    logger.info("Reading configurations");
  }

  @BeforeSuite(description = "initiate driver", dependsOnMethods = "readConfigurations")
  protected void initiateWebDriver() {
    if (browser.equalsIgnoreCase("chrome")) {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("firefox")) {
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
    } else if (browser.equalsIgnoreCase("ie")) {
      WebDriverManager.iedriver().setup();
      driver = new InternetExplorerDriver();
    } else if (browser.equalsIgnoreCase("edge")) {
      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
    } else {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }

    logger.info("Initiating webdriver");
  }

  @BeforeSuite(dependsOnMethods = "initiateWebDriver")
  @Step("Browse URL")
  protected void openURL() {
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeOut));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
    driver.get(baseUrl);
    logger.info("Spinning up the browsers & URL");
  }

  @AfterSuite
  protected void closeBrowser() {
    logger.info("Closing Browser");
     driver.quit();
  }
}
