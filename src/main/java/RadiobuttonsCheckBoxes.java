import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadiobuttonsCheckBoxes {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        String yaMarket;
//        yaMarket = "https://market.yandex.ru/";
//        driver.get(yaMarket);
//       String searchLink = "//input[@id='header-search']";
//       String searchButton = "//button[@data-auto='search-button']";
//        driver.findElement(By.xpath(searchLink)).sendKeys("Стиральная машина");
//        driver.findElement(By.xpath(searchButton)).click();
//
//        selectCheckbox("LG");
//        selectCheckbox("Samsung");
//        selectCheckbox("Bosch");
//
//        deselectCheckbox("Samsung");

// TODO доделать метод для выпадающих списков
        driver.get("https://www.gmail.com/mail/help/intl/ru/about.html?de.");
        driver.findElement(By.xpath("//a[@class='maia-button']")).click();
        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @name='firstName']")).sendKeys("Test");
        driver.findElement(By.xpath("//span[text()='Далее']")).click();
        driver.findElement(By.xpath("//*[@id='gender']")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();


//select[@id='gender']






//       WebElement todayOrNot;
//        todayOrNot = driver.findElement(By.xpath("//span[@class='aAp6r Bmsqm' and text()='Сегодня или завтра']"));
//        System.out.println(todayOrNot.isSelected());
//        todayOrNot.click();
//        System.out.println(todayOrNot.isSelected());

//        driver.findElement(By.xpath("//span[@class='aAp6r Bmsqm' and text()='До 5 дней']")).click();
        driver.quit();



    }
//    public static void selectCheckbox(String name){
//        String rbXpath = "//span[text()='%s']"; //TODO проверить xPath, не работает метод
//        if (!driver.findElement(By.xpath(String.format(rbXpath,name)+ "/input")).isSelected())
//            driver.findElement(By.xpath(String.format(rbXpath,name))).click();
//    }
//    public static void deselectCheckbox(String name){
//        String rbXpath = "//span[text()='%s']"; //TODO проверить xPath, не работает метод
//        if (driver.findElement(By.xpath(String.format(rbXpath,name)+ "/input")).isSelected())
//            driver.findElement(By.xpath(String.format(rbXpath,name))).click();
//    }

}
