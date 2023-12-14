package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainPage {

    public WebDriver driver;
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//*[@data-marker='search-form/suggest']")
    private WebElement findAdvert;
    @FindBy(xpath = "//button//span[text()='Найти']")
    private WebElement buttonFind;

    public void FindAdvert(String poisk){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-marker='search-form/suggest']")));
        findAdvert.sendKeys(poisk);
    }
    public void clickButtonFind(){
        buttonFind.click();
    }
}
