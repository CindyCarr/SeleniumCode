package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Darwin");
        driver.findElement(By.id("customer.lastName")).sendKeys("Mendoza");
        driver.findElement(By.id("customer.address.street")).sendKeys("4520 Fidelity Ct");
        driver.findElement(By.id("customer.address.city")).sendKeys("Annandale");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22003");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("(703)216-2031");
        driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
        driver.findElement(By.id("customer.username")).sendKeys("d83mendoza");
        driver.findElement(By.id("customer.password")).sendKeys("Do$$a1223");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Do$$a1223");
        Thread.sleep(1000);


        driver.quit();

    }






}
