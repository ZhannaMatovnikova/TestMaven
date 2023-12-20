package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelectorsExercise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        driver.get("https://github.com");
/*
для того, чтобы искать селекторы CSS в консоли devtools , необходимо обозначить
$$("")

# обозначает id
то есть
#fhjhjfk-23-vh - найдем CSS селектор по его id fhjhjfk-23-vh
. означает класс

.appbar

другие атрибуты

[role='main']

любой атрибут в квадратных скобках, далее равно, одинарные кавычки(потому что двойные мы уже используем)
можно искать все div с атрибутом role
div[role]

можно искать по части значения атрибута.например
[role*='ai']

если ставим знак ^, то поиск будет производиться по тем значениям артибута, которые начинаются на mai, например

[role^='mai']

если знак $, то поиск производится по окончанию значения артибута
[role$='ain']

если несколько классов, тогда перечисляем
.jhgbf.jf12hbn.jhb344[div='nbh']

чего точно не должно быть
div:not(.col)

найти все ссылки, не содержащие http
a:not(href^='http')

поиск потомка любой вложенности
div[jscontroller='nbjk'] div.jhbnvjh


поиск прямого потомка
div[jscontroller='nbjk'] > div.jhbnvjh


первый потомок
ul li:first-child


последний потомок
ul li:last-child

ul li:nth-child(2)



 */

        driver.quit(); // закрыть браузер
    }
}
