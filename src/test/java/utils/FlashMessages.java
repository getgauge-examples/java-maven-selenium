package utils;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.Driver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by sswaroop on 5/8/17.
 */
public class FlashMessages {
    @Step("Show a message <message>")
    public void showAWelcomeMessage(String message) {
        WebDriver webDriver = Driver.webDriver;
        WebElement flashNoticeElement = webDriver.findElement(By.xpath(String.format("//div[@id = 'flash_notice' and text() = '%s']", message)));
        assertTrue(flashNoticeElement.isDisplayed());
    }
}
