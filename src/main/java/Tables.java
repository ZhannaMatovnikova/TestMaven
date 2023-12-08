import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tables {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicitly - драйвер выжидает 10 сек перед поиском элемента на странице
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        WebElement tableElement = driver.findElement(By.xpath("//table[@id=\"customers\"]"));
        TablesMethods table = new TablesMethods(tableElement, driver);


        System.out.println("Raws number is: " + table.getRows().size());
        System.out.println(table.getValueFromCell(2,3));
        System.out.println(table.getValueFromCell(4,1));
        System.out.println(table.getValueFromCell(4,"Company"));
        System.out.println(table.getValueFromCell(1,"Country"));
        System.out.println(table.getValueFromCell(2,"Contact"));


        driver.quit();

    }
}
