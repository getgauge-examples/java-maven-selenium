import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    public static String ADMIN_URL = System.getenv("ADMIN_URL");
    components.admin.Dashboard dashboard;

    @Step("Open the admin dashboard")
    public void openTheAdminDashboard() {
        Driver.webDriver.get(AppLauncher.APP_URL + "/" + ADMIN_URL);
        dashboard = PageFactory.initElements(Driver.webDriver, components.admin.Dashboard.class);
    }

    @Step("Recent customers should reflect Customer <customer>")
    public void recentCustomersShouldReflectCustomer(String customer) {
        dashboard.verifyRecentCustomer(customer);
    }

    @Step("Recent customers should not reflect Customer <customer>")
    public void recentCustomersShouldNotReflectCustomer(String customer) {
        dashboard.verifyRecentCustomer(customer);
    }

}
