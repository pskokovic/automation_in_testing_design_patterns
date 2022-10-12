package com.qualityhouse.course.ait.d_keyword_driven_testing.pageobjects;

import com.qualityhouse.course.ait.d_keyword_driven_testing.support.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BooksPageObjects {

    private WebDriver driver;

    public BooksPageObjects(WebDriver webDriver) {
        driver = webDriver;
    }

    private CommonPageObjects common = new CommonPageObjects(driver);

    /* list of page components */

    private String booksPageURL = "?page=books";

    private By listOfBooksInCategory = By.cssSelector("#product-list .item");

    private By lblBookTitle = By.cssSelector("#product-list .item b");

    private By lblBookPrice = By.cssSelector("#product-list .item .buy-info-b span");

    private By lblBookDetailsPrice = By.cssSelector("#product-details > div > div.price");

    // search for book(s) fields

    private By txtAuthor = By.name("Author");

    private By txtTitle = By.name("Title");

    private By txtPublisher = By.name("Publisher");

    private By txtISBN = By.name("ISBN");

    private By btnSearchSubmit = By.cssSelector("input[type='submit']");


    /* list of page actions */

    public void openBooks() {
        Utils.waitForClickableElement(driver, common.getMenuBooks()).click();
    }

    public List<WebElement> listOfBooks() {
        return driver.findElements(listOfBooksInCategory);
    }

    public void clearSearchForm() {
        driver.findElement(txtTitle).clear();
        driver.findElement(txtAuthor).clear();
        driver.findElement(txtPublisher).clear();
        driver.findElement(txtISBN).clear();
    }

    public void search() {
        driver.findElement(btnSearchSubmit).click();
    }

    public void populateSearchTitle(String author) {
        driver.findElement(txtTitle).clear();
        driver.findElement(txtTitle).sendKeys(author);
    }

    public void populateSearchAuthor(String title) {
        driver.findElement(txtAuthor).clear();
        driver.findElement(txtAuthor).sendKeys(title);
    }

    public void populateSearchPublisher(String publisher) {
        driver.findElement(txtPublisher).clear();
        driver.findElement(txtPublisher).sendKeys(publisher);
    }

    public void populateSearchISBN(String isbn) {
        driver.findElement(txtISBN).clear();
        driver.findElement(txtISBN).sendKeys(isbn);
    }

    // returns: boolean - true if book is listed on the page
    public boolean isBookListed(String title) {
        List<WebElement> listedBooks = listOfBooks();

        boolean bookFound = false;

        for (WebElement b : listedBooks) {
            if (b.findElement(lblBookTitle).getText().equals(title)) {bookFound = true; }
        }
        return bookFound;
    }

    // returns: WebElement - pointer to wanted book listed on the page
    public WebElement getBookInList(String title) {
        List<WebElement> listedBooks = listOfBooks();

        WebElement bookFound = null;

        for (WebElement b : listedBooks) {
            if (b.findElement(lblBookTitle).getText().equals(title)) {
                bookFound = b.findElement(By.cssSelector("b"));
                bookFound.click();
            }
        }

        return bookFound;
    }

    public String getBookDetailsPrice() {
        return driver.findElement(lblBookDetailsPrice).getText().split(" ")[0];
    }

}
