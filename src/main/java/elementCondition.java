import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

public class elementCondition {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        driver.get("https://www.ivi.ru/profile");
//
//        driver.findElement(By.cssSelector("#root > div.page-wrapper > div.profileMain > div > div > div > div")).click();
//        // ищем неактивную кнопку
//        WebElement buttonContinue = driver.findElement(By.cssSelector("#modal-container > div > div.fullscreen-popup__scroll-wrapper.fullscreen-popup__scroll-wrapper_chat > div > div > div.chatPopup__grid > div > div > div > div > form > div.nbl-chat__itemWrapper.nbl-chat__itemWrapper_origin_user.nbl-chat__itemWrapper_status_emphasized.nbl-chat__itemWrapper_type_control > div > div.action-button"));
////проверяем, активна кнопка или нет
////        System.out.println(buttonContinue.isEnabled());
//
//        if (buttonContinue.isEnabled()) buttonContinue.click();


// проверка видимости элемента на странице

        driver.get("https://www.ebay.com/");

       WebElement electro = driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(3)"));
       WebElement favourits = driver.findElement(By.xpath("//li[@class='saved']"));
       WebElement smartphones = driver.findElement(By.xpath("//a[text()='Смартфоны и аксессуары']"));
        System.out.println(electro.isDisplayed());
        System.out.println(favourits.isDisplayed());
        System.out.println(smartphones.isDisplayed());//во внутренней вкладке, не видим на главной странице


//       WebElement smartphones = driver.findElement(By.xpath("//a[text()='Смартфоны и аксессуары']"));
//       Actions actions = new Actions(driver);
//       actions.moveToElement(electro).build().perform();

//        if (electro.isDisplayed()) electro.click();
//        else smartphones.click();

        if (smartphones.isDisplayed()) smartphones.click();
        else electro.click();



        driver.quit();
    }
}
