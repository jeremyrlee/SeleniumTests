package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class DynamicContent {
    private WebDriver driver;
    private By avatars;
    private By descriptions;

    public DynamicContent(WebDriver driver) {
        this.driver = driver;
        avatars = By.xpath("//img[contains(@src, 'Original-Facebook-Geek-Profile-Avatar')]");
        descriptions = By.xpath("//div[@class='large-10 columns']");
    }

    public List<WebElement> getAvatars() {
        return driver.findElements(avatars);
    }

    public List<String> getDescriptions() {
        List<String> descriptionsList = new ArrayList<String>();

        for (WebElement we : driver.findElements(descriptions)) {
            if(we.getText().length() > 0) {
                descriptionsList.add(we.getText());
            }
        }

        return descriptionsList;
    }
}
