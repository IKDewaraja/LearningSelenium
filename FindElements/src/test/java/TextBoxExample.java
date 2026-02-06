

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {

    WebDriver driver;


    @BeforeMethod
    public void openLinkTestPage() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.setBrowserVersion("122");


        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");

        //wait
        Thread.sleep(3000);


    }


    @Test
    public void textBoxTests() throws InterruptedException {

        //01. Type your name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("I K Dewaraja");


        //02.Append country to this city
        WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("India");



        //03.verify if text box is disabled
               boolean enabled = driver.findElement(By.name("j_idt88:name")).isEnabled();
               System.out.println("Is Text Box enabled :"  +enabled);

        //wait
        Thread.sleep(3000);


        //04.clear the typed text
        WebElement clearText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
        clearText.clear();

        // 05. retrieve the typed text
        WebElement textElement = driver.findElement(By.id("j_idt88:j_idt97"));
        String value = textElement.getAttribute("value");
        System.out.println(value);



        //06.type email and tab, confirm control moved to next element
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("imandidewaraja28@gmail.com" + Keys.TAB + "Confirmed control moved to next element");
    }
}

