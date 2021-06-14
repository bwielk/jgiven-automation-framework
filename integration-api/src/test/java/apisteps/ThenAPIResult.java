package apisteps;

import api.model.PersonsDTO;
import api.services.ReqResServiceImpl;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.integration.spring.JGivenStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@JGivenStage
public class ThenAPIResult extends Stage<ThenAPIResult> {

    @Autowired
    @Lazy
    private ReqResServiceImpl reqResService;

    @ProvidedScenarioState
    PersonsDTO personsDTO;

    public ThenAPIResult the_total_number_of_users_is_$number(int number){
        assert personsDTO.getData().size() == number;
        return this;
    }


}
