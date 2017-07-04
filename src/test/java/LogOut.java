import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;
import static org.junit.Assert.assertTrue;

public class LogOut {

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
        WebElement logOut = webDriver.findElement(By.linkText("Log out"));
        assertTrue(logOut.isDisplayed());
    }

    private void logOut() {
        WebDriver webDriver = Driver.webDriver;
        String option = "Log out";

        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(option)));
        WebElement logOut = webDriver.findElement(By.linkText(option));

        logOut.click();
    }
}