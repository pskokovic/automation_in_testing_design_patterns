package com.qualityhouse.course.ait.a_linear_scripting.profile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditProfileTests {

    @Test
    public void editUserProfile1() {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("http://acme.qualityhouse.com/build3/index.php");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();

        // login with Student1 credentials
        driver.findElement(By.id("username")).sendKeys("student1");

        driver.findElement(By.name("userpass")).sendKeys("stpass1");

        driver.findElement(By.name("ses_login")).click();

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

        // logout
        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();

        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();

        driver.quit();
    }

    @Test
    public void tcVerifyMandatoryFields() {
        // todo: Exercise no. 2 - Verify that mandatory fields (E-mail, Name, Phone,Address) do not accept empty values
        // hint: driver.switchTo().alert().dismiss();

        // Solution:


        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("http://acme.qualityhouse.com/build3/index.php");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();

        // login with Student1 credentials
        driver.findElement(By.id("username")).sendKeys("student1");

        driver.findElement(By.name("userpass")).sendKeys("stpass1");

        driver.findElement(By.name("ses_login")).click();

        // navigate to Profile page
        driver.findElement(By.cssSelector("a[href='index.php?page=edit-profile']")).click();

        // verify if E-mail is mandatory
        driver.findElement(By.name("cEmail")).clear();

        driver.findElement(By.name("cName")).clear();
        driver.findElement(By.name("cName")).sendKeys("Student One");

        driver.findElement(By.name("cPhone")).clear();
        driver.findElement(By.name("cPhone")).sendKeys("+987654321");

        driver.findElement(By.name("cAddress")).clear();
        driver.findElement(By.name("cAddress")).sendKeys("Students Street 1\nStudents City");

        driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();

        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Please fill all required fields!"));
        alert.dismiss();

        // verify if Name is mandatory
        driver.findElement(By.name("cEmail")).clear();
        driver.findElement(By.name("cEmail")).sendKeys("student1@example.com");

        driver.findElement(By.name("cName")).clear();

        driver.findElement(By.name("cPhone")).clear();
        driver.findElement(By.name("cPhone")).sendKeys("+987654321");

        driver.findElement(By.name("cAddress")).clear();
        driver.findElement(By.name("cAddress")).sendKeys("Students Street 1\nStudents City");

        driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();

        alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Please fill all required fields!"));
        alert.dismiss();

        // verify if Phone is mandatory
        driver.findElement(By.name("cEmail")).clear();
        driver.findElement(By.name("cEmail")).sendKeys("student1@example.com");

        driver.findElement(By.name("cName")).clear();
        driver.findElement(By.name("cName")).sendKeys("Student One");

        driver.findElement(By.name("cPhone")).clear();

        driver.findElement(By.name("cAddress")).clear();
        driver.findElement(By.name("cAddress")).sendKeys("Students Street 1\nStudents City");

        driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();

        alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Please fill all required fields!"));
        alert.dismiss();

        // verify if Address is mandatory
        driver.findElement(By.name("cEmail")).clear();
        driver.findElement(By.name("cEmail")).sendKeys("student1@example.com");

        driver.findElement(By.name("cName")).clear();
        driver.findElement(By.name("cName")).sendKeys("Student One");

        driver.findElement(By.name("cPhone")).clear();
        driver.findElement(By.name("cPhone")).sendKeys("+987654321");

        driver.findElement(By.name("cAddress")).clear();

        driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();

        alert = driver.switchTo().alert();
        // NOTE: this assertion fails, as the Address seems not to be mandatory, although it should be - have we found a bug? :)
        Assert.assertTrue(alert.getText().contains("Please fill all required fields!"));
        alert.dismiss();

        driver.quit();
    }
}
