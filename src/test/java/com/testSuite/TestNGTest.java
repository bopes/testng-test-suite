package com.testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestNGTest {
    public WebDriver driver;

    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}
