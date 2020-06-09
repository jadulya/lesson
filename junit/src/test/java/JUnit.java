import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JUnit {
    WebDriver driver;
    private Logger logger = LogManager.getLogger(JUnit.class);

    @Before
    public void chromeUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");
    }

    @Test
    public void testStart() {
        driver.get("http://otus.ru");
        logger.info("Открыта страница отус");
    }
    @After
    public void quit(){
        if (driver!=null){
            driver.quit();
        }
    }
}