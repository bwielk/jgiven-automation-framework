package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.uiTest;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.constants.StaticUserData;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.pages.LoginPage;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.integration.spring.JGivenStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

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
