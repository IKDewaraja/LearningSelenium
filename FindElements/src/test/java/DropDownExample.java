import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownExample {



    WebDriver driver;


    @BeforeMethod
    public void dropDownTestPage(){
        driver = new ChromeDriver();

//        Dimension newSize = new Dimension(800, 600);
//        driver.manage().window().setSize(newSize);

            driver.manage().window().maximize();
        driver.get("https://www.leafground.com/select.xhtml");

    }

    @Test
    public  void leafgrounndpageDropDownTest() throws InterruptedException {

        //1)

        //1.1) ways of select values in basic dropdown
        WebElement dropDown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Playwright");



        //1.2) get the number of dropdown options
        //generics- the list of web elements
         List<WebElement> listofOptions  = select.getOptions();
         int size =listofOptions.size();
        System.out.println("Number of options in selected drop down is " + size);



        for (WebElement element : listofOptions) {
            System.out.println(element.getText());
        }

        //1.3) using sendKeys select dropdown value
         dropDown.sendKeys("Puppeteer");



        //2nd dropdown in the page
        //1.4) selecting value in a Bootstrap dropdown



        //2)  Google search -  pick a value from suggestions
        //3)  Handle hidden auto suggestions drop down and search using DOM debugger trick
    }





}
