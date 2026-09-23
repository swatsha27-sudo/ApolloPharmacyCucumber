package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LabTestPage;

public class LabTestSteps {

    WebDriver driver;
    LabTestPage labTestPage;

    // Open Apollo Pharmacy
    @Given("I open Apollo Pharmacy for lab tests")
    public void openApolloPharmacyForLabTests() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.apollopharmacy.in/");

        labTestPage = new LabTestPage(driver);

        System.out.println("Apollo Pharmacy opened");
    }

    // Click Lab Tests
    @When("I click on Lab Tests")
    public void clickLabTests() {

        labTestPage.clickLabTests();

        System.out.println("Lab Tests clicked");
    }

    // Close popup
    @When("I close the popup if displayed")
    public void closePopup() {

        labTestPage.closePopup();

        System.out.println("Popup checked");
    }

    // Select Vitamin
    @When("I select Vitamin")
    public void selectVitamin() {

        labTestPage.clickVitamin();

        System.out.println("Vitamin selected");
    }

    // Add Vitamin
    @When("I add the Vitamin test")
    public void addVitaminTest() {

        labTestPage.addVitaminTest();

        System.out.println("Vitamin test added");
    }

    // Go To Cart
    @When("I click on Go To Cart")
    public void clickGoToCart() {

        labTestPage.goToCart();

        System.out.println("Go To Cart clicked");
    }

    // Enter mobile number
    @When("I enter my mobile number")
    public void enterMobileNumber() {

        labTestPage.enterMobileNumber("9876543210");

        System.out.println("Mobile number entered");
    }

    // IMPORTANT:
    // This step is different from the Login step
    @When("I click on Lab Test Continue")
    public void clickLabTestContinue() {

        labTestPage.clickContinue();

        System.out.println("Lab Test Continue clicked");

        driver.quit();

        System.out.println("Browser closed");
    }
}