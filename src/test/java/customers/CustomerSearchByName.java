package customers;

import com.thoughtworks.gauge.Step;
import static org.junit.Assert.assertEquals;

public class CustomerSearchByName {

    private final components.list.Customers customers;

    @Step("enter search criteria name <name>")
    public void enterCriteriaUserName(String name) {
        customers.enterCriteriaUserName(name);
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

    public  CustomerSearchByName() {
        customers = new components.list.Customers();
    }
}