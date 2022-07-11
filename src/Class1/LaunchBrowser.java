package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // setting the property to use chromedriver - add .exe for windows
        WebDriver driver = new ChromeDriver(); // launch the browser

        driver.get("http://www.google.com");

        String url = driver.getCurrentUrl(); //get url
        System.out.println(url);//print url

        String title = driver.getTitle();//get title
        System.out.println(title);//print title

        driver.quit();
    }
}
