import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainClassSaveFiles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
// загрузка изображения в поисковик по фото -гугл, не работает
        driver.get("https://images.google.com/");

        driver.findElement(By.xpath("//div[@class='nDcEnd']")).click();
        driver.findElement(By.xpath("//span[text()='загрузите файл']")).click();
        driver.findElement(By.xpath("//input[@type='file']']")).sendKeys("C:\\Users\\Жанна\\IdeaProjects\\pet.jpg");

        driver.quit();

    }

}
