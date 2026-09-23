package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ApolloHomePage;

public class ApolloSearchSteps {

    WebDriver driver;
    ApolloHomePage homePage;

    @Given("I open Apollo Pharmacy for product search")
    public void i_open_apollo_pharmacy_for_product_search() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.apollopharmacy.in/");

        homePage = new ApolloHomePage(driver);

        System.out.println("Apollo Pharmacy opened");
    }

    @When("I search for toothpaste")
    public void i_search_for_toothpaste() {

        homePage.searchProduct("toothpaste");

        System.out.println("Toothpaste searched");
    }

    @When("I add the product to cart")
    public void i_add_the_product_to_cart() {

        homePage.addProduct();

        System.out.println("Product added to cart");
    }

    @When("I increase the quantity")
    public void i_increase_the_quantity() {

        homePage.increaseQuantity();

        System.out.println("Quantity increased");
    }

    @When("I view the cart")
    public void i_view_the_cart() {

        homePage.viewCart();

        System.out.println("Cart opened");
    }

    @When("I click on Proceed")
    public void i_click_on_proceed() {

        homePage.proceed();

        System.out.println("Proceed clicked");

        driver.quit();

        System.out.println("Browser closed");
    }
}
