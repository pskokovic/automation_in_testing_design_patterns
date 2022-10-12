package com.qualityhouse.course.ait.b_structured_scripting.library;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditProfileLib {

    private final static Logger logger = LogManager.getLogger(EditProfileLib.class);

    // todo: Exercise no. 3.a - create method for editing profile

    // Solution:


    public static void navigateToProfilePage(WebDriver driver) {
        logger.info("navigate to profile page");

        driver.findElement(By.cssSelector("a[href='index.php?page=edit-profile']")).click();
    }

    public static void updateProfile(WebDriver driver, String email, String name, String phone, String address) {
        logger.info("update user's profile - email = " + email + ", name = " + name + ", phone = " + phone + ", address = " + address);

        driver.findElement(By.name("cEmail")).clear();
        driver.findElement(By.name("cEmail")).sendKeys(email);

        driver.findElement(By.name("cName")).clear();
        driver.findElement(By.name("cName")).sendKeys(name);

        driver.findElement(By.name("cPhone")).clear();
        driver.findElement(By.name("cPhone")).sendKeys(phone);

        driver.findElement(By.name("cAddress")).clear();
        driver.findElement(By.name("cAddress")).sendKeys(address);

        driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();
    }

}
