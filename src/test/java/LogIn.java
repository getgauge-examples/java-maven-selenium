import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.Driver;

import static org.junit.Assert.assertTrue;

public class LogIn {
    @Step("Give an option to Log In")
    public void giveAnOptionToLogIn() {
        WebDriver webDriver = Driver.webDriver;
        WebElement logOut = webDriver.findElement(By.linkText("Log in"));
        assertTrue(logOut.isDisplayed());
    }

    @Step("Show the log in status for user <customer>")
    public void showTheLogInStatusForUser(String customer) {
        WebDriver webDriver = Driver.webDriver;
        WebElement authenticatedInfo = webDriver.findElement(By.id("auth"));
        assertTrue(authenticatedInfo.isDisplayed());
        assertTrue(authenticatedInfo.getText().contains("Welcome " + customer + "! Not you?"));
    }

    @Step("Login as name <name> and <password>")
    public void LoginAsCustomerDetails(String name, String password) {
        WebDriver webDriver = Driver.webDriver;
        webDriver.findElement(By.linkText("Log in")).click();
        webDriver.findElement(By.name("login")).sendKeys(name);
        webDriver.findElement(By.name("password")).sendKeys(password);
        webDriver.findElement(By.name("commit")).click();
    }
}
