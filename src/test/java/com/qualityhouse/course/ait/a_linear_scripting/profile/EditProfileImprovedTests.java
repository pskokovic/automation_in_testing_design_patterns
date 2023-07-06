package com.qualityhouse.course.ait.a_linear_scripting.profile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditProfileImprovedTests {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverManager.chromedriver().create();

        driver.get("http://acme.qualityhouse.com/build3/index.php");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();

        // login with Student1 credentials
        driver.findElement(By.id("username")).sendKeys("student1");

        driver.findElement(By.name("userpass")).sendKeys("stpass1");

        driver.findElement(By.name("ses_login")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();

        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        driver.close();
    }

    @Test
    public void editUserProfile1() {
        // navigate to Profile page
        driver.findElement(By.cssSelector("a[href='index.php?page=edit-profile']")).click();

        // modify details of Student1 profile
        driver.findElement(By.name("cEmail")).clear();
        driver.findElement(By.name("cEmail")).sendKeys("student1@example.com");

        driver.findElement(By.name("cName")).clear();
        driver.findElement(By.name("cName")).sendKeys("Student One");

        driver.findElement(By.name("cPhone")).clear();
        driver.findElement(By.name("cPhone")).sendKeys("+987654321");

        driver.findElement(By.name("cAddress")).clear();
        driver.findElement(By.name("cAddress")).sendKeys("Students Street 1\nStudents City");

        driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("body b")).getText(), "Your profile was updated successfully!");
    }

    @Test
    public void tcVerifyMandatoryFields() {
        // todo: Exercise A-2.2 - Verify that mandatory fields (E-mail, Name, Phone) do not accept empty values
        // hint: driver.switchTo().alert().dismiss();
        // note: apply Before and After methods

        // Solution:


    }

}
