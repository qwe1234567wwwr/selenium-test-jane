package com.test.day01;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.sun.java.util.jar.pack.DriverResource;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.sound.midi.ControllerEventListener;

import static java.awt.event.KeyEvent.VK_CONTROL;
import static java.awt.event.KeyEvent.VK_SHIFT;

public class TestJane {
//    //WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){

    }
   @DataProvider(name="data4")
   public  Object[][] test1(){
         return new Object[][]{
           {"chrome"},
          // {"firefox"}
       };
   }
    @Test(dataProvider="data4")
    public void test2(String browser) throws MalformedURLException, InterruptedException {
       DesiredCapabilities dc = null;
       if(browser.contentEquals("chrome")){
           dc=DesiredCapabilities.chrome();
       }else if(browser.contentEquals("firefox")){
           dc=DesiredCapabilities.firefox();
       }else {
           System.out.println("error");
       }
       WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.2:4444/wd/hub"),dc);
       driver.get("http://www.baidu.com");
       Thread.sleep(3000);
       driver.quit();
    }


}
