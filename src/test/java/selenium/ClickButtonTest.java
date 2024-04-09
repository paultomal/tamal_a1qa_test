package selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ClickButtonTest extends BaseTest {

    private final By I_UNDERSTAND_BUTTON = By.className("policy-accept");

    @Test
    public void clickIUnderstandButton() {
        driver.findElement(I_UNDERSTAND_BUTTON).click();

        boolean buttonNotDisplayed = driver.findElements(I_UNDERSTAND_BUTTON).isEmpty();
        assertTrue(buttonNotDisplayed, "The 'I Understand' button is still displayed after clicking it.");
    }
}


