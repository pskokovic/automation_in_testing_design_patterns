package com.qualityhouse.course.ait.c_data_driven_testing.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class EditProfilePageObject {

    private WebDriver driver;

    public EditProfilePageObject (WebDriver driver) {
        this.driver = driver;
    }

    private CommonPageObjects common = new CommonPageObjects(driver);

    /* list of page components */
    public String editProfilePageURL = "?page=edit-profile";

    // todo: Exercise no. 2.a - list necessary  page components

    // Solution:


    public By txtEmail = By.name("cEmail");

    public By txtName = By.name("cName");

    public By txtPhone = By.name("cPhone");

    public By txtAddress = By.name("cAddress");

    public By btnSubmit = By.cssSelector("input[type='submit'][value='Submit']");

    public By txtMessage = By.cssSelector("body b");


    /* list of page actions */
    public void open() {
        driver.get(common.applicationURL + editProfilePageURL);
    }

    // todo: Exercise no. 2.b - list necessary  page actions

    // Solution:


    public void populateEmail(String email) {

    }

    public void populateName(String name) {

    }

    public void populatePhone(String phone) {

    }

    public void populateAddress(String address) {

    }

    public void submitProfile(){

    }

}
