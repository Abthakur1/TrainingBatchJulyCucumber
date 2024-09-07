package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class qaPracticeApp {
    public static WebDriver driver;

    @Given("I do the selenium setup")
    public void iDoTheSeleniumSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Given("I launch to the app")
    public void iLaunchToTheApp() {
        driver.get("https://qa-practice.netlify.app/");
    }

    @When("I go to login page")
    public void iGoToLoginPage() {
        driver.findElement(By.xpath("//a[@id='auth-shop']")).click();
    }

    @And("I enter username in email field")
    public void iEnterUsernameInEmailField() {
        driver.findElement(By.id("email")).sendKeys("admin@admin.com");

    }

    @And("I enter password in the password field")
    public void iEnterPasswordInThePasswordField() {
        driver.findElement(By.id("password")).sendKeys("admin123");
        
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        driver.findElement(By.id("submitLoginBtn")).click();
        
    }

    @Then("I verify that Shopping Cart page is displayed")
    public void iVerifyThatShoppingCartPageIsDisplayed() {
       boolean isLoginSuccessful=  driver.findElement(By.xpath("//h2[text()='SHOPPING CART']")).isDisplayed();
        Assert.assertTrue(isLoginSuccessful);
    }


    @And("I close the browser")
    public void iCloseTheBrowser() {
        driver.quit();
    }

    @When("I click Buttons option")
    public void iClickButtonsOption() {
        driver.findElement(By.id("buttons")).click();
        
    }

    @And("I click on checkboxes option")
    public void iClickOnCheckboxesOption() {
        driver.findElement(By.id("checkboxes")).click();
        
    }

    @Then("I verify that checkboxes are displayed")
    public void iVerifyThatCheckboxesAreDisplayed() {
        boolean checkboxesDisplayed= driver.findElement(By.xpath("//h2[text()='Checkboxes']")).isDisplayed();
        Assert.assertTrue(checkboxesDisplayed);
    }


    // parameterized
    @Given("I launch to the app with urls as {}")
    public void iLaunchToTheAppWithUrlsAs(String url) {
        driver.get(url);
    }

    @And("I enter username as {} in email field")
    public void iEnterUsernameAsInEmailField(String username) {
        driver.findElement(By.id("email")).sendKeys(username);
    }

    @And("I enter password as {} in the password field")
    public void iEnterPasswordAsInThePasswordField(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
}
