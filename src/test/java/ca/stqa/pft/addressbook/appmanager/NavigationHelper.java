package ca.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver wd)
  {super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }

  public void goToContactPage() {
    click(By.linkText("add new"));
  }

  public void goToHomepage() {
    click(By.xpath("//div[@id='nav']//a[.='home']"));
  }
}