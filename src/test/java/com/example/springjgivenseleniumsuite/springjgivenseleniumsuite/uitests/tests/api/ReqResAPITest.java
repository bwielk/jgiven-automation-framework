package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.tests.api;


import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.configurations.SimpleTestConfig;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.configurations.SimpleTestContext;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.apiTest.GivenAPIState;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.apiTest.ThenAPIResult;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.apiTest.WhenAPIAction;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.tests.BaseAPITest;
import com.tngtech.jgiven.annotation.As;
import com.tngtech.jgiven.annotation.JGivenConfiguration;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = {SimpleTestContext.class})
@WebAppConfiguration
@JGivenConfiguration( SimpleTestConfig.class )
public class ReqResAPITest extends BaseAPITest<GivenAPIState, WhenAPIAction, ThenAPIResult> {

    @Test
    @As("Successful querying of users")
    public void successfulUsersQuery(){
        given().a_user_is_a_valid_user();
        when().a_user_requests_all_users();
        then().the_total_number_of_users_is_$number(6);
    }
}
