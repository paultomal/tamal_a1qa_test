package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected final String URL = "https://www.accuweather.com/";
    protected final String PRECISE_TEXT_XPATH = "//div[contains(@class, 'featured-search')]";
    protected final String PARTICULAR_TEXT_XPATH = "//input[contains(@class, 'search-input')]";
    protected final String RELATIVE_RESOURCE_PATH = "src/test/resources/";


    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage()
                .window()
                .maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
