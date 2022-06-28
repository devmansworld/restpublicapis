import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class BuscaAutos {


    public static void main(String[] args) throws InterruptedException {
        String correofeis = "";
        String correopass = "";
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/marketplace/santiagocl/search/?query=bmw");
        driver.wait(100);
       // driver.findElement(By.linkText("Filters")).click();
        driver.findElement(By.xpath("//*[@id=\"mount_0_0_v/\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div[2]/div")).click();
        driver.wait(100);
        driver.findElement(By.linkText("Sort by")).click();
        driver.wait(100);
        driver.findElement(By.linkText("Lowest")).click();
        driver.wait(1500);

        //driver.findElement(By.id("")).click();

        driver.close();
        driver.quit();
    }
}
/*


        //driver.get("").switch(1);
*
*     public BuscaAutos() {
    }
*
*
driver.switchTo().newWindow(WindowType.WINDOW);
// Opens LambdaTest homepage in the newly opened window
driver.navigate().to("https://www.lambdatest.com/");


* public List<Automaker> makersList = new ArrayList<>(Automaker) {

        driver.switchTo().newWindow(WindowType.WINDOW);
// Opens LambdaTest homepage in the newly opened window
        driver.navigate().to("https://www.facebook.com/marketplace/santiagocl/search/?query=citroen");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/marketplace/santiagocl/search/?query=audi");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/marketplace/santiagocl/search/?query=alfa");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/marketplace/santiagocl/search/?query=volvo");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/marketplace/santiagocl/search/?query=opel");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/marketplace/santiagocl/search/?query=peugeot");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/marketplace/santiagocl/search/?query=renault");

       // driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys(correofeis);
There are 3 ways to do this. In below example I am doing following steps to open the facebook in new tab,

Launching https://google.com
Searching for facebook text and getting the facebook URL
Opening facebook in different tab.
Solution#1: Using window handles.

driver = new ChromeDriver(options);
driver.get("https://www.google.com/search?q=facebook");
String facebookUrl = driver.findElement(By.xpath("(//a[contains(@href,'facebook.com')])[1]")).getAttribute("href");

JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.open()");

ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

driver.get(facebookUrl);
Solution#2: By creating new driver instance. It's not recommended but it is also a possible way to do this.

driver = new ChromeDriver(options);
driver.get("https://www.google.com/search?q=facebook");
String facebookUrl = driver.findElement(By.xpath("(//a[contains(@href,'facebook.com')])[1]")).getAttribute("href");

/*Create an another instance of driver.*/

/*
driver = new ChromeDriver(options);
        driver.get(facebookUrl);
        Solution#3: Using Selenium 4

        driver.get("https://www.google.com/search?q=facebook");
        String facebookUrl = driver.findElement(By.xpath("(//a[contains(@href,'facebook.com')])[1]")).getAttribute("href");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(facebookUrl);
        Share
        Follow


    }*/