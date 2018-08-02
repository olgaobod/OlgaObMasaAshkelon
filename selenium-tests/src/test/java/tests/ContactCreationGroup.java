package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactCreationGroup extends TestBase{
        ChromeDriver wd;

        @BeforeClass
        public void setUp() {
            wd = new ChromeDriver();
            wd.navigate().to("http://localhost/addressbook/");
            wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


            wd.findElement(By.name("user")).click();
            wd.findElement(By.name("user")).clear();
            wd.findElement(By.name("user")).sendKeys("admin");

            wd.findElement(By.name("pass")).click();
            wd.findElement(By.name("pass")).clear();
            wd.findElement(By.name("pass")).sendKeys("secret");

            wd.findElement(By.xpath("//*[@type='submit']")).click();

        }

        @Test
        public void testContactCreation() {
            //go to GroupsPage
            wd.findElement(By.linkText("add new")).click();

            //fill GroupForm
            wd.findElement(By.name("firstname")).click();
            wd.findElement(By.name("firstname")).clear();
            wd.findElement(By.name("firstname")).sendKeys("testContact");

            wd.findElement(By.name("lastname")).click();
            wd.findElement(By.name("lastname")).clear();
            wd.findElement(By.name("lastname")).sendKeys("test");

            wd.findElement(By.name("address")).click();
            wd.findElement(By.name("address")).clear();
            wd.findElement(By.name("address")).sendKeys("test");
            //submitGroupCreation
            wd.findElement(By.name("submit")).click();
            //returnToGroupsPage
           // wd.findElement(By.linkText("group page")).click();

        }

        @AfterClass
        public void tearDown() {
            wd.quit();
        }
    }


