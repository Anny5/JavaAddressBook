package ca.stqa.pft.addressbook.tests;


import ca.stqa.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){

   app.getNavigationHelper().goToHomepage();
   app.getContactHelper().initContactModification();
   app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", "test_phoneNumber","test_email", null), false);
   app.getContactHelper().submitContactModification();
   app.getContactHelper().returnToHomePage();
  }
}
