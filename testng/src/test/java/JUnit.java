import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class JUnit {
    WebDriver driver;
    private Logger logger = LogManager.getLogger(JUnit.class);

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");
    }

    @Test
    public void testIn() {
        driver.get("http://otus.ru");
        logger.info("Открыта страница отус");
    }
    @AfterTest
    public void quit(){
        if (driver!=null){
            driver.quit();
        }
    }
}