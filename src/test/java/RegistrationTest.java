import Utils.BrowserUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

public class RegistrationTest {

    WebDriver driver;
    String browser = "chrome";

    @BeforeTest
    public void beforeTest () {
        if (browser.toLowerCase().equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if (browser.toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if (browser.toLowerCase().equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }

    @DataProvider (name = "registrationData")
    public Iterator<Object[]> registrationDataProvider() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[] {"anamaria", "dflkml23344", "", "anamaria", "ichim", "ana.ichim@yahoo.com"});
        dp.add(new String[] {"anamaria", "jgjghgf", "dflkml23344", "anamaria", "ichim", "ana.ichim@yahoo.com"});
        dp.add(new String[] {"anamaria", "", "dflkml23344", "anamaria", "ichim", "ana.ichim@yahoo.com"});
        dp.add(new String[] {"anamaria", "", "dflkml23344", "", "ichim", ""});
        return dp.iterator();
    }

    @Test(dataProvider = "registrationData")
    public void registrationTest (String username, String password, String password2, String firstname, String lastname, String email) {

        driver.get("https://adimoldovan.github.io/web-stubs/signup");
        Assert.assertEquals(driver.findElement(By.cssSelector("#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > p")).getText(), "Your login information");
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement password2Input = driver.findElement(By.id("password2"));
        WebElement titleMrInput = driver.findElement(By.id("Mr"));
        WebElement titleMsInput = driver.findElement(By.id("Ms"));
        WebElement firstnameInput = driver.findElement(By.id("input-first-name"));
        WebElement lastnameInput = driver.findElement(By.id("input-last-name"));
        WebElement emailInput = driver.findElement(By.id("input-email"));
        List<WebElement> calendarElements = driver.findElements(By.className("form-control"));
        WebElement nationalityInput = driver.findElement(By.id("input-nationality"));
        WebElement acceptInput = driver.findElement(By.xpath("//*[@id=\"terms\"]"));
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        password2Input.clear();
        password2Input.sendKeys(password2);
        titleMrInput.click();
        firstnameInput.clear();
        firstnameInput.sendKeys(firstname);
        lastnameInput.clear();
        lastnameInput.sendKeys(lastname);
        emailInput.clear();
        emailInput.sendKeys(email);
        calendarElements.get(6).isSelected();
        nationalityInput.isSelected();
        acceptInput.isSelected();

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[12]/button"));
        submitButton.submit();

        WebElement errorText = BrowserUtilities.waitForGenericElement(driver, By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/small[2]"), 10);
        String errMsg = "Passwords do not match";
        Assert.assertEquals(errorText.getText(), errMsg);
    }



}
