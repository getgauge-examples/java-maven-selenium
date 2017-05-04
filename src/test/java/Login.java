import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private final components.Login login;

    public Login() {

        login = PageFactory.initElements(Driver.webDriver, components.Login.class);
    }

    @Step("enter login name as <userName>")
    public void enterUserName(String userName) {
        login.enterUserName(userName);
    }

    @Step("enter login password as <password>")
    public void enterLoginPassword(String password) {
        login.enterPassword(password);
    }

    @Step("Log in")
    public void logIn() {
        login.logIn();
    }
}
