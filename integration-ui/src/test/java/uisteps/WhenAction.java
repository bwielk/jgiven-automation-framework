package uisteps;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.integration.spring.JGivenStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import ui.constants.StaticUserData;
import ui.pages.LoginPage;

@JGivenStage
public class WhenAction extends Stage<WhenAction> {

    @Autowired
    @Lazy
    private LoginPage loginPage;

    public WhenAction the_user_enters_valid_credentials(){
        loginPage.fillUsername(StaticUserData.STANDARD_USER.getUsername());
        loginPage.fillPassword(StaticUserData.STANDARD_USER.getPassword());
        loginPage.clickLogin();
        return this;
    }
}
