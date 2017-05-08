package customers;

import com.thoughtworks.gauge.Step;
import components.Header;
import driver.Driver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class CustomerSearchByName {

    private final components.list.Customers customers;

    @Step("enter search criteria name <name>")
    public void enterCriteriaUserName(String name) {
        customers.enterCriteriaUserName(name);
    }

    @Step("enter search criteria email <email>")
    public void enterCriteriaEmail(String email) {
        customers.enterCriteriaEmail(email);
    }

    @Step("Filter customers")
    public void search() {
        customers.filter();
    }

    @Step("Delete the customer")
    public void deleteTheCustomer() {
        customers.deleteCustomer();
    }

    @Step("Clear Filters")
    public void clearFilters() {
        customers.clearFilters();
    }

    public CustomerSearchByName() {
        customers = PageFactory.initElements(Driver.webDriver, components.list.Customers.class);
    }

    @Step("confirm deletion")
    public void implementation1() {
        Driver.webDriver.switchTo().alert().accept();
    }
}