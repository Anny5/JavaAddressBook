package ca.stqa.pft.addressbook.appmanager;

import ca.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {
    click(By.linkText("home"));
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("home"), contactData.getPhoneNumber());
    type(By.name("email"), contactData.getEmail());

  if (creation){
    new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
  }else{
    Assert.assertFalse(isElementPresent(By.name("new_group")));
  }
  }



  public void submitDelete() {
    click(By.xpath("//div/div[4]/form[2]/input[2]"));
  }

  public void selectContact() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }


  public void submitContactModification() {
    click(By.xpath("//div/div[4]/form[1]/input[22]"));
  }

  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }
}
