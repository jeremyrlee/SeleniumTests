package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkboxes {
    private WebDriver driver;
    private By checkbox1;
    private By checkbox2;

    public Checkboxes(WebDriver driver) {
        this.driver = driver;
        checkbox1 = By.xpath("//input[@type='checkbox'][1]");
        checkbox2 = By.xpath("//input[@type='checkbox'][2]");
    }

    public boolean getCheckbox1() {
        return driver.findElement(checkbox1).isSelected();
    }

    public boolean getCheckbox2() {
        return driver.findElement(checkbox2).isSelected();
    }

    public void activateCheckbox1() {
        if (!driver.findElement(checkbox1).isSelected()) {
            driver.findElement(checkbox1).click();
        }
    }

    public void activateCheckbox2() {
        if (!driver.findElement(checkbox2).isSelected()) {
            driver.findElement(checkbox2).click();
        }
    }

    public void deactivateCheckbox1() {
        if (driver.findElement(checkbox1).isSelected()) {
            driver.findElement(checkbox1).click();
        }
    }


    public void deactivateCheckbox2() {
        if (driver.findElement(checkbox2).isSelected()) {
            driver.findElement(checkbox2).click();
        }
    }
}
