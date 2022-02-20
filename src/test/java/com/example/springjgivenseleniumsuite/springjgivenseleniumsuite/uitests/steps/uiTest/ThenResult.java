package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.uiTest;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.pages.InventoryPage;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.pages.LoginPage;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.integration.spring.JGivenStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@JGivenStage
public class ThenResult extends Stage<ThenResult> {

    @Autowired
    @Lazy
    private InventoryPage inventoryPage;
    @Autowired
    @Lazy
    private LoginPage loginPage;

    public ThenResult the_user_can_view_the_inventory_page(){
        inventoryPage.checkCartButtonIsVisible();
        inventoryPage.checkCartButtonIsVisible();
        return this;
    }

    public ThenResult the_user_can_see_the_error_message_for_a_failed_login_attempt(){
        loginPage.checkLockedOutErrorMessage();
        return this;
    }

}
