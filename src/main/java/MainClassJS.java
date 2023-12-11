import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainClassJS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/");

        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("alert('Hello world!');"); // получаем в браузере окно с просьбой подтвердить4
        jse.executeScript("window.scrollBy(0, 1000)",""); //прокрутка страницы вниз
        jse.executeScript("window.scrollBy(0, -1000)",""); //прокрутка страницы вверх




//        driver.get("https://www.ebay.com/");
//
//        WebElement link = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Электроника']"));
//        WebElement element = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Электроника']"));

//      driver.quit();



    }


}
