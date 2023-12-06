package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        findAdvert.sendKeys();
    }
    public void clickButtonFind(){
        buttonFind.click();
    }
}
