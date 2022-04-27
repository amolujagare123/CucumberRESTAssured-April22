package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class RequestSampleCreateUserSD {

    RequestSpecification request;
    Response response;

    @Given("create user payload is created")
    public void create_user_payload_is_created() {
        RequestSpecification reqSpec = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in")
                .addHeader("Content-Type", "application/json")
                .build();

         request = given().log().all().spec(reqSpec).body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}");

    }

    @When("user calls AddUser request using POST Method")
    public void user_calls_add_user_request_using_post_method() {

        response = request.when().post("/api/users");
    }

    @Then("API call should get success with status code {string}")
    public void apiCallShouldGetSuccessWithStatusCode(String statusCode) {
        ResponseSpecification respSpec = new ResponseSpecBuilder().expectStatusCode(201)
               // .expectBody("name", equalTo("morpheus"))
                .build();
        response.then().log().all().spec(respSpec).extract().asString();

    }


   /* @Then("in the response name should be morpheus")
    public void in_the_response_name_should_be_morpheus() {

    }*/
}
