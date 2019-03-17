package com.test.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestJane3 {
//    //WebDriver driver;
//    @BeforeMethod
//    public void beforeMethod1(){
//        //System.setProperty("webdriver.chrome.driver", "E:\\workplace\\jane_test\\driver\\chromedriver.exe");
//        //driver = new ChromeDriver();
//        //driver.get("http://www.baidu.com");
//    }
    @Test
    public void test1() throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        WebDriver dr = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), dc);
        dr.get("http://www.baidu.com");
        Thread.sleep(10000);
        dr.quit();
    }

    @Test
    public void test2() throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        WebDriver dr = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), dc);
        dr.get("http://www.baidu.com");
        Thread.sleep(10000);
        dr.quit();
    }

    @Test
    public void test3() throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        WebDriver dr = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), dc);
        dr.get("http://www.baidu.com");
        Thread.sleep(10000);
        dr.quit();
    }

    @Test
    public void test4() throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        WebDriver dr = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), dc);
        dr.get("http://www.baidu.com");
        Thread.sleep(10000);
        dr.quit();
    }
}
