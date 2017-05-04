package components.list;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;

public class Customers {
    private WebElement commit;
    @FindBy(how = How.LINK_TEXT, linkText = "Clear Filters")
    private WebElement clearFilters;
    private WebElement q_userName;
    @FindBy(how = How.LINK_TEXT, linkText = "Delete")
    private WebElement actionsResult;

    public Customers(){
    }

    public void enterCriteriaUserName(String customer) {
        this.q_userName.clear();
        this.q_userName.sendKeys(customer);
    }

    public void filter(){
        commit.click();
    }

    public void deleteCustomer(){actionsResult.click();}

    public void clearFilters() {
        clearFilters.click();
    }
}
