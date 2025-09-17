package com.qualityhouse.course.ait.a_linear_scripting.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {

    @Test
    public void tcLoginUser1 () {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("http://acme.qualityhouse.com/build3/index.php");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();
        driver.findElement(By.id("username")).sendKeys("student1");
        driver.findElement(By.name("userpass")).sendKeys("stpass1");
        driver.findElement(By.name("ses_login")).click();

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();
        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User is not logged out.");

        driver.quit();
    }

    @Test
    public void tcLoginUser2 () {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("http://acme.qualityhouse.com/build3/index.php");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();
        driver.findElement(By.id("username")).sendKeys("student2");
        driver.findElement(By.name("userpass")).sendKeys("stpass2");
        driver.findElement(By.name("ses_login")).click();

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();
        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User is not logged out.");

        driver.quit();
    }

    @Test
    public void tcLoginUser3 () {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("http://acme.qualityhouse.com/build3/index.php");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();
        driver.findElement(By.id("username")).sendKeys("student3");
        driver.findElement(By.name("userpass")).sendKeys("stpass3");
        driver.findElement(By.name("ses_login")).click();

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();
        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed(), "User is not logged out.");

        driver.quit();
    }

    @Test
    public void tcTooManyUnsuccessfulLogins() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.get("http://acme.qualityhouse.com/build3/index.php");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();

        driver.findElement(By.id("username")).sendKeys("student1");
        driver.findElement(By.name("userpass")).sendKeys("");
        driver.findElement(By.name("ses_login")).click();

        Thread.sleep(500);

        driver.findElement(By.id("username")).sendKeys("student1");
        driver.findElement(By.name("userpass")).sendKeys("wrong");
        driver.findElement(By.name("ses_login")).click();

        Thread.sleep(500);

        driver.findElement(By.id("username")).sendKeys("student1");
        driver.findElement(By.name("userpass")).sendKeys("wrong_again");
        driver.findElement(By.name("ses_login")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("b.err")).isDisplayed(), "Warning message is not displayed.");

        driver.quit();
    }

    @Test
    public void tcLoginWithSeveralUsers() {
        // todo: Exercise A-1.1 - perform login (and logout) of three users (student1, student2, student3), sequentially

        // Solution:


    }

}
