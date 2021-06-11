package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.tests;


import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.configurations.SimpleTestConfig;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.configurations.SimpleTestContext;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.simpleTest.GivenSimpleTest;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.simpleTest.ThenSimpleTest;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.simpleTest.WhenSimpleTest;
import com.tngtech.jgiven.annotation.As;
import com.tngtech.jgiven.annotation.JGivenConfiguration;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = {SimpleTestContext.class})
@WebAppConfiguration
@JGivenConfiguration( SimpleTestConfig.class )
public class SimpleTest extends BaseUITest<GivenSimpleTest, WhenSimpleTest, ThenSimpleTest> {

    @Test
    @As("Simple maths calculation")
    public void adding_two_numbers_works() throws Exception {
        given().first_value_is_$number(1).and().second_value_is_$number(2);
        when().the_numbers_are_summed_up();
        then().the_sum_of_numbers_is_$expectedSum(3);
    }
}
