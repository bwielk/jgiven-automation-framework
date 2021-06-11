package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.pages;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.browseractions.ClickableActions;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.browseractions.ElementCheckActions;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.browseractions.TextFieldActions;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.content.LoginPageContent;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.selector.LoginPageSelectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.commons.WebDriverComponent.getDriver;


@Component
public class LoginPage {

    @Autowired
    private InventoryPage inventoryPage;

    public LoginPage openHomePage(){
        getDriver().get("https://www.saucedemo.com/");
        return this;
    }

    public LoginPage fillUsername(String username){
        TextFieldActions.fillTextWithContent(LoginPageSelectors.USERNAME_INPUT, username);
        return this;
    }

    public LoginPage fillPassword(String password){
        TextFieldActions.fillTextWithContent(LoginPageSelectors.PASSWORD_INPUT, password);
        return this;
    }

    public InventoryPage clickLogin(){
        ClickableActions.clickElement(LoginPageSelectors.LOGIN_BUTTON);
        return inventoryPage;
    }

    public LoginPage checkLockedOutErrorMessage(){
        ElementCheckActions.checkTextDisplayed(LoginPageSelectors.ERROR_MESSAGE, LoginPageContent.LOCKED_OUT_USER_INFO);
        ElementCheckActions.checkElementDisplayed(LoginPageSelectors.ERROR_SVG);
        return this;
    }

    public LoginPage checkInvalidCredentialsErrorMessage(){
        ElementCheckActions.checkTextDisplayed(LoginPageSelectors.ERROR_MESSAGE, LoginPageContent.INVALID_CREDENTIALS);
        ElementCheckActions.checkElementDisplayed(LoginPageSelectors.ERROR_SVG);
        return this;
    }
}
