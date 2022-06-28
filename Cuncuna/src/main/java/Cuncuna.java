import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Cuncuna {
        public static void main(String[] args) throws InterruptedException {
            String correofeis = "";
            String correopass = "";
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/windows/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/marketplace/santiagocl/search/?query=bmw");
            // driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys(correofeis);
            //driver.findElement(By.id("")).click();
            driver.close();
            driver.quit();
        }
    }










