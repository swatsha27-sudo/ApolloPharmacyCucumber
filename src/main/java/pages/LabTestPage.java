package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LabTestPage {

    WebDriver driver;
    WebDriverWait wait;

    // Lab Tests
    By labTests = By.xpath("//a[@aria-label='LabTests']");

    // Popup - Later
    By laterButton = By.id("wzrk-cancel");

    // Vitamin
    By vitamin = By.xpath("//p[normalize-space()='Vitamin']");

    // Add test
    By addTest = By.xpath("//button[.//span[normalize-space()='Add']]");

    // Go To Cart
    By goToCart = By.xpath("//button[.//span[normalize-space()='Go To Cart']]");

    // Mobile number
    By mobileNumber = By.name("mobileNumber");

    // Continue
    By continueButton = By.xpath("//button[normalize-space()='Continue']");

    // Constructor
    public LabTestPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Click Lab Tests
    public void clickLabTests() {

        wait.until(
                ExpectedConditions.elementToBeClickable(labTests)
        ).click();

        System.out.println("Lab Tests clicked");
    }

    // Close popup if displayed
    public void closePopup() {

        try {

            wait.until(
                    ExpectedConditions.elementToBeClickable(laterButton)
            ).click();

            System.out.println("Popup closed");

        } catch (Exception e) {

            System.out.println("Popup not displayed");
        }
    }

    // Click Vitamin
    public void clickVitamin() {

        wait.until(
                ExpectedConditions.elementToBeClickable(vitamin)
        ).click();

        System.out.println("Vitamin selected");
    }

    // Add Vitamin test
    public void addVitaminTest() {

        wait.until(
                ExpectedConditions.elementToBeClickable(addTest)
        ).click();

        System.out.println("Vitamin test added");
    }

    // Go To Cart
    public void goToCart() {

        wait.until(
                ExpectedConditions.elementToBeClickable(goToCart)
        ).click();

        System.out.println("Go To Cart clicked");
        System.out.println("Lab Test cart opened");
    }

    // Enter mobile number
    public void enterMobileNumber(String mobile) {

        wait.until(
                ExpectedConditions.elementToBeClickable(mobileNumber)
        ).sendKeys(mobile);

        System.out.println("Mobile number entered: " + mobile);
    }

    // Click Continue
    public void clickContinue() {

        wait.until(
                ExpectedConditions.elementToBeClickable(continueButton)
        ).click();

        System.out.println("Continue button clicked");
    }
}