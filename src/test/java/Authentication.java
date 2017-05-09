import com.thoughtworks.gauge.ExecutionContext;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.Driver;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;

public class Authentication {

    @Step("Log out the customer")
    public void logOutTheCustomer() {
        logOut();
    }

    @Step("Clear previous login")
    public void clearPreviousLogin() {
        try {
            logOut();
        }catch (Exception ex){
            System.out.println("no previously logged in Customers");
        }
    }

    @Step("Give an option to Log Out")
    public void giveAnOptionToLogOut() {
        WebDriver webDriver = Driver.webDriver;
        WebElement logOut = webDriver.findElement(By.linkText("Log out"));
        assertTrue(logOut.isDisplayed());
    }

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

    private void logOut(){
        WebDriver webDriver = Driver.webDriver;
        WebElement logOut = webDriver.findElement(By.linkText("Log out"));
        logOut.click();
    }
}