package Pages.activities;

import Utils.ConfigurationReader;
import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "prependedInput")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(name = "_password")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(id = "_submit")
    public WebElement loginButtonElement;


    public void login(String username, String password) {





        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

    public void goToLandingPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));
    }
}
