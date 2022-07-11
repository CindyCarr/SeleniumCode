package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class MaximizeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); // add .exe for windows
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https:www.amazon.com");
        driver.manage().window().maximize();
    }
}
