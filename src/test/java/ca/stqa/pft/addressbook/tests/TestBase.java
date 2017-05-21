package ca.stqa.pft.addressbook.tests;

import ca.stqa.pft.addressbook.appmanager.ApplicationManager;
import ca.stqa.pft.addressbook.appmanager.ContactHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();


  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {

    app.stop();
  }

}
