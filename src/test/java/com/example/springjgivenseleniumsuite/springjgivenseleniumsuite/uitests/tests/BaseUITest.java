package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.tests;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.SpringjgivenseleniumsuiteApplication;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.commons.WebDriverComponent;
import com.tngtech.jgiven.integration.spring.SpringRuleScenarioTest;
import com.tngtech.jgiven.report.model.ExecutionStatus;
import com.tngtech.jgiven.report.model.ScenarioModel;
import org.junit.After;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringjgivenseleniumsuiteApplication.class)
public class BaseUITest<GIVEN, WHEN, THEN> extends SpringRuleScenarioTest<GIVEN, WHEN, THEN> {

    @Before
    public void launchBrowser(){
        WebDriverComponent.launchBrowser(getScenario().getScenarioModel().getTestMethodName());
    }

    @After
    public void closeBrowser(){
        ScenarioModel currentScenario = getScenario().getScenarioModel();
        System.out.println("------- The webdriver is closing --------");
        if(currentScenario.getExecutionStatus() == ExecutionStatus.SUCCESS){
            System.out.println(String.format("\n\n\nTest '%s' has successfully PASSED", currentScenario.getTestMethodName()));
        }else if(currentScenario.getExecutionStatus() == ExecutionStatus.FAILED){
            System.out.println(String.format("\n\n\nTest '%s' has FAILED", currentScenario.getTestMethodName()));
        }
        WebDriverComponent.quitDriver();
    }

}
