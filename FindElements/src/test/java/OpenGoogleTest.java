
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {

    @Test
    public void googleTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com/");

        // Full screen
        driver.manage().window().maximize();

        // Wait for 5 seconds (5000 milliseconds)
//        Thread.sleep(5000);

        // Quit browser


        //use selenium locators
        //search Colombo in search bar and search
        driver.findElement(By.name("q")).sendKeys("Colombo"  + Keys.ENTER);


//        driver.quit();
    }
}
