import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RadiobuttonsCheckBoxes {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // ищем стиральные машины в яндекс-маркете
        String yaMarket;
        yaMarket = "https://market.yandex.ru/";
        driver.get(yaMarket);
       String searchLink = "//*[@id='header-search']";
       String searchButton = "//*[@data-auto='search-button']";
        driver.findElement(By.xpath(searchLink)).sendKeys("Стиральная машина");
        driver.findElement(By.xpath(searchButton)).click();
//выбираем чек-боксы
//        selectCheckbox("LG");
//        selectCheckbox("Samsung");
//        selectCheckbox("Bosch");

        // снимаем чек-бокс
        //deselectCheckbox("Samsung"); // todo не работает - почему??


//// TODO доделать метод для выпадающих списков
//        driver.get("https://www.gmail.com/mail/help/intl/ru/about.html?de.");
//        driver.findElement(By.xpath("//a[@class='maia-button']")).click();
//        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @name='firstName']")).sendKeys("Test");
//        driver.findElement(By.xpath("//span[text()='Далее']")).click();
//        driver.findElement(By.xpath("//*[@id='gender']")).click();
//        driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();



//проверяем, выбран ли радиобаттон до клика на него и после клика на него, в терминале true/false

//       WebElement todayOrNot = driver.findElement(By.xpath("//span[@class='_3rnhG']//span[text()='Сегодня или завтра']"));
//        System.out.println(todayOrNot.isSelected());
//        todayOrNot.click();
//        System.out.println(todayOrNot.isSelected());

//        driver.findElement(By.xpath("//span[@class='aAp6r Bmsqm' and text()='До 5 дней']")).click();


//выдает всегда false, должен менять true  и false
        WebElement test = driver.findElement(By.xpath("//div[@class='PndfQ']//span[text()='LG']//..//..//input"));
        System.out.println(test.isSelected());
        test.click();
        System.out.println(test.isSelected());





        driver.quit();



    }
    public static void selectCheckbox(String name){
        String rbXpath = "//div[@class='PndfQ']//span[text()='%s']//..//..//input";
        if (!driver.findElement(By.xpath(String.format(rbXpath,name))).isSelected())
            driver.findElement(By.xpath(String.format(rbXpath,name))).click();
    }

    //если не выбран чек-бокс, то кликаем на него, если выбран, то кликаем - два метода
//    но тк. не видит boolean, то работает не совсем корректно


    public static void deselectCheckbox(String name){
        String rbXpath = "//div[@class='PndfQ']//span[text()='%s']";
        if (!driver.findElement(By.xpath(String.format(rbXpath,name))).isSelected())
      //а должно работать так  if (driver.findElement(By.xpath(String.format(rbXpath,name))).isSelected())

            driver.findElement(By.xpath(String.format(rbXpath,name))).click();
    }

}
