package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        // Java projemize, chromedriver'ı tanıttık.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/");
        WebElement aramakutusu = driver.findElement(By.name("q"));
        aramakutusu.sendKeys("city bike");
        aramakutusu.submit();
        WebElement sonucsayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucsayisi.getText());
        WebElement alisverisLinki = driver.findElement(By.partialLinkText("Alışveriş"));
        alisverisLinki.click();


    }
}
