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

    @FindBy(how = How.LINK_TEXT, linkText = "Administration interface")
    private WebElement adminInterface;

    @FindBy(how = How.LINK_TEXT, linkText = "Customers")
    private WebElement customerList;

    public void logOut() {
        logOut.click();
    }

    public void signUp() {
        signUp.click();
    }

    public void logIn() {
        logIn.click();
    }

    public void adminInterface(){adminInterface.click();}

    public void customerList(){customerList.click();}
}
