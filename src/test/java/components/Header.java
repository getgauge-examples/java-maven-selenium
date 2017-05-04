package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header {
    @FindBy(how = How.LINK_TEXT, linkText = "Log in")
    private WebElement logIn;

    @FindBy(how = How.LINK_TEXT, linkText = "Log out")
    private WebElement logOut;

    @FindBy(how = How.LINK_TEXT, linkText = "Sign up")
    private WebElement signUp;

    public void logOut() {
        logOut.click();
    }

    public void signUp() {
        signUp.click();
    }

    public void logIn() {
        logIn.click();
    }
}
