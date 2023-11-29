import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class buttonsText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

/*заходим на сайт википедии, ищем Selenium WebDriver через строку поиска,
переходим на страницу с результатами, выводим на консоль значения внутри поля на новой странице,
 стираем значение
 */
        driver.get("https://ru.wikipedia.org");
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value"));
        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear();


    // заходим на гитхаб, ищем поле Sign in, вводим тестовый email, получаем ошибку

        driver.get("https://github.com/");
        driver.findElement(By.xpath("//form//dd/input[@id='user_email' and @name='user_email'] ")).sendKeys("test username");
        driver.findElement(By.xpath("//form[@class='mx-0 col-12 col-md-7 col-lg-5 js-signup-form position-relative z-2']//button")).click();

/* заходим на страницу вк, вводим тестовое значение почты testmail в поле sign in,
осуществлен переход на другую страницу c ошибкой входа, выводим в консоль значение поля на новой странице
( тот же тестовый email)
 */
        driver.get("https://vk.com/");
        driver.findElement(By.xpath("//*[@id='index_email']")).sendKeys("testmail");
        driver.findElement(By.xpath("//button[@class=\"FlatButton FlatButton--primary FlatButton--size-l FlatButton--wide VkIdForm__button VkIdForm__signInButton\"]")).submit();
        System.out.println("Mail is: " + driver.findElement(By.xpath("//div[@class='vkc__DefaultSkin__input']//input")).getAttribute("value"));
//        driver.quit();



    }
}
