package apisteps;

import api.model.PersonsDTO;
import api.services.ReqResServiceImpl;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.integration.spring.JGivenStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@JGivenStage
public class WhenAPIAction extends Stage<WhenAPIAction> {

    @Autowired
    @Lazy
    private ReqResServiceImpl reqResService;

    @ExpectedScenarioState
    PersonsDTO personsDTO;

    public WhenAPIAction a_user_requests_all_users(){
        this.personsDTO = reqResService.getPersons();
        return this;
    }
}
