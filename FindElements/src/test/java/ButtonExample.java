import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExample {


    WebDriver driver;


    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();

        Dimension newSize = new Dimension(800, 600);
        driver.manage().window().setSize(newSize);

    //    driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");

    }

    @Test
    public void buttonTests(){
        // 1. click and confirm title
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]")).click();
        String expectedTitle = "Dashboard";
           String actualTitle = driver.getTitle();
           if(expectedTitle.equals(actualTitle)){
               System.out.println("Actual Title is same as expected");

           } else {
               System.out.println("Actual Title is not same as expected");
           }

           //

      //  Assert.assertEquals(driver.getTitle(), expectedTitle, "Title does not match");



        //2. find the position of thr submit button
           driver.navigate().back();
        WebElement getPosition = driver.findElement(By.id("j_idt88:j_idt94"));
           Point xyPoint = getPosition.getLocation();
           int x = xyPoint.getX();
           int y = xyPoint.getY();
          System.out.println("X position is " + x + " and Y position is " + y);


        //3. find the save color
        WebElement buttoncolour =  driver.findElement(By.id("j_idt88:j_idt96"));
        String colour = buttoncolour.getCssValue("background-color");
        System.out.println("Button colour is " + colour);



        // 4. find the height and width of the button
        WebElement size =  driver.findElement(By.id("j_idt88:j_idt98"));
        int height = size.getSize().getHeight();
        int width = size.getSize().getWidth();
        System.out.println("Size is " + height  + " and width is " + width);

    }
}
