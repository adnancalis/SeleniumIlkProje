package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://youtube.com"); // get 'te kullanılabilir
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
