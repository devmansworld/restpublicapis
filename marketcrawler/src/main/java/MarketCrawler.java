import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.HashMap;
import java.util.Map;

public class MarketCrawler {
    public static void main(String[] args) throws InterruptedException {


        String correo = "ext_landpachecod@falabella.cl";
        String password = "Falabella2021";

        System.setProperty("webdriver.chrome.driver","src/test/resources/webdriver/windows/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://sellercenter-staging.falabella.com/");
        driver.findElement(By.linkText("Azure AD ・ Falabella Login")).click();
        driver.findElement(By.id("idSIButton9")).click();

        driver.findElement(By.className("form-control ltr_override input ext-input text-box ext-text-box")).sendKeys(correo);
        driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys(correo);
        driver.wait(200);
        driver.wait(300);
        Wait wait = new FluentWait("");

        driver.wait(300);
//abre logon
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(correo);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.linkText("Ingresar")).click();
        driver.wait(200);

        //encuentra el portal de seller center
        //clickea donde dice AD logon
        driver.findElement(By.xpath("")).click();

        //sistema redirige al main
        //debe clickar menu admin
        driver.findElement(By.xpath("")).click();
        //seller - seller management
        driver.findElement(By.xpath("")).click();
//pestaña manual trx
        driver.findElement(By.xpath("")).click();

        //ingresa seller name
        driver.findElement(By.id("")).sendKeys();


        //escoge dropdown

        //todo: Dropdown elements management.
        driver.findElements(By.linkText(""));
        driver.findElement(By.id("")).sendKeys();

        Select trxChooser = new Select (driver.findElement(By.id("")));
        Select currencyChooser = new Select (driver.findElement(By.xpath("")));



        trxChooser.selectByValue("");
        trxChooser.selectByValue("");
        trxChooser.selectByVisibleText("");
        trxChooser.selectByIndex(0);
        trxChooser.deselectAll();

        currencyChooser.selectByIndex(0);
        currencyChooser.selectByValue("");
        currencyChooser.selectByVisibleText("");
        currencyChooser.deselectAll();

        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).getText();
        driver.findElement(By.linkText(""));
        String mensajeEmision = null;
        WebElement botonArriba = null;
        WebElement botonAlmedio = null;
        WebElement primerDropdown = null;
        WebElement segundoDropdown = null;
        WebElement primerTextInput = null;
        WebElement segundoTextInput = null;
        WebElement amountInput = null;
        WebElement currencySelector = null;
        WebElement goCreateButton = null;

        String primero = "";
        String segundo = "";
        String tercero = "";
        String cuarto = "";
        String quinto = "";
        String sexto = "";
        String septimo = "";

        Map<String, Boolean> dynamicTable = new HashMap<>();
        dynamicTable.put(primerTextInput.getText(),primerTextInput.isDisplayed() );
        dynamicTable(segundoTextInput.getText(),segundoTextInput.isDisplayed());
        driver.close();
        driver.quit();

    }

    private static void dynamicTable(String text, boolean displayed) {
    }
}







