package components.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;

public class Dashboard {
    @FindBy(how = How.XPATH, xpath = "//*[text()='Recent Customers']/following-sibling::div/table/tbody/tr[1]/td")
    private WebElement recentCustomer;

    @FindBy(how = How.XPATH, xpath = "//*[text()='Recent Customers']/following-sibling::div/table/tbody/tr")
    private WebElement recentCustomers;

    public void verifyRecentCustomer(String recentCustomerEmail){
        assertEquals(recentCustomerEmail, recentCustomer.getText());
    }

    public void verifyRecentCustomerDoesNotContain(String recentCustomers){

        assertEquals(recentCustomers, recentCustomer.getText());
    }
}
