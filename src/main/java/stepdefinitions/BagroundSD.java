package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class BagroundSD {

    @Given("^Browser should be opened$")
    public void browser_should_be_opened() throws Throwable {
        System.out.println("=============>>>Browser should be opened");
    }

    @And("^It should be maximized$")
    public void it_should_be_maximized() throws Throwable {
        System.out.println("=============>>>It should be maximized");

    }


}
