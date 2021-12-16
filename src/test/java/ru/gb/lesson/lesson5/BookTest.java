package ru.gb.lesson.lesson5;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BookTest extends BasicTest {


    @Test
    void bookTest() {
        webDriver.get("https://demoqa.com/");

        webDriver.manage().window().setSize(new Dimension(2000,1000));
        webDriver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
        webDriver.findElement(By.xpath("//button[text()='Login']")).click();
        webDriver.findElement(By.xpath("//input[contains(@placeholder,'UserName')]")).sendKeys("Андрей");
        webDriver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("12345");
        webDriver.findElement(By.xpath("//button[text()='Login']")).click();

    }


}
