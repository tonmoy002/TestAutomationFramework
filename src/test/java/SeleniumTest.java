import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static ChromeOptions options;
    public static WebDriver webDriver;

    @BeforeTest
    void setUp() {

        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver");
        webDriver = new ChromeDriver(options);
        webDriver.get("https://magento.softwaretestingboard.com/");

    }

    @Test
    void testSteps(){

        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();
        webDriver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]")).click();
    }
}
