import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Waiting {
    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signup");

//        WebDriverwait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//     //   WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10)); //можно использовать 2 разных ожидания для различных целей
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Создание аккаунта Google']")));
//        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("test");
//        driver.findElement(By.xpath("//button//*[text()='Далее']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Общие сведения']")));
//        driver.findElement(By.cssSelector("#month")).click();
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@class='UDCCJb']/option[1]"))));
//        driver.findElement(By.xpath("//select[@class='UDCCJb']/option[@value='1']")).click();
//        driver.findElement(By.cssSelector("#year")).click();
////        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("#month"))));
//
        driver.quit();
    }
}
