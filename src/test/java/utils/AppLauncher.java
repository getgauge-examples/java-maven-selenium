package utils;

import com.thoughtworks.gauge.Step;
import utils.driver.Driver;

public class AppLauncher {

    public static String APP_URL = System.getenv("APP_URL");

    @Step("Go to the store website")
    public void launchTheApplication() {
        Driver.webDriver.get(APP_URL);
    }
}