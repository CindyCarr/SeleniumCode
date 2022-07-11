package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
      /*  Open chrome browser
        Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify Syntax Logo is displayed.
        */

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userName=driver.findElement(By.cssSelector("input[type='text']"));
        userName.sendKeys("Admin");

        WebElement passWord= driver.findElement(By.cssSelector("input[type='password']"));
        passWord.sendKeys("Hum@nhrm123");

        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement logo=driver.findElement(By.cssSelector("img[alt='OrangeHRM']"));

        if (logo.isDisplayed()) {
            System.out.println("Logo Presence Verified");
        }else {
            System.out.println("Logo Is Not Present");
        }
       driver.quit();
    }
}
