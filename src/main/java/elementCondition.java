import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class elementCondition {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.ivi.ru/profile");

        driver.findElement(By.cssSelector("#root > div.page-wrapper > div.profileMain > div > div > div > div")).click();
        // ищем неактивную кнопку
        WebElement buttonContinue = driver.findElement(By.cssSelector("#modal-container > div > div.fullscreen-popup__scroll-wrapper.fullscreen-popup__scroll-wrapper_chat > div > div > div.chatPopup__grid > div > div > div > div > form > div.nbl-chat__itemWrapper.nbl-chat__itemWrapper_origin_user.nbl-chat__itemWrapper_status_emphasized.nbl-chat__itemWrapper_type_control > div > div.action-button"));
//проверяем, активна кнопка или нет
        System.out.println(buttonContinue.isEnabled());

        driver.quit();
    }
}
