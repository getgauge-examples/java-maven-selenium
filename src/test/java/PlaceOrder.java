import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.Driver;

import static org.junit.Assert.assertTrue;

public class PlaceOrder {
    @Step("Add item <item> to the shopping basket.")
    public void addItemToTheBasket(String item) {
        WebDriver webDriver = Driver.webDriver;
        webDriver.findElement(By.linkText(item)).click();
        webDriver.findElement(By.linkText("Add to Card")).click();
    }

    @Step("Checkout now")
    public void placeTheOrder() {
        WebDriver webDriver = Driver.webDriver;
        webDriver.findElement(By.xpath("//input[@value='Checkout Now!']")).click();
    }

}
