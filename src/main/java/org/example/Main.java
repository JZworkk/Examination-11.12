package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
public static void main(String[] args){
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    driver.quit();
}
}