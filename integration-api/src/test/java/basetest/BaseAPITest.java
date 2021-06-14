package basetest;

import api.SpringjgivenseleniumsuiteApplication;
import api.configuration.APIConfiguration;
import com.tngtech.jgiven.integration.spring.SpringRuleScenarioTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = APIConfiguration.class)
@SpringBootTest(classes = SpringjgivenseleniumsuiteApplication.class)
public class BaseAPITest<GIVEN, WHEN, THEN> extends SpringRuleScenarioTest<GIVEN, WHEN, THEN> {

}
