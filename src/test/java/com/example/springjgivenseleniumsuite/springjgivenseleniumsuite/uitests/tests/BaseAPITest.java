package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.tests;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.SpringjgivenseleniumsuiteApplication;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.api.configuration.APIConfiguration;
import com.tngtech.jgiven.integration.spring.SpringRuleScenarioTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = APIConfiguration.class)
@SpringBootTest(classes = SpringjgivenseleniumsuiteApplication.class)
public class BaseAPITest<GIVEN, WHEN, THEN> extends SpringRuleScenarioTest<GIVEN, WHEN, THEN> {

}
