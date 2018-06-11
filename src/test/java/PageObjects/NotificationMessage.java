package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMessage {
    private WebDriver driver;
    private By clickHere;
    private By notification;

    public NotificationMessage(WebDriver driver) {
        this.driver = driver;
        clickHere = By.linkText("Click here");
        notification = By.id("flash");
    }

    public void clickClickHereLink() {
        driver.findElement(clickHere).click();
    }

    public boolean isNotificationDisplayed() {
        try {
            return driver.findElement(notification).isDisplayed();
        } catch(org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
