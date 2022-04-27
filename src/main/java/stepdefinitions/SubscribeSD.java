package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscribeSD {

    @Given("I am on subscription page")
    public void i_am_on_subscription_page() {
        System.out.println("I am on subscription page");
    }
  /*  @When("I Enter Jayashree , j@gmail.com , {int}")
    public void i_enter_jayashree_j_gmail_com(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/
    @When("I click on subscribe button")
    public void i_click_on_subscribe_button() {
        System.out.println("I click on subscribe button");
    }
    @Then("user should be subscribed")
    public void user_should_be_subscribed() {
        System.out.println("user should be subscribed");
    }

    @When("^I Enter (.+) , (.+) , (.+)$")
    public void i_enter_(String name, String email, String number) throws Throwable {

        System.out.println("Below is the subscriber details:");
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Number:"+number);
    }
}
