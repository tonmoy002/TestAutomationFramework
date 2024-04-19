package testcases;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstTestCase extends BaseTest {

    @Test
    public static void signInPage() {

        driver.findElement(By.xpath("//*[text()='Consent']")).click();
        driver.findElement(By.linkText("Sign In")).click();
    }
}
