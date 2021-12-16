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

public class ElementsTest extends BasicTest {


    @Test
    void elementsTest() {
        webDriver.get("https://demoqa.com/");
        webDriver.manage().window().setSize(new Dimension(2000,1000));
        webDriver.findElement(By.xpath("//h5[text()='Elements']")).click();
        webDriver.findElement(By.xpath("//span[text()='Text Box']")).click();
        webDriver.findElement(By.xpath("//input[contains(@placeholder,'Full Name')]")).sendKeys("Андрей");
        webDriver.findElement(By.xpath("//input[contains(@placeholder,'name@example.com')]")).sendKeys("asd@mail.ru");
        webDriver.findElement(By.xpath("//textarea[contains(@placeholder,'Current Address')]")).sendKeys("пр.Королева");
        webDriver.findElement(By.xpath("//textarea[contains(@id,'permanentAddress')]")).sendKeys("ул.Мира");
        webDriver.findElement(By.xpath("//button[text()='Submit']")).click();

    }
}
