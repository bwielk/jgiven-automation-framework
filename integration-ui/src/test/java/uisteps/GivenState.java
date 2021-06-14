package uisteps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.integration.spring.JGivenStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import ui.pages.LoginPage;

@JGivenStage
public class GivenState extends Stage<GivenState> {

    @Autowired
    @Lazy
    private LoginPage loginPage;

    public GivenState a_user_has_opened_the_login_page(){
        loginPage.openHomePage();
        return this;
    }
}
