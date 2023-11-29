package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class navigationInWeb {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(900, 500));


        driver.get("https://github.com");
        driver.findElement(By.xpath("//a[text()='sign-in']")).click();
        WebElement link = driver.findElement(By.linkText("Вход и регистрация"));
//        WebElement link2 = driver.findElement(By.partialLinkText("Распродажа"));
//        WebElement favorites = driver.findElement(By.className("desktop-1rdftp2"));
//        WebElement polza = driver.findElement(By.cssSelector("a.index-nav-link-muv1u"));

//        WebElement vhodRegister = driver.findElement(By.xpath("//a[@class='index-nav-link-muv1u index-login-NV2z_']"));
//        WebElement link5 = driver.findElement(By.id(""));

//  WebElement input = driver.findElement(By.tagName("input"));
//        WebElement link3 = driver.findElement(By.name());
//        driver.get("https://www.avito.ru/");
//        driver.navigate().to("https://stepik.org/"); // get открыть стр
//        driver.navigate().back(); // на страницу назад, на предыдущую
//        driver.navigate().forward(); // на страницу вперед
//        driver.navigate().refresh(); // перезагрузить страницу

//        System.out.println(driver.getTitle()); // выводит заголовок страницы в консоль
//        System.out.println(driver.getCurrentUrl()); // выводит url страницы в консоль

//        driver.quit(); // закрыть браузер
    }
}
    }
}
