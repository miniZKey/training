import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClientWorkNavigationTest {

    @Test
    void shouldNavigateToClientWorkAndShowHeading() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.get("https://www.epam.com/");

            WebElement servicesMenu = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Services')]"))
            );
            servicesMenu.click();

            WebElement clientWorkLink = wait.until(
                    ExpectedConditions.elementToBeClickable(By.linkText("Explore Our Client Work"))
            );
            clientWorkLink.click();

            WebElement clientWorkHeading = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(normalize-space(),'Client Work')]")
            );

            assertTrue(clientWorkHeading.isDisplayed(), "Client Work text should be visible");
        } finally {
            driver.quit();
        }
    }
}
