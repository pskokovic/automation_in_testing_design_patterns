package com.qualityhouse.course.ait.e_process_driven_testing.tests;

import com.qualityhouse.course.ait.e_process_driven_testing.pageobjects.BooksPageObject;
import com.qualityhouse.course.ait.e_process_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.e_process_driven_testing.pageobjects.LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BuyBook {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private BooksPageObject bookPage = new BooksPageObject(driver);


    @BeforeClass
    public void setup() { common.openApplication(); }

    @AfterClass
    public void tearDown() {
        common.closeApplication();
    }

    @Test
    public void tcBuyBook() {
        /*
         todo: Exercise E-1.1 - create a keyword for workflow (sequence of processes) of buying a book
               sequence example: login -- search for a book -- put the book in basket -- buy the book
        */
        // note: reuse keywords from d_keyword_driven_testing keywords hierarchy

        // Solution:

    }

    @Test
    public void tcBuy3CopiesOfTheSelectedBook() {
        // todo: Exercise E-1.2 - extend the keyword created in E-1.1 to allow for buying more than one copy of the same book

        // Solution:
    }

}
