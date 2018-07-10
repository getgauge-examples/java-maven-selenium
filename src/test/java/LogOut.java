import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;
import static org.junit.Assert.assertTrue;

public class LogOut {

    private static By submitLogOut = By.linkText("Log out");

    @Step("Log out the customer")
    public void logOutTheCustomer() {
        logOut();
    }

    @Step("Clear previous login")
    public void clearPreviousLogin() {
        try {
            logOut();
        } catch (Exception ex) {
            System.out.println("no previously logged in Customers");
        }
    }

    @Step("Give an option to Log Out")
    public void giveAnOptionToLogOut() {
        WebDriver webDriver = Driver.webDriver;
        WebElement logOut = webDriver.findElement(submitLogOut);
        assertTrue(logOut.isDisplayed());
    }

    private void logOut() {
        WebDriver webDriver = Driver.webDriver;

        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(submitLogOut));
        WebElement logOut = webDriver.findElement(submitLogOut);

        logOut.click();
    }
}