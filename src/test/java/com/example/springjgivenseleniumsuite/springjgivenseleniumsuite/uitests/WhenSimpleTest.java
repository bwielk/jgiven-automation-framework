package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests;

import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.integration.spring.JGivenStage;

@JGivenStage
public class WhenSimpleTest {

    @ProvidedScenarioState
    Integer sum;

    @ExpectedScenarioState
    Integer number1;

    @ExpectedScenarioState
    Integer number2;

    public WhenSimpleTest the_numbers_are_summed_up(){
        sum = number1 + number2;
        return this;
    }
}
