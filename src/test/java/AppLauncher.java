import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.support.PageFactory;
import components.Header;

public class AppLauncher {

    public static String APP_URL = System.getenv("APP_URL");

    private final Header header;

    public  AppLauncher() {
        header = PageFactory.initElements(Driver.webDriver, Header.class);
    }

    @Step("Open the home page")
    public void launchTheApplication() {
        Driver.webDriver.get(APP_URL);
    }

    @Step("Log out")
    public void logOut() {
        header.logOut();
    }

    @Step("proceed to sign up")
    public void signUp() {
        header.signUp();
    }

    @Step("proceed to log in")
    public void proceedToLogin() {
        header.logIn();
    }
}