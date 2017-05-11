import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driver.Driver;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class CustomerSignup {

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

    @Step("See items available for purchase.")
    public void seeItemsAvailableForPurchase() {
        WebDriver webDriver = Driver.webDriver;
        List<WebElement> products = webDriver.findElements(By.className("product"));
        assertThat(products.size(), is(not(0)));
    }
}