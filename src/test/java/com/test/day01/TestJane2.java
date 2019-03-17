package com.test.day01;

import com.po.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.DirectColorModel;
import java.net.MalformedURLException;
import java.net.URL;

public class TestJane2 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "E:\\workplace\\jane_test\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.163.com/");
    }
    @Test
    public void test1() throws InterruptedException {
        WebElement i = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(i);
        Thread.sleep(3000);
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
        driver.findElement(By.name("email")).sendKeys("qwe1234567wwwr");
        driver.findElement(By.name("password")).sendKeys("qwe12345");
        driver.findElement(By.id("dologin")).click();
        //driver.findElement(LoginPage.inputemail).sendKeys("qwe1234567wwwr");
        //driver.findElement(LoginPage.inputpassword).sendKeys("qwe12345");
        //driver.findElement(LoginPage.bottonlogin).click();
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

}
