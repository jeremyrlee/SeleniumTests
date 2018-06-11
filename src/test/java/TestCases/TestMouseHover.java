package TestCases;

import PageObjects.Hovers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMouseHover {

    private WebDriver driver;
    private Hovers hoverPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        hoverPage = new Hovers(driver);
    }

    @After
    public void tearDown() { driver.quit(); }

    @Test
    public void hoverOverFirstPicture() {
        hoverPage.mouseoverPic1();
        Assert.assertTrue(driver.findElement(By.className("figcaption")).isDisplayed());
    }

    @Test
    public void validateUser1Name() {
        hoverPage.mouseoverPic1();
        Assert.assertEquals("user1", hoverPage.getUser1Name());
    }
}
