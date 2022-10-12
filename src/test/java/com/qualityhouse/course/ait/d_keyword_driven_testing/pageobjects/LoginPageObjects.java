package com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {

    private WebDriver driver;

    public LoginPageObjects(WebDriver webDriver) {
        driver = webDriver;
    }

    private CommonPageObjects common = new CommonPageObjects(driver);

    /* list of page components */

    private String loginPageURL = "?page=login";

    private By txtUsername = By.id("username");

    private By txtPassword = By.name("userpass");

    private By btnLogin = By.name("ses_login");


    /* list of page actions */

    public void open() {
        driver.get(common.getApplicationURL() + loginPageURL);
    }

    public void populateUsername(String username) {
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void populatePassword(String pwd) {
        driver.findElement(txtPassword).sendKeys(pwd);
    }

    public void login() {
        driver.findElement(btnLogin).click();
    }

}
