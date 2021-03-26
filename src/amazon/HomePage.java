package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

    public static void main(String[] args) throws InterruptedException {


//chrome
        String chromeDriverPath="BrowserDrivers/windows/chromedriver.exe";
         // setproperty is a method
        //webdriver.chrome.driver is the default chrome driver url
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(6000);
        driver.close();
// FireFox
        String geckoDriverPath="BrowserDrivers/windows/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",geckoDriverPath);
        WebDriver driver1=new FirefoxDriver();
        driver1.get("https://www.facebook.com/");
        Thread.sleep(5000);
        driver1.close();
// edge
        String edgedriverfile="BrowserDrivers/windows/msedgedriver.exe";
        System.setProperty("webdriver.edge.driver",edgedriverfile);
        WebDriver driver2 =new EdgeDriver();
        driver2.get("https://www.cnn.com/");
        Thread.sleep(6000);
        driver2.close();
    }

}
