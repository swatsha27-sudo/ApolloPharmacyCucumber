package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AddressPage;

public class AddressSteps {

    WebDriver driver;
    AddressPage addressPage;

    @Given("I open Apollo Pharmacy for address")
    public void openApolloPharmacy() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.apollopharmacy.in/");

        addressPage = new AddressPage(driver);

        System.out.println("Apollo Pharmacy opened");
    }

    @When("I click on Select Address")
    public void clickSelectAddress() {

        addressPage.clickSelectAddress();

        System.out.println("Select Address clicked");
    }

    @When("I search for my location")
    public void searchLocation() {

        addressPage.searchLocation("Simhapuri Colony");

        System.out.println("Location searched");
    }

    @When("I select the location")
    public void selectLocation() {

        addressPage.selectLocation();

        System.out.println("Location selected");

        driver.quit();

        System.out.println("Browser closed");
    }
}
