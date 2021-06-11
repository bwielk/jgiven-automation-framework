package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.tests;


import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.configurations.SimpleTestConfig;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.configurations.SimpleTestContext;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.GivenSimpleTest;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.ThenSimpleTest;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.WhenSimpleTest;
import com.tngtech.jgiven.annotation.As;
import com.tngtech.jgiven.annotation.JGivenConfiguration;
import com.tngtech.jgiven.integration.spring.SpringRuleScenarioTest;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = {SimpleTestContext.class})
@WebAppConfiguration
@JGivenConfiguration( SimpleTestConfig.class )
public class SimpleTest extends SpringRuleScenarioTest<GivenSimpleTest, WhenSimpleTest, ThenSimpleTest> {

    @Test
    @As("Simple maths calculation")
    public void adding_two_numbers_works() throws Exception {
        given().first_value_is_$number(1).and().second_value_is_$number(2);
        when().the_numbers_are_summed_up();
        then().the_sum_of_numbers_is_$expectedSum(3);
    }
}
