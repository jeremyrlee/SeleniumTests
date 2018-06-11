package TestCases;

import PageObjects.DynamicContent;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDynamicContent {

    private WebDriver driver;
    private DynamicContent dynamicPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        dynamicPage = new DynamicContent(driver);
    }

    @After
    public void tearDown() { driver.quit(); }

    @Test
    public void forThreeAvatars() {
        Assert.assertEquals(3, dynamicPage.getAvatars().size());
    }

    @Test
    public void forThreeDescriptions() { Assert.assertEquals(3, dynamicPage.getDescriptions().size()); }
}
