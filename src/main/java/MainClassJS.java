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



//        driver.get("https://qa-ep-bva-practice-assignment.vercel.app/");

//        driver.findElement(By.xpath("//button[text()=\'Validate\']")).click();//появляется алерт
//        try {                                                           //ожидание 3 сек
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.switchTo().alert().accept();//нажимаем ок на алерт, принимаем его





//        driver.get("http://google.com");
//        JavascriptExecutor js1 = (JavascriptExecutor)driver;
//        js1.executeScript("confirm('Are you sure?');");//создаем алерт на сайте
//        try {                                                           //ожидание 3 сек
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
////        driver.switchTo().alert().accept();//принимаем алерт
//        driver.switchTo().alert().dismiss();//отклоняем алерт





//        driver.get("https://en.wikipedia.org/");

//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("alert('Hello world!');"); // получаем в браузере окно с просьбой подтвердить4
//        jse.executeScript("window.scrollBy(0, 1000)",""); //прокрутка страницы вниз
//        jse.executeScript("window.scrollBy(0, -1000)",""); //прокрутка страницы вверх

        driver.get("https://www.oracle.com/java/technologies/java-archive-misc-downloads.html#jdk8demos");
        driver.findElement(By.cssSelector("body > div.f11w1 > section:nth-child(7) > div > p > a")).click();
        //при нажатии на ссылку открывается новое окно браузера
        String mainWindow = driver.getWindowHandle(); //задаем главное окно

        for (String windowHandle:driver.getWindowHandles()){ //переключаемся на новое окно
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath("//button[text()='Products']")).click();
        driver.switchTo().window(mainWindow);

        driver.findElement(By.cssSelector("#industries1")).click();




//      driver.quit();



    }


}
