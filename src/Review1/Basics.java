package Review1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Basics {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
       //driver.get("https://google.com"); //goes to page & waits for element to load

//        driver.get("https://syntaxprojects.com/index.php"); //goes 2 page but doesn't wait for it to load. Runs code immediately
//                                                        //but we can go back forward & refresh
//        Thread.sleep(2000);
//        WebElement button1= driver.findElement(By.linkText("Start Practising"));//       button1.click();
//        Thread.sleep(2000);
//        driver.findElement(By.partialLinkText("Proceed")).click();


        driver.get("https://syntaxprojects.com/basics-first-form-demo.php");
        WebElement textBox = driver.findElement(By.id("user-message"));
        textBox.sendKeys("abracadabra");

            }

    }
