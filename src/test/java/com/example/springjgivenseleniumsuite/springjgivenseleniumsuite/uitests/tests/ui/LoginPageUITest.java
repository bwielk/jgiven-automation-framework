package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.tests.ui;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.configurations.SimpleTestConfig;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.configurations.SimpleTestContext;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.uiTest.GivenState;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.uiTest.ThenResult;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.uiTest.WhenAction;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.tests.BaseUITest;
import com.tngtech.jgiven.annotation.As;
import com.tngtech.jgiven.annotation.JGivenConfiguration;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = {SimpleTestContext.class})
@WebAppConfiguration
@JGivenConfiguration( SimpleTestConfig.class )
public class LoginPageUITest extends BaseUITest<GivenState, WhenAction, ThenResult> {

    @Test
    @As("Successful log in attempt")
    public void successfulLoginAttemptTest(){
        given().a_user_has_opened_the_login_page();
        when().the_user_enters_valid_credentials();
        then().the_user_can_view_the_inventory_page();
    }
}
