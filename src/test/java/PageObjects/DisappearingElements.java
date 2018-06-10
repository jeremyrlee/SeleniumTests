package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisappearingElements {
    private WebDriver driver;
    private By gallery;

    public DisappearingElements(WebDriver driver) {
        this.driver = driver;
        gallery = By.linkText("Gallery");
    }

    public boolean isGalleryDisplayed() {
        try {
            return driver.findElement(gallery).isDisplayed();
        } catch(org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void clickGallery() {
        driver.findElement(gallery).click();
    }
}
