package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Log_In_Page {
    WebDriver driver;
    By UserNameLocator = By.id("prependedInput");
    public WebElement getUsername(){
        return driver.findElement(UserNameLocator);
    }
}
