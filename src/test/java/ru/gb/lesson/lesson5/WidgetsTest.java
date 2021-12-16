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

public class WidgetsTest extends BasicTest {


    @Test
    void widgetsTest() {
        webDriver.get("https://demoqa.com/");
        webDriver.manage().window().setSize(new Dimension(1000,700));
        webDriver.findElement(By.xpath("//h5[text()='Widgets']")).click();
        webDriver.findElement(By.xpath("//span[text()='Accordian']")).click();
        webDriver.findElement(By.xpath("//div[text()='Where does it come from?']")).click();

    }
}
