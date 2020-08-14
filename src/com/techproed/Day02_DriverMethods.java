package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://amazon.com");


        String sayfatitle = webDriver.getTitle();
        String sayfaurl =webDriver.getCurrentUrl();

        System.out.println(sayfatitle);
        System.out.println(sayfaurl);

        webDriver.quit();
    }
}
