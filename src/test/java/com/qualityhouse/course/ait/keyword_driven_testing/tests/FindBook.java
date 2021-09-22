package com.qualityhouse.course.ait.keyword_driven_testing.tests;

import com.qualityhouse.course.ait.keyword_driven_testing.pageobjects.BooksPageObject;
import com.qualityhouse.course.ait.keyword_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.keyword_driven_testing.pageobjects.LoginPageObject;
import org.junit.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBook {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private BooksPageObject bookPage = new BooksPageObject(driver);


    @Before
    public void setup() { common.openApplication(); }

    @After
    public void tearDown() {
        common.closeApplication();
    }

    @Test
    public void tcVerifyIfBookIsInSearchResult() {
        loginPage.loginWithValidCredentials();

        bookPage.openBooks();

        // todo: implement this keyword
        bookPage.searchForBook("", "", "Nature Books Ltd.", "");

        Assert.assertTrue("Book is not in the list!", bookPage.isBookInList("Autumn Colors"));
    }

    @Test
    public void tcVerifyDetailsOfFoundBook() {
        // todo: Exercise no. 2 - search for a book with title "The miracles of the Nature" and list its details

    }

    @Test
    public void tcVerifyBookPrice() {
        // todo: Exercise no. 3 - develop keyword to easy verify given book price
    }
}
