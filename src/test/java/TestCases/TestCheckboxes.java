package TestCases;

import PageObjects.Checkboxes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCheckboxes {
    private WebDriver driver;
    private Checkboxes cbPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        cbPage = new Checkboxes(driver);
    }

    @After
    public void tearDown() { driver.quit(); }

    @Test
    public void turnOnCheckboxes() {
        cbPage.activateCheckbox1();
        cbPage.activateCheckbox2();
        Assert.assertTrue(cbPage.getCheckbox1() && cbPage.getCheckbox2());
    }

    @Test
    public void turnOffCheckboxes() {
        cbPage.deactivateCheckbox1();
        cbPage.deactivateCheckbox2();
        Assert.assertTrue(!cbPage.getCheckbox1() && !cbPage.getCheckbox2());
    }
}
