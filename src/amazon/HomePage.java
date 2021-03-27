package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

    public static void main(String[] args) throws InterruptedException {

//        // FireFox
//        String geckoDriverPath="BrowserDrivers/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",geckoDriverPath);
//        WebDriver driver1=new FirefoxDriver();
//        driver1.get("https://www.facebook.com/");
//        driver1.manage().window().fullscreen();
//        driver1.manage().deleteAllCookies();
//        Thread.sleep(5000);
//        driver1.close();
//// edge
//        String edgedriverfile="BrowserDrivers/windows/msedgedriver.exe";
//        System.setProperty("webdriver.edge.driver",edgedriverfile);
//        WebDriver driver2 =new EdgeDriver();
//        driver2.get("https://www.cnn.com/");
//        driver2.manage().window().fullscreen();
//        Thread.sleep(6000);
//        driver2.close();


//chrome
        String samsungXpath="#p_89\\/SAMSUNG > span > a > div > label > i";
        String chromeDriverPath="BrowserDrivers/windows/chromedriver.exe";
        String amazonUrl="https://www.amazon.com/";
        String product="metro pcs cell phones";
        String wedEditLocator="twotabsearchtextbox";
        String webButtonLocator="nav-search-submit-button";
         // setproperty is a method
        //webdriver.chrome.driver is the default chrome driver url
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver= new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id(wedEditLocator)).sendKeys(product);
        driver.findElement(By.id(webButtonLocator)).click();
        driver.findElement(By.cssSelector(samsungXpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-opposite-dir > div > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20.sg-col > div > div:nth-child(1) > div > div > div:nth-child(1) > h2 > a > span")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]/span/input")).click();
        //driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        //driver.close();

    }

}
