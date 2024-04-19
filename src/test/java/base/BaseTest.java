package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static Properties properties = new Properties();
    public static FileReader fileReader;

    @BeforeTest
    public void setUp() throws IOException {

        if(driver == null) {
            fileReader = new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/config.properties");
            properties.load(fileReader);
        }

        if(properties.getProperty("browser").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        driver.get(properties.getProperty("url"));

    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
