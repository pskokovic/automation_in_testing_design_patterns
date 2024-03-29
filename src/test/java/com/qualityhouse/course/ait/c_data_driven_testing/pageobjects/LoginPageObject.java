package com.qualityhouse.course.ait.c_data_driven_testing.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

    private WebDriver driver;

    public LoginPageObject (WebDriver driver) {
        this.driver = driver;
    }

    private CommonPageObjects common = new CommonPageObjects(driver);

    /* list of page components */

    public String loginPageURL = "?page=login";

    public By loginFormTitle = By.xpath("//*[@id='main-big-col']/div[1]");

    public By txtUsername = By.id("username");

    // todo: Exercise C-1.1a - implement correct selector for the password field
    public By txtPassword = By.name("");

    public By btnLogin = By.name("ses_login");


    /* list of page actions */

    public void open() {
        driver.get(common.applicationURL + loginPageURL);
    }

    public void populateUsername(String username) {
        driver.findElement(txtUsername).sendKeys(username);
    }

    public void populatePassword(String pwd) {
        // todo: Exercise C-1.1b - implement method for populating the password field
        // note: implement element for the password field

    }

    public void login() {
        driver.findElement(btnLogin).click();
    }

}
