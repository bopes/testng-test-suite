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
        WebElement mobile = driver.findElement(By.linkText("Mobile Features"));
        mobile.click();
        Assert.assertEquals(driver.getTitle(),"All you need to test Responsive web design : Browserstack");
        WebElement section = driver.findElement(By.xpath("//*[@id=\"post-20\"]/div[1]/div/div/div/article[2]/div/div/div/div[1]"));
        String link = section.findElement(By.cssSelector("a")).getAttribute("href");
        Assert.assertEquals(link, "https://www.browserstack.com/test-on-the-right-mobile-devices");

    }
}
