import com.google.common.base.CharMatcher;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.Driver;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class CustomerRegistration {

    @Step("Sign up as <customer> with email <customer@example.com> and <password>")
    public void registerCustomerWith(String customer, String email, String password) {
        WebDriver webDriver = Driver.webDriver;
        webDriver.findElement(By.linkText("Sign up")).click();

        WebElement form = webDriver.findElement(By.id("new_user"));

        form.findElement(By.name("user[username]")).sendKeys(customer);
        form.findElement(By.name("user[email]")).sendKeys(email);
        form.findElement(By.name("user[password]")).sendKeys(password);
        form.findElement(By.name("user[password_confirmation]")).sendKeys(password);
        form.findElement(By.name("commit")).click();
    }

    @Step("Show a welcome message <message>")
    public void showAWelcomeMessage(String message) {
        WebDriver webDriver = Driver.webDriver;
        List<WebElement> flash_notices = webDriver.findElements(By.id("flash_notice"));
        WebElement flashNotice = flash_notices.get(1);
        assertTrue(flashNotice.isDisplayed());
        assertEquals("Thank you for signing up! You are now logged in.", flashNotice.getText());
    }

    @Step("Show the log in status for user <customer>")
    public void showTheLogInStatusForUser(String customer) {
        WebDriver webDriver = Driver.webDriver;
        WebElement authenticatedInfo = webDriver.findElement(By.id("auth"));
        assertTrue(authenticatedInfo.isDisplayed());
        assertTrue(authenticatedInfo.getText().contains("Welcome " + customer + "! Not you?"));
    }

    @Step("Give an option to log out")
    public void giveAnOptionToLogOut() {
        WebDriver webDriver = Driver.webDriver;
        WebElement logOut = webDriver.findElement(By.linkText("Log out"));
        assertTrue(logOut.isDisplayed());
    }

    @Step("See items available for purchase.")
    public void seeItemsAvaiableForPurchase() {
        WebDriver webDriver = Driver.webDriver;
        List<WebElement> products = webDriver.findElements(By.className("product"));
        assertThat(products.size(), is(not(0)));
    }
}