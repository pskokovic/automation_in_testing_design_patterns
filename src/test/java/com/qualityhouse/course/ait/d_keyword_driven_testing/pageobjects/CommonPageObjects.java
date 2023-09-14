package com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Getter
public class CommonPageObjects {

    private WebDriver driver;

    public CommonPageObjects (WebDriver driver) {
        this.driver = driver;
    }

    /* list of page components */

    private String applicationURL = "http://acme.qualityhouse.com/build3/index.php";

    private By applicationLogo = By.cssSelector("a img[src='./application/i/logo.png']");

    // main application menu
    private By menuHome = By.cssSelector("#main-menu a[href='index.php?page=home']");

    private By menuBooks = By.cssSelector("#main-menu a[href='index.php?page=books']");

    private By menuCDs = By.cssSelector("#main-menu a[href='index.php?page=cds']");

    private By menuBasket = By.cssSelector("#main-menu a[href='index.php?page=basket']");

    private By menuRegister = By.cssSelector("#main-menu a[href='index.php?page=register']");

    public By menuLogin = By.cssSelector("#main-menu a[href='index.php?page=login']");

    private By menuEditProfile = By.cssSelector("#main-menu a[href='index.php?page=edit-profile']");

    private By menuLogout = By.cssSelector("#main-menu a[href='index.php?page=logout']");

    private By menuBasketImage = By.cssSelector("a[href='index.php?page=basket'] [src='./application/i/basket.png']");

    // common page components
    private By pageTitle = By.cssSelector("h3");

    // logout page components
    private By btnLogout = By.cssSelector("a.big-btn[href='index.php?ses_logout=1']");


    /* list of page actions */

    public void openApp() {
        driver.get(applicationURL);
    }

    public void closeApp() {
        driver.quit();
    }

    public void logout() {
        driver.findElement(menuLogout).click();
        driver.findElement(btnLogout).click();
    }

}
