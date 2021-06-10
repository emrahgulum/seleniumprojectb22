package com.cybertek.tests.softskill_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assigment3_Vytrack {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }

    @Test
    public void navigateVytrack() throws InterruptedException {

        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("user178");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(2000);

        WebElement fleetTest = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetTest.click();


        WebElement vehicle = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        vehicle.click();


        WebElement generalInfo = driver.findElement(By.xpath("//td[.='Cyberte']"));
        generalInfo.click();


        WebElement element = driver.findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']"));
        element.click();

        Thread.sleep(2000);
        WebElement keyword = driver.findElement(By.xpath("//input[@name='oro_calendar_event_form[title]']"));
        keyword.sendKeys("CyberTruck");

        WebElement save = driver.findElement(By.xpath("//button[.='Save']"));
        save.click();

        Thread.sleep(1000);

        WebElement activityTab = driver.findElement(By.xpath("//a[.='Activity']"));
        activityTab.click();

        Thread.sleep(2000);

        WebElement drp = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
        drp.click();

        Thread.sleep(1000);

        WebElement config = driver.findElement(By.xpath("//a[.='My Configuration']"));
        config.click();

        Thread.sleep(1000);
        WebElement checkbox = driver.findElement(By.xpath("//input[@name='localization[oro_locale___locale][use_parent_scope_value]']"));
        checkbox.click();





    }

}