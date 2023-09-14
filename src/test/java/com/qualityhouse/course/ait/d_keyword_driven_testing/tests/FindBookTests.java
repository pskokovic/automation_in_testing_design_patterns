package com.qualityhouse.course.ait.d_keyword_driven_testing.tests;

import com.qualityhouse.course.ait.d_keyword_driven_testing.keywords.BooksKeywords;
import com.qualityhouse.course.ait.d_keyword_driven_testing.keywords.CommonAppKeywords;
import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.BooksData;
import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.models.Book;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class FindBookTests {

    private WebDriver driver = WebDriverManager.chromedriver().create();

    private CommonAppKeywords common = new CommonAppKeywords(driver);

    private BooksKeywords books = new BooksKeywords(driver);

    private BooksData booksData = new BooksData();


    @BeforeClass
    public void setup() {
        common.openApplication();
    }

    @AfterClass
    public void tearDown() {
        common.closeApplication();
    }

    @Test
    public void tcVerifyIfBookIsInSearchResult() {
        common.loginWithValidCredentials();

        books.showBooks();

        // todo: Exercise D-1.1b - implement keyword for book search (check the method for solution)

    }

    @Test
    public void tcVerifyDetailsOfFoundBook() {
        // todo: Exercise D-1.2 - search for a book with title "The miracles of the Nature"

        // Solution:

    }

    @Test
    public void tcVerifyBookPrice() {
        // todo: Exercise D-1.3 - develop keyword to easy verify given book price

        // Solution:

    }
}
