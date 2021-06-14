package apisteps;

import api.services.ReqResServiceImpl;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.integration.spring.JGivenStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@JGivenStage
public class GivenAPIState extends Stage<GivenAPIState> {

    @Autowired
    @Lazy
    private ReqResServiceImpl reqResService;

    public GivenAPIState a_user_is_a_valid_user(){
        System.out.println("A user is a valid user");
        return this;
    }

}
