package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SampleSD {

   @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
    }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I enter correct username and password");
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
    }

    @Then("I should be redirected to home page")
    public void i_should_be_redirected_to_home_page() {
        System.out.println("I should be redirected to home page");
    }

    @When("I enter incorrect username and password")
    public void i_enter_incorrect_username_and_password() {
        System.out.println("I enter incorrect username and password");
    }
    @Then("I should get an error")
    public void i_should_get_an_error() {
        System.out.println("I should get an error");
    }

    @When("^I dont enter username and password$")
    public void i_dont_enter_username_and_password() throws Throwable {
        System.out.println("I dont enter username and password");
    }

    @Then("^I should get another error$")
    public void i_should_get_another_error() throws Throwable {
        System.out.println("I should get another error");

        Assert.assertEquals("no error message",true,false);
    }

    @When("I enter username as {string} and password as {string}")
    public void i_enter_username_as_and_password_as(String username, String password) {
        System.out.println("I entered username and password as :");
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }


}
