package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before("@userReg")
    public void beforeMyScenario()
    {
        System.out.println("****** >>>> beforeMyScenario <<<<******");
    }

    @After("@userReg")
    public void afterMyScenario()
    {
        System.out.println("****** >>>> afterMyScenario <<<<******");
    }
}
