package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CityWeatherTest extends BaseTest {

    private final By SEARCH_FORM = By.xpath(PRECISE_TEXT_XPATH);
    private final By SEARCH_INPUT = By.xpath(PARTICULAR_TEXT_XPATH);
    private final By SEARCH_RESULT_LINKS = By.xpath("//p[@class='location-name' and text()='New York']");

    @Test
    public void searchForNewYork() {
        WebElement searchForm = driver.findElement(SEARCH_FORM);

        WebElement searchInput = searchForm.findElement(SEARCH_INPUT);

        String cityName = "New York";
        searchInput.sendKeys(cityName);

        searchInput.submit();

        WebElement firstSearchResultLink = driver.findElement(By.xpath("//div[6]/div[1]/div[1]/div[2]/a[1]"));
        firstSearchResultLink.click();


        WebElement headerElement = driver.findElement(SEARCH_RESULT_LINKS);

        String headerText = headerElement.getText();

        Assert.assertTrue(headerText.contains(cityName), "Header does not contain city name: " + cityName);


    }
}
