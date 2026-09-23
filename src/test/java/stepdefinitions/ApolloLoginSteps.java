package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ApolloLoginSteps {

    WebDriver driver;

    @Given("I open Apollo Pharmacy website")
    public void i_open_apollo_pharmacy_website() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.apollopharmacy.in/");

        System.out.println("Apollo Pharmacy opened");
    }

    @When("I click on Login")
    public void i_click_on_login() {

        driver.findElement(
                By.xpath("//span[text()='Login']")
        ).click();

        System.out.println("Login clicked");
    }

    @When("I enter mobile number")
    public void i_enter_mobile_number() {

        driver.findElement(
                By.id("user-mobile-number")
        ).sendKeys("9876543210");

        System.out.println("Mobile number entered");
    }

    @When("I click on Continue")
    public void i_click_on_continue() {

        driver.findElement(
                By.xpath("//i[contains(@class,'icon-ic_arrow_forward')]/..")
        ).click();

        System.out.println("Continue clicked");
    }

    @Then("OTP screen should be displayed")
    public void otp_screen_should_be_displayed() {

        boolean result = driver.findElements(
                By.id("digit1")
        ).size() > 0;

        if (result) {
            System.out.println("OTP screen is displayed");
        } else {
            System.out.println("OTP screen is not displayed");
        }

        driver.quit();

        System.out.println("Browser closed");
    }
}
