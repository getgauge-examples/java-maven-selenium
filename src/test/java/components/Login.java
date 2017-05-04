package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
    private WebElement login;
    private WebElement password;
    @FindBy(how = How.NAME,name = "commit")
    private WebElement login_submit;

    public void enterUserName(String name) {
        login.clear();
        login.sendKeys(name);
    }

    public void enterPassword(String userPassword) {
        password.clear();
        password.sendKeys(userPassword);
    }

    public void logIn() {
        login_submit.click();
    }
}