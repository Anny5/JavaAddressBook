package ca.stqa.pft.addressbook.tests;

import ca.stqa.pft.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
  }

}
