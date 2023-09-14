package com.qualityhouse.course.ait.e_process_driven_testing.tests;

import com.qualityhouse.course.ait.e_process_driven_testing.pageobjects.BooksPageObject;
import com.qualityhouse.course.ait.e_process_driven_testing.pageobjects.CommonPageObjects;
import com.qualityhouse.course.ait.e_process_driven_testing.pageobjects.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BuyBookTests {

    private WebDriver driver = WebDriverManager.chromedriver().create();

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
         todo: Exercise no. 1 - create a procedure, readable by end users, to buy a book
                loginSuccessfully();
                searchForBook();
                putTheBookInBasket();
                buyTheBook();
        */
    }

    @Test
    public void tcBuy3CopiesOfTheBook() {
        // todo: Exercise no. 2 - create a procedure, readable by end users, to buy several copies of one book

    }

}
