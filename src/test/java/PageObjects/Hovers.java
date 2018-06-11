package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    private WebDriver driver;
    private By profilePic1;

    public Hovers(WebDriver driver) {
        this.driver = driver;
        profilePic1 = By.className("figure");
    }

    public void mouseoverPic1() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(profilePic1)).build().perform();
    }
}
