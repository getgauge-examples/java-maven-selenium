import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.Driver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlaceOrder {

    @Step("Add item <item> to the cart.")
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

    @Step("Cart now contains <itemCount> number of items")
    public void cartNowContains(int numberOfItems) {
        WebDriver webDriver = Driver.webDriver;
        List<WebElement> products = webDriver.findElements(By.xpath("//table/tbody/tr"));
        assertEquals(numberOfItems,products.size()-2);
    }
}