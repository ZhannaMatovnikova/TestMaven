import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class links {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        String wiki;
        wiki = "https://ru.wikipedia.org";
        driver.get(wiki);
//        String wiki = "https://ru.wikipedia.org";

        WebElement link = driver.findElement(By.xpath("//li[@id=\"n-help\"]/a"));
        System.out.println(link.getText());
        link.click();

        driver.quit();

        String yaMarket;
        yaMarket = "https://market.yandex.ru/";


    }
    }
