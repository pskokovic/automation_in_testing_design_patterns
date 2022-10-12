package com.qualityhouse.course.ait.d_keyword_driven_testing.keywords;

import com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects.LoginPageObjects;
import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.UsersData;
import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.models.User;
import org.openqa.selenium.WebDriver;

public class CommonAppKeywords {

    private WebDriver driver;

    public CommonAppKeywords(WebDriver webDriver) {
        driver = webDriver;
    }

    private UsersData users = new UsersData();

    /* list of application related keywords */

    /* level 1 keywords - these keywords interact with POM layer */
    public void openApplication() {
        CommonPageObjects commonPageObjects = new CommonPageObjects(driver);

        commonPageObjects.openApp();
    }

    public void closeApplication() {
        CommonPageObjects commonPageObjects = new CommonPageObjects(driver);

        commonPageObjects.closeApp();
    }

    /* list of login/logout related keywords */

    public void logout() {
        CommonPageObjects commonPageObjects = new CommonPageObjects(driver);

        commonPageObjects.logout();
    }

    /* level 1 keywords - these keywords interact with POM layer */
    public void loginAs(String username, String password) {
        LoginPageObjects loginPage = new LoginPageObjects(driver);

        loginPage.open();

        loginPage.populateUsername(username);

        loginPage.populatePassword(password);

        loginPage.login();
    }

    /* level 2 keywords - these keywords interact with level 1 keywords */
    public void loginWithValidCredentials() {
        User user = users.getStudent1();

        loginAs(user.getUsername(), user.getPassword());
    }

    public void loginWithInvalidCredentials() {
        User user = users.getUserWithWrongPassword();

        loginAs(user.getUsername(), user.getPassword());
    }

}
