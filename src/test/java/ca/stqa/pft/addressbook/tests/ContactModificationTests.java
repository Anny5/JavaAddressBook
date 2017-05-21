package ca.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){

    app.getNavigationHelper().goToHomepage();
    app.getContactHelper().selectContact();
    app.getContactHelper().changeContact();
    app.getContactHelper().submitModify();
    app.getContactHelper().returnToHomePage();
  }
}
