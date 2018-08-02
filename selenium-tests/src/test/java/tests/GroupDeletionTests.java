package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
    @Test
    public void testGroupDeletion(){
    if(isGroupPresent()){


    }else{
        createGroup();
    }
        goToGroupsPage();
        selectGroup();
        clickOnDeleteGroupButton();
        returnToGroupsPage();
    }

    public void createGroup() {
        initGroupCreation();
        fillGropuForm();
        submitGroupCreation();
        returnToGroupCreation();
    }

}
