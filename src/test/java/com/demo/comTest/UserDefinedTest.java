package com.demo.comTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UserDefinedTest {
    WebDriver driver;
    @Test
    public void first(){
        String dir=System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver", dir+"\\browserDriver\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
    public void second(){
        driver.findElement(By.xpath("//*[@id=\'nav-xshop\']/a[2]")).click();
    }
}
