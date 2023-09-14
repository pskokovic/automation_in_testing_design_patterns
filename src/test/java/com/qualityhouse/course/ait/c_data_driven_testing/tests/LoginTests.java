package com.qualityhouse.course.ait.c_data_driven_testing.tests;

import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.c_data_driven_testing.pageobjects.LoginPageObject;
import com.qualityhouse.course.ait.c_data_driven_testing.support.User;
import com.qualityhouse.course.ait.c_data_driven_testing.support.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTests {

    private WebDriver driver = WebDriverManager.chromedriver().create();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    @BeforeClass
    public void setup() {
        common.openApplication();
    }

    @AfterClass
    public void tearDown() {
        common.closeApplication();
    }

    @Test(dataProvider = "valid users", dataProviderClass = com.qualityhouse.course.ait.c_data_driven_testing.testdata.LoginTestData.class)
    public void tcLoginWithValidCredentials(User user) {
        loginPage.open();
        loginPage.populateUsername(user.getUsername());

        // note: implement populatePassword method
        loginPage.populatePassword(user.getPassword());

        loginPage.login();
        Assert.assertTrue(Utils.isPresent(driver, common.menuLogout), "User is not logged in.");
        common.logout();
    }

    @Test(dataProvider = "invalid credentials", dataProviderClass = com.qualityhouse.course.ait.c_data_driven_testing.testdata.LoginTestData.class)
    public void tcLoginWithInvalidCredentials(User user) {
        // todo: Exercise C-1.2 - login 3 times with username StudentX {X=1..10} by using wrong password; check for warning message

        // Solution:

    }

}
