package ca.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
      return;
  }
    click(By.linkText("groups"));
  }

  public void goToContactPage() {
    click(By.linkText("add new"));
  }

  public void goToHomepage() {
    if (isElementPresent(By.id("maintable"))){
      return;
    }
   // click(By.xpath("//div[@id='nav']//a[.='home']"));
    click(By.linkText("home"));
  }
}