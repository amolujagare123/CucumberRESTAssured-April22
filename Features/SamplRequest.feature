Feature: all rest request reqres.in

  @createUserSampleRequest
  Scenario: verify create user request
    Given create user payload is created
    When user calls AddUser request using POST Method
    Then API call should get success with status code "200"
   # And  in the response name should be morpheus
