package com.testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends TestNGTest {

    @Test
    public void test() throws Exception {

        driver.get("https://www.browserstack.com/");
        String headerText = driver.findElement(By.id("primary-menu")).getText();
        Assert.assertTrue(headerText.contains("Sign in"));
        Assert.assertFalse(headerText.contains("Account"));

        WebElement RightDevicesLink  = driver.findElement(By.id("signupModalButton"));
        RightDevicesLink.click();

        Assert.assertEquals(driver.getTitle(),"Get Started For Free & Access 2000+ Mobile Devices & Browsers | BrowserStack");
    }
}
