import com.thoughtworks.gauge.ExecutionContext;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.Driver;

import java.util.NoSuchElementException;

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

    private void logOut(){
        WebDriver webDriver = Driver.webDriver;
        WebElement logOut = webDriver.findElement(By.linkText("Log out"));
        logOut.click();
    }
}