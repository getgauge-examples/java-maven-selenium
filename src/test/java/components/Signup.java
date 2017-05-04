package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Signup {
    private WebElement user_username;
    private WebElement user_email;
    private WebElement user_password;
    private WebElement user_password_confirmation;
    @FindBy(how = How.NAME,name = "commit")
    private WebElement signup;

    public void enterUserName(String name) {
        user_username.clear();
        user_username.sendKeys(name);
    }

    public void enterEmail(String email) {
        user_email.clear();
        user_email.sendKeys(email);
    }

    public void enterPassword(String password) {
        user_password.clear();
        user_password.sendKeys(password);
    }

    public void enterPasswordConfirmation(String passwordConfirmation) {
        user_password_confirmation.clear();
        user_password_confirmation.sendKeys(passwordConfirmation);
    }

    public void signUp() {
        signup.click();
    }
}