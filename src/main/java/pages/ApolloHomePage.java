package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApolloHomePage {

    WebDriver driver;
    WebDriverWait wait;

    // Search Medicines
    By searchMedicines =
            By.xpath("//div[@data-placeholder='Search Medicines']");

    // Search input
    By searchBox =
            By.id("search-medicines-brands");

    // Add button
    By addButton =
            By.xpath("//span[normalize-space()='Add']");

    // Increase quantity
    By increaseButton =
            By.xpath("//span[@aria-label='Increase button']");

    // View Cart
    By viewCart =
            By.xpath("//span[normalize-space()='View Cart']");

    // Proceed
    By proceedButton =
            By.xpath("//button[@title='Proceed']");


    public ApolloHomePage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(20)
        );
    }


    // Search product
    public void searchProduct(String product) {

        wait.until(
                ExpectedConditions.elementToBeClickable(searchMedicines)
        ).click();

        System.out.println("Search Medicines clicked");

        wait.until(
                ExpectedConditions.elementToBeClickable(searchBox)
        ).sendKeys(product);

        System.out.println("Product entered: " + product);

        driver.findElement(searchBox).sendKeys(Keys.ENTER);

        System.out.println("Product search completed");
    }


    // Add product
    public void addProduct() {

        WebElement add = wait.until(
                ExpectedConditions.presenceOfElementLocated(addButton)
        );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        add
                );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        add
                );

        System.out.println("Product added to cart");
    }


    // Increase quantity
    public void increaseQuantity() {

        WebElement increase = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        increaseButton
                )
        );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        increase
                );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        increase
                );

        System.out.println("Quantity increased");
    }


    // View cart
    public void viewCart() {

        WebElement cart = wait.until(
                ExpectedConditions.presenceOfElementLocated(viewCart)
        );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        cart
                );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        cart
                );

        System.out.println("View Cart clicked");

        System.out.println("Cart page opened");
    }


    // Proceed
    public void proceed() {

        WebElement proceed = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        proceedButton
                )
        );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        proceed
                );

        ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        proceed
                );

        System.out.println("Proceed button clicked");
    }
}
