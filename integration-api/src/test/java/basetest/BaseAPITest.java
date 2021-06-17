package basetest;

import api.SpringjgivenfeignsuiteApplication;
import api.components.configuration.APIConfiguration;
import com.tngtech.jgiven.integration.spring.SpringRuleScenarioTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = APIConfiguration.class)
@SpringBootTest(classes = SpringjgivenfeignsuiteApplication.class)
public class BaseAPITest<GIVEN, WHEN, THEN> extends SpringRuleScenarioTest<GIVEN, WHEN, THEN> {

}
