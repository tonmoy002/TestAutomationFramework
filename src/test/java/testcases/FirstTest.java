package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("//*[text()='Consent']")).click();
        driver.findElement(By.linkText("Sign In")).click();
        driver.close();
    }
}
