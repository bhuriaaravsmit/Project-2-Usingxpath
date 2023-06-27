package testsuite;

import browsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest  extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup()
    {
        openBrowser(baseUrl);
    }

    @Test

    public void verifyUserShouldLoginSuccessfullyWithValidCredentials(){

        //Find the Username and password Field
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Find the password Field and Enter the password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Click on Login Button

        driver.findElement(By.xpath("//button[text() =' Login ']")).click();

        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.tagName("h6")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("Verify Dashboard", expectedText, actualText);



    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}



