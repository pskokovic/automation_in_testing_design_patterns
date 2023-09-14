package com.qualityhouse.course.ait.c_data_driven_testing.tests;

import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.EditProfilePageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.LoginPageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.support.User;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class EditProfileTests {

    private WebDriver driver = WebDriverManager.chromedriver().create();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private EditProfilePageObject editProfilePage = new EditProfilePageObject(driver);

    @BeforeClass
    public void setup() { common.openApplication(); }

    @AfterClass
    public void tearDown() {
        common.closeApplication();
    }

    @Test(dataProvider = "valid user profiles", dataProviderClass = com.qualityhouse.course.ait.c_data_driven_testing.testdata.EditProfileTestData.class)
    public void tcEditProfileWithValidData(User user) {
        // todo: Exercise no. C-2.2b - create "main test script" for the valid modification of user's profile
        // note: define elements and implement actions for Edit Profile page
        // note: create data provider "valid user profiles"

        // Solution:

    }

    @Test(dataProvider = "invalid user profiles", dataProviderClass = com.qualityhouse.course.ait.c_data_driven_testing.testdata.EditProfileTestData.class)
    public void tcEditProfileWithInvalidData(User user) {
        // todo: Exercise no. C-2.3b - create "main test script" for the invalid modification of user's profile; leave mandatory fields empty
        // note: define elements and implement actions for Edit Profile page
        // note: create data provider "invalid user profiles"
        // hint: driver.switchTo().alert().dismiss()

        // Solution:

    }

}
