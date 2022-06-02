package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorBase {

  protected WebDriver driver;
  private final ConstantBase constantBase;

  public LocatorBase(WebDriver locatorBaseDriver) {
    driver = locatorBaseDriver;
    constantBase = new ConstantBase();
  }

  protected WebElement sideMenu() {
    WebElement menu;
    menu = driver.findElement(By.className(constantBase.getHamburgerMenuIcon()));
    return menu;
  }

  protected WebElement menuCloseBtn() {
    WebElement closeBtn;
    closeBtn = driver.findElement(By.className(constantBase.getSideMenuCloseButton()));
    return closeBtn;
  }

  protected WebElement goBackToMainMenu(){
    WebElement secondMenu;
    secondMenu = driver.findElement(By.className("hmenu-item hmenu-back-button"));
    return secondMenu;
  }


}
