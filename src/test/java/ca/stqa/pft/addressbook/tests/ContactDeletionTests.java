package ca.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion(){
    app.getNavigationHelper().goToHomepage();
    app.getContactHelper().selectContact();
    app.getContactHelper().submitDelete();
    app.getContactHelper().returnToHomePage();
  }
}

