import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void openGoogle() {
        // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Close the browser
        driver.quit();
    }
}
