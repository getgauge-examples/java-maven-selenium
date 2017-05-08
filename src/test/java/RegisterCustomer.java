import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.support.PageFactory;
import components.Signup;

public class RegisterCustomer {
    private final Signup signup;

    public RegisterCustomer(){
        signup = PageFactory.initElements(Driver.webDriver, Signup.class);
    }

    @Step("enter customer as <customer>")
    public void enterCustomer(String name) {
        signup.enterUserName(name);
    }

    @Step("enter email as <email>")
    public void enterEmail(String email) {
        signup.enterEmail(email);
    }

    @Step("enter password as <password>")
    public void enterPassword(String password) {
        signup.enterPassword(password);
    }

    @Step("enter confirm password as <password>")
    public void enterConfirmPassword(String passwordConfirmation) {
        signup.enterPasswordConfirmation(passwordConfirmation);
    }

    @Step("submit Registration")
    public void signUp() {
        signup.signUp();
    }
}
