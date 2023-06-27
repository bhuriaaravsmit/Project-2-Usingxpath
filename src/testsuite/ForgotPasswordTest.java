package testsuite;

import browsefactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {


        driver.findElement(By.xpath("//div[@class = 'orangehrm-login-forgot']//p")).click();
        String expectedText = " Reset Password ";
        String actualText = driver.findElement(By.tagName("h6")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("verify reset password",actualText, actualText);
    }
}
