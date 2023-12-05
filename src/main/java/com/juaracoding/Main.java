package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\Tools_Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Open Browser");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        System.out.println("Maximize Window");

        driver.get("https://demoqa.com/text-box");
        System.out.println("Enter URL Textbox");



        driver.findElement(By.id("userName")).sendKeys("Adit");
        driver.findElement(By.id("userEmail")).sendKeys("Adit@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Tambun");
        driver.findElement(By.id("permanentAddress")).sendKeys("Tambun Selatan");
        js.executeScript("window.scrollBy(0,500)"); // Scroll Vertikal 500px
        driver.findElement(By.id("submit")).click();
        System.out.println("Button Submit Clicked");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Close Browser");
    }
}