package TestCases;

import PageObjects.DisappearingElements;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDisappearingElements {

    private WebDriver driver;
    private DisappearingElements dElementsPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");
        dElementsPage = new DisappearingElements(driver);
    }

    @After
    public void tearDown() { driver.quit(); }

    @Test
    public void findAndClickGallery() {
        int count = 0;
        // The while loop is capped at 20 times to prevent an infinite loop.
        // The chances of the Gallery link not showing up after 20 tries is over 1 in 2 million.
        while(!dElementsPage.isGalleryDisplayed() || count > 20) {
            driver.navigate().refresh();
            count++;
        }
        dElementsPage.clickGallery();
        Assert.assertEquals("https://the-internet.herokuapp.com/gallery/", driver.getCurrentUrl());
    }
}
