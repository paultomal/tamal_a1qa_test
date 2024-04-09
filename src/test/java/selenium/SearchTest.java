package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest {

    private final By SEARCH_FORM = By.xpath(PRECISE_TEXT_XPATH);
    private final By SEARCH_INPUT = By.xpath(PARTICULAR_TEXT_XPATH);
    private final By SEARCH_RESULTS_LIST = By.className("search-results");

    @Test
    public void searchForNewYork() {
        WebElement searchForm = driver.findElement(SEARCH_FORM);
        WebElement searchInput = searchForm.findElement(SEARCH_INPUT);

        searchInput.sendKeys("New York");

        WebElement searchResultsList = driver.findElement(SEARCH_RESULTS_LIST);
        assertTrue(searchResultsList.isDisplayed(), "Search results list is not displayed.");
    }
}
