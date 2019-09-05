package com.testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SingleTest extends TestNGTest {

    @Test
    public void test() throws Exception {

        System.out.println("process test() ...");

        driver.get("https://www.browserstack.com/");

        String headerText = driver.findElement(By.id("primary-menu")).getText();
        Assert.assertTrue(headerText.contains("Sign in"));
        Assert.assertFalse(headerText.contains("Account"));

        WebElement RightDevicesLink  = driver.findElement(By.id("signupModalButton"));
        RightDevicesLink.click();

        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"Get Started For Free & Access 2000+ Mobile Devices & Browsers | BrowserStack");

        // Added this to hide the cookie policy banner that was showing at the bottom of the page in the videos to verify the test.
        //accept-cookie-notification
        WebElement acceptCookieNotification  = driver.findElement(By.id("accept-cookie-notification"));
        acceptCookieNotification.click();

        Thread.sleep(5000);

        driver.findElement(By.id("user_full_name")).sendKeys("Gerardo Ramirez");
        driver.findElement(By.id("user_email_login")).sendKeys("familiaramirez1999@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("technicalchallenge1qaz");

        /*
         * I did have problems with the checkbox and upon some research I found this thread to aide in my implmentation of checking the box and submitting the form
         * https://stackoverflow.com/questions/50061394/org-openqa-selenium-elementnotinteractableexception-element-is-not-reachable-b?noredirect=1&lq=1
         *
         */
        WebElement agreeToTerms = driver.findElement(By.id("tnc_checkbox"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",agreeToTerms);

        //
        // Confirming that the agree to terms box was indeed checked
        System.out.println("Is agreeToTerms selected: " + agreeToTerms.isSelected());

        WebElement userSubmit = driver.findElement(By.id("user_submit"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",userSubmit);



    }

}