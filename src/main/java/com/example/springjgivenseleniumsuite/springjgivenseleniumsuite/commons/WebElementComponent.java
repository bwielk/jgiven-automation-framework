package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.commons.WebDriverComponent.getDriver;

public class WebElementComponent {

    public static WebElement getElementByCssSelector(String cssSelector){
        return getDriver().findElement(By.cssSelector(cssSelector));
    }
}
