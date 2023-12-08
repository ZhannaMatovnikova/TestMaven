package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllCheckboxes {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.avito.ru/");
        driver.findElement(By.xpath("//*[@data-marker='search-form/suggest']")).sendKeys("Елка");
        driver.findElement(By.xpath("//button//span[text()='Найти']")).click();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id=\"app\"]//div[3]/div/div/div/div/div/div/label/span"));
//        checkboxes.get(0).click();


//с 1 чек-боксом ошибка устранена
//        WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]//form/div[3]/div/div/div/div/div/div/label/span"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();

//     узнаем количество чек-боксов
        if (checkboxes.size() == 2) System.out.println("it's ok");
        else System.out.println("FAIL!");
//кликаем все чекбоксы по порядку в выбранном блоке
        for (WebElement checkbox: checkboxes){
            checkbox.click();
        }






//        driver.quit();


    }
}