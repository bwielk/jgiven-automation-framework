package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverComponent {

    public static ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();

    public static void launchBrowser(String nameOfTestMethod){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("name", nameOfTestMethod);
        capabilities.setCapability("elementScrollBehavior", true);

        WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker().enableVnc().enableRecording();
        WebDriver driver = wdm.create();
        webdriver.set(driver);
    }

    public static WebDriver getDriver() {
        return webdriver.get();
    }

    public static void quitDriver() {
        if(webdriver.get() != null){
            webdriver.get().quit();
            webdriver.set(null);
        }
    }

}
