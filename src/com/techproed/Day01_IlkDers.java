package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        // Java projemize, chorme driveri tanıttık.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //selenium ile ilgili ilk kodumuz
        //webdirver nesnesi oluşturarak, chrome driveri kullanılabilir hale getirdik.

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");



        //driverımızda açık olan pencereyi kapatır.
       // webDriver.close();

        //driverımı komple kapatıyor
      //  webDriver.quit();
    }
}
