package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.integration.spring.JGivenStage;

@JGivenStage
public class ThenSimpleTest extends Stage<ThenSimpleTest> {

    @ExpectedScenarioState
    Integer sum;

    public ThenSimpleTest the_sum_of_numbers_is_$expectedSum(Integer expectedSum){
        assert sum == expectedSum;
        return this;
    }

}
