package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class DynamicContent {
    private WebDriver driver;
    private By avatars;

    public DynamicContent(WebDriver driver) {
        this.driver = driver;
        avatars = By.xpath("//img[contains(@src, 'Original-Facebook-Geek-Profile-Avatar')]");
    }

    public List<WebElement> getAvatars() {
        return driver.findElements(avatars);
    }
}
