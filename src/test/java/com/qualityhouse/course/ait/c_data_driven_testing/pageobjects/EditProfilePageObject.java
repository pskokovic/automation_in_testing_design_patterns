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

    // todo: Exercise C-2.1a - define needed page components

    // Solution:


    /* list of page actions */

    public void open() {
        driver.get(common.applicationURL + editProfilePageURL);
    }

    // todo: Exercise C-2.1b - implement needed page actions

    // Solution:


}
