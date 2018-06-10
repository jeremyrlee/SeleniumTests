package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By username;
    private By password;
    private By submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        username = By.id("username");
        password = By.id("password");
        submitButton = By.xpath("//button");
    }

    public void login(String username, String password) {
        driver.findElement(this.username).sendKeys(username);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(submitButton).click();
    }
}
