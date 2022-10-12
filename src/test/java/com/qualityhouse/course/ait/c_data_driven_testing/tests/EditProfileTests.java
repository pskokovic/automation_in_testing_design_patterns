package com.qualityhouse.course.ait.c_data_driven_testing.tests;

import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.EditProfilePageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.LoginPageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.support.User;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class EditProfileTests {

    private WebDriver driver = new ChromeDriver();

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
        // todo: Exercise no. 3 - create "main test script" for the valid modification of user's profile

        // Solution:


        loginPage.open();
        loginPage.populateUsername(user.getUsername());
        loginPage.populatePassword(user.getPassword());
        loginPage.login();

        editProfilePage.open();
        editProfilePage.populateEmail(user.getEmail());
        editProfilePage.populateName(user.getName());
        editProfilePage.populatePhone(user.getPhone());
        editProfilePage.populateAddress(user.getAddress());
        editProfilePage.submitProfile();

        Assert.assertEquals(driver.findElement(editProfilePage.txtMessage).getText(), "Your profile was updated successfully!");
        common.logout();
    }

    @Test(dataProvider = "invalid user profiles", dataProviderClass = com.qualityhouse.course.ait.c_data_driven_testing.testdata.EditProfileTestData.class)
    public void tcEditProfileWithInvalidData(User user) {
        // todo: Exercise no. 4.b - create "main test script" for the invalid modification of user's profile; leave mandatory fields empty
        // hint: driver.switchTo().alert().dismiss()

        // Solution:


        loginPage.open();
        loginPage.populateUsername(user.getUsername());
        loginPage.populatePassword(user.getPassword());
        loginPage.login();

        editProfilePage.open();
        editProfilePage.populateEmail(user.getEmail());
        editProfilePage.populateName(user.getName());
        editProfilePage.populatePhone(user.getPhone());
        editProfilePage.populateAddress(user.getAddress());
        editProfilePage.submitProfile();

        Alert alert = driver.switchTo().alert();
        // NOTE: this assertion fails, as the Address seems not to be mandatory, although it should be - have we found a bug? :)
        Assert.assertTrue(alert.getText().contains("Please fill all required fields!"));
        alert.dismiss();

        common.logout();
    }

}
