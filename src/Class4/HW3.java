package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {
         /*  HRMS Application Negative Login:
        Open chrome browser
        Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        Enter valid username
        Leave password field empty
        Click on login button
        Verify error message with text "Password cannot be empty" is displayed.
        */

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userName=driver.findElement(By.cssSelector("input[type='text']"));
        userName.sendKeys("Admin");

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement displayMessage=driver.findElement(By.id("spanMessage"));
        if (displayMessage.isDisplayed()) {
            System.out.println("Display Message VERIFIED");
        }else {
            System.out.println("Display Message NOT VERIFIED");
        }
    }
}
