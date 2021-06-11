package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.pages;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.browseractions.ElementCheckActions;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.content.InventoryPageContent;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.selector.InventoryPageSelectors;
import org.springframework.stereotype.Component;

@Component
public class InventoryPage {

    public InventoryPage checkCartButtonIsVisible(){
        ElementCheckActions.checkElementDisplayed(InventoryPageSelectors.CART_CONTAINER);
        return this;
    }

    public InventoryPage checkHeaderIsDisplayed(){
        ElementCheckActions.checkTextDisplayed(InventoryPageSelectors.PAGE_TITLE, InventoryPageContent.INVENTORY_HEADER);
        return this;
    }
}
