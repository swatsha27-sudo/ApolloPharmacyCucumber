
package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPage {

    WebDriver driver;
    WebDriverWait wait;

    // Select Address
    By selectAddress = By.xpath("//*[contains(text(),'Select Address')]");

    // Search location
    By searchLocation = By.id("search-location");

    // Location result
    By locationResult = By.xpath(
        "//h3[normalize-space()='Simhapuri Colony, Simhachalam']"
    );


    public AddressPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }


    // Click Select Address
    public void clickSelectAddress() {

        wait.until(ExpectedConditions.elementToBeClickable(selectAddress));

        driver.findElement(selectAddress).click();

        System.out.println("Select Address clicked");
    }


    // Search location
    public void searchLocation(String location) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchLocation));

        driver.findElement(searchLocation).sendKeys(location);

        System.out.println("Location entered: " + location);
    }


    // Select location
    public void selectLocation() {

        wait.until(ExpectedConditions.elementToBeClickable(locationResult));

        driver.findElement(locationResult).click();

        System.out.println("Location selected");
    }
}
