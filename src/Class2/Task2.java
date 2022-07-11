package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.fb.com");

        driver.findElement(By.partialLinkText("new")).click();
        driver.findElement(By.partialLinkText("inputtext _58mg _5dba _2ph-")).sendKeys("Jane");
        driver.findElement(By.partialLinkText("Last")).sendKeys("Doe");
    }








}
