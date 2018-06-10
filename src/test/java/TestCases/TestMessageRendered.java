package TestCases;

import PageObjects.NotificationMessage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMessageRendered {
    private WebDriver driver;
    private NotificationMessage notificationPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        notificationPage = new NotificationMessage(driver);
    }

    @After
    public void tearDown() { driver.quit(); }

    @Test
    public void clickingClickHere() {
        notificationPage.clickClickHereLink();
        Assert.assertTrue(notificationPage.isNotificationDisplayed());
    }
}
