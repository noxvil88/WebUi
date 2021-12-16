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

public class InteractionsTest extends BasicTest {


    @Test
    void interactionsTest() {
        webDriver.get("https://demoqa.com/");
        webDriver.manage().window().setSize(new Dimension(2000,1000));
        webDriver.findElement(By.xpath("//h5[text()='Interactions']")).click();
        webDriver.findElement(By.xpath("//span[text()='Selectable']")).click();
        webDriver.findElement(By.xpath("//li[text()='Cras justo odio']")).click();

    }
}
