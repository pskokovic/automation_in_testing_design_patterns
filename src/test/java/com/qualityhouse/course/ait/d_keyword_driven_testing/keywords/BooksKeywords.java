package com.qualityhouse.course.ait.d_keyword_driven_testing.keywords;

import com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects.BooksPageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BooksKeywords {

    private WebDriver driver;

    public BooksKeywords(WebDriver webDriver) {
        driver = webDriver;
    }

    /* list of books related keywords */

    /* level 1 keywords - these keywords interact with POM layer */
    public void showBooks() {
        BooksPageObjects booksPage = new BooksPageObjects(driver);

        booksPage.openBooks();
    }

    public void searchForBook(String author, String title, String publisher, String isbn) {
        // todo: Exercise 1 - implement keyword that searches for a book with given details

        // Solution:


        BooksPageObjects booksPage = new BooksPageObjects(driver);

        booksPage.populateSearchAuthor(author);
        booksPage.populateSearchTitle(title);
        booksPage.populateSearchPublisher(publisher);
        booksPage.populateSearchISBN(isbn);
        booksPage.search();
    }

    public void showBookDetails(String title) {
        BooksPageObjects booksPage = new BooksPageObjects(driver);

        booksPage.getBookInList(title);
    }

    public void bookShouldBeListed(String title) {
        BooksPageObjects booksPage = new BooksPageObjects(driver);

        // one way of hiding Assert from non-technical stakeholders, to increase readability of test script
        Assert.assertTrue(booksPage.isBookListed(title),"Book is not in the list.");
    }

    public void bookPriceShouldBe(String price) {
        BooksPageObjects booksPage = new BooksPageObjects(driver);

        Assert.assertTrue(booksPage.getBookDetailsPrice().contains(price),"Book price is wrong.");
    }

    public void showBooksCategory(String category) {

    }

    /* level 2 keywords - these keywords interact with level 1 keywords */
    public void searchForBookWithTitle(String title) {
        searchForBook("", title, "", "");
    }

    public void showArtBooks() {
        showBooksCategory("Art");
    }

    public void showTravelBooks() {
        showBooksCategory("Travel");
    }
}
