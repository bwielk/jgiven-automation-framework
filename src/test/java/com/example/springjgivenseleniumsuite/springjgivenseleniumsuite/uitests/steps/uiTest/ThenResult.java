package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.uitests.steps.uiTest;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.pages.InventoryPage;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.integration.spring.JGivenStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@JGivenStage
public class ThenResult extends Stage<ThenResult> {

    @Autowired
    @Lazy
    private InventoryPage inventoryPage;

    public ThenResult the_user_can_view_the_inventory_page(){
        inventoryPage.checkCartButtonIsVisible();
        inventoryPage.checkCartButtonIsVisible();
        return this;
    }

}
