package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {
        //go to GroupsPage
         wd.findElement(By.linkText("groups")).click();
        //init GroupCreation
        wd.findElement(By.name("new")).click();
        //fill GroupForm
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys("testGroup");

        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys("test");

        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys("test");
        //submitGroupCreation
        wd.findElement(By.name("submit")).click();
        //returnToGroupsPage
        wd.findElement(By.linkText("group page")).click();

    }

}
