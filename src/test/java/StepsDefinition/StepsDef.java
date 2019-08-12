package StepsDefinition;

import Utils.ConfigurationReader;
import Utils.Driver;
import Utils.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepsDef {
    Pages pages = new Pages();


    @Given("go to vytrack website")
    public void go_to_vytrack_website() {

    pages.loginPage().goToLandingPage();


    }

    @When("Enter username and password")
    public void enter_username_and_password() {
        String username = ConfigurationReader.getProperty("storemanagerusername");
        String password = ConfigurationReader.getProperty("storemanagerpassword");
        pages.loginPage().login(username, password);

    }

    @Then("click Enter")
    public void click_Enter() {
        // Write code here that turns the phrase above into concrete actions

    }
}
