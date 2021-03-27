package bankOfAmerica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {

    String chromeDriverPath="BrowserDrivers/windows/chromedriver.exe";
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver= new ChromeDriver();
        driver.get("https://www.bankofamerica.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public void checkSearchBox() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-search-query")).sendKeys("Credit Cards");
        driver.findElement(By.xpath("//*[@id=\"searchStub\"]/div/div/form/div[1]/input[2]")).click();
        Thread.sleep(2000);

    }
    public void checkSignInButton(){
        driver.findElement(By.className("spa-btn spa-btn--primary spa-btn--block spa-btn--medium")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }













}
