package com.qualityhouse.course.ait.d_keyword_driven_testing.tests;

import com.qualityhouse.course.ait.d_keyword_driven_testing.keywords.BooksKeywords;
import com.qualityhouse.course.ait.d_keyword_driven_testing.keywords.CommonAppKeywords;
import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.BooksData;
import com.qualityhouse.course.ait.d_keyword_driven_testing.testdata.models.Book;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FindBookTests {

    private WebDriver driver = new ChromeDriver();

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

        // todo: Exercise 1 - implement keyword for book search (check the method for solution)
        books.searchForBook("", "", "Nature Books Ltd.", "");

        books.bookShouldBeListed("Autumn Colors");
    }

    @Test
    public void tcVerifyDetailsOfFoundBook() {
        // todo: Exercise no. 2 - search for a book with title "The miracles of the Nature"

        // Solution - in this example we didn't use predefined data, to demonstrate how to use very complex data sets:


        Book book = booksData.getMiraclesOfNature();

        common.loginWithValidCredentials();

        books.showBooks();

        books.searchForBookWithTitle(book.getTitle());

        books.bookShouldBeListed(book.getTitle());
    }

    @Test
    public void tcVerifyBookPrice() {
        // todo: Exercise no. 3 - develop keyword to easy verify given book price

        // Solution - in this example we didn't use predefined data, to demonstrate specification by example approach:


        common.loginWithValidCredentials();

        books.showBooks();

        books.searchForBookWithTitle("Become a Mogul");

        books.showBookDetails("Become a Mogul");

        books.bookPriceShouldBe("19.99");

    }
}
