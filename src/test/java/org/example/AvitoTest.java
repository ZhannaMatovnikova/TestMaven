package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AvitoTest {


    public static MainPage mainPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("avitoMain"));

        mainPage = new MainPage(driver);
        profilePage = new ProfilePage(driver);
//        driver = new ChromeDriver();
        }


    @Test
        public void FindAdvertTest(){
        mainPage.FindAdvert("Елка");
        mainPage.clickButtonFind();
//        driver.quit();
        }
    @AfterClass
    public static void tearDown() {
        profilePage.returnMain();
        //  driver.navigate().back(); TODO разобраться почему не работает выход из драйвера
        //driver.quit();
    }


}
