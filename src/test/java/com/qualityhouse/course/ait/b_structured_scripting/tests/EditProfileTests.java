package com.qualityhouse.course.ait.b_structured_scripting.tests;

import com.qualityhouse.course.ait.b_structured_scripting.library.CommonLib;
import com.qualityhouse.course.ait.b_structured_scripting.library.EditProfileLib;
import com.qualityhouse.course.ait.b_structured_scripting.library.LoginLib;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditProfileTests {

    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = CommonLib.openBrowser();

        CommonLib.navigateToApp(driver);
    }

    @AfterMethod
    public void tearDown() {
        CommonLib.closeBrowser(driver);
    }

    @Test
    public void editProfileUser1() {
        // todo: Exercise no. 3.b - modify profile details of Student1

        // Solution:


        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student1", "stpass1");

        EditProfileLib.navigateToProfilePage(driver);

        EditProfileLib.updateProfile(driver, "student1_new@example.com", "Student F. One", "+987654321", "Students New Street 1\nStudents New City");

        CommonLib.logoutFromApp(driver);
    }
}
