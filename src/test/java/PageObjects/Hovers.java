package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    private WebDriver driver;
    private By profilePic1;
    private By user1Name;

    public Hovers(WebDriver driver) {
        this.driver = driver;
        profilePic1 = By.className("figure");
        user1Name = By.xpath("//div[@class='figcaption']/h5");
    }

    public void mouseoverPic1() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(profilePic1)).build().perform();
    }

    public String getUser1Name() {
        String caption = driver.findElement(user1Name).getText();
        caption = caption.substring(caption.indexOf(' ') + 1);
        return caption;
    }
}
