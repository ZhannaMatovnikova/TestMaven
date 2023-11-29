import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(900, 500));

//        driver.get("https://www.avito.ru");
//        driver.get("https://ru.wikipedia.org/");
//        driver.findElement(By.xpath("//input[@id='searchButton']")).click();

        driver.get("https://github.com");
       driver.findElement(By.xpath("//a[text()='sign-in']")).click();


//        WebElement button = driver.findElement(By.xpath("//div[@class=\"auth-form-body mt-3\"]//button"));
//        System.out.println("Button text is: " + button.getText());
//          if (button.getText().equals("Sign up for GitHub")) {
//              System.out.println("Success!");
//          }
//        }
//        else System.out.println("Fail!");
//        button.submit();


      //  WebElement link = driver.findElement(By.linkText("Вход и регистрация"));
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


/* xpath Avito
//div/button[@type = 'button' and @class='styles-module-root-C_ES7 styles-module-root_size_m-_IdhI styles-module-root_preset_accent-_pmQV'] - все категории
//input[@data-marker='search-form/suggest'] строка поиска
//a[@class='index-nav-link-muv1u index-login-NV2z_'] вход и регистрация

/ancestor:: все предки элемента
ancestor-or-self:: предки и собственный узел
following-sibling:: соседи на уровень ниже
preceding-sibling::  соседи на том же уровне
parent:: родительский элемент

функции

xpath//tr[last()] последняя строка
//a[text()='Text'] поиск по тексту в ссылке
//button[contains(@class, 'ghnh'] найти элемент, класс которого содержит в себе кусочек
//h1[contains(text(), 'How people']
//input[starts-with(@title,'Go to')]




*/