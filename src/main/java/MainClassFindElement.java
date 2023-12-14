
import org.openqa.selenium.*;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class MainClassFindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//
//        driver.get("https://github.com");
//
//
////вывод в терминал количество элементов, найденных или не найденных на странице
////        System.out.println(driver.findElements(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a")).size());
////        System.out.println(driver.findElements(By.xpath("//a")).size());
//
//        //выводим текстовое сообщение в терминал , если (не)нашли элемент
//        if (driver.findElements(By.xpath("//a[text()='Login']")).size() > 0) System.out.println("Such element is presented");
//        else System.out.println("Can't find such element");
//
//
//

//нажатие на клавиши на клавиатуре
        driver.get("https://ru.wikipedia.org/");

        WebElement searchInput = driver.findElement(By.cssSelector("#searchInput"));
//        searchInput.sendKeys("Test text");
//        searchInput.sendKeys(Keys.ENTER);

        String select = Keys.chord(Keys.CONTROL, "a");
        String cut = Keys.chord(Keys.CONTROL, "x");
        String paste = Keys.chord(Keys.CONTROL, "v");

//зажимаем shift и вводим текст, результат - заглавные буквы вместо строчных
//        searchInput.sendKeys(Keys.chord(Keys.SHIFT, "test text"));
//        searchInput.sendKeys(Keys.ENTER);


        searchInput.sendKeys("test text");
        searchInput.sendKeys(select);
        searchInput.sendKeys(cut);
        searchInput.sendKeys(paste);
        searchInput.sendKeys(Keys.ENTER);

        //сделать скриншот - не работает конструкция

//        File screenshot = ((TakesScreenshot)driver.getScreenshotAs(OutputType.FILE));
//        try {
//            FileUtils.copyFile(screenshot, new File("C:\\screenshots\\screenshot1.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        driver.quit();
    }
}
