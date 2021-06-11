package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.integration.spring.JGivenStage;

@JGivenStage
public class GivenSimpleTest extends Stage<GivenSimpleTest> {

    @ProvidedScenarioState
    Integer number1;

    @ProvidedScenarioState
    Integer number2;

    public GivenSimpleTest first_value_is_$number(Integer number) throws Exception{
        number1 = number;
        return this;
    }

    public GivenSimpleTest second_value_is_$number(Integer number) throws Exception{
        number2 = number;
        return this;
    }
}
