import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainClassActionsEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        WebElement link = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Электроника']"));
        WebElement element = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text()='Электроника']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform(); //навести мышкой на элемент, не нажимая на него, чтобы появилось меню

        actions.dragAndDrop(element, link).build().perform(); // берем эЭлемент и переносим его в Линк

        actions.clickAndHold(element).moveToElement(link).release().build().perform();/* нажать левой кнопкой мыши и не отпускать,
        move  -перетащить на link
        release - отпустить
        */


        Action action1 = actions.clickAndHold(element).moveToElement(link).release().build();
        action1.perform();
        actions.doubleClick(link); // двойной клик

        actions.contextClick(link); // нажатие правой кнопкой мыши на линк



    }


}
