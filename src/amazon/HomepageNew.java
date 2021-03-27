package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageNew {
    String amazonUrl = "https://amazon.com/";
    WebDriver driver;
    String searchBoxIdLocator = "twotabsearchtextbox";
    String searchThisItem="metro pcs cell phones";
    String dropdownClass="nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown";
    String samsungPath="#p_89\\/SAMSUNG > span > a > div > label > i";
    @BeforeMethod
    public void setUp() {

            String chromeDriverPath = "BrowserDrivers/windows/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
            driver.get(amazonUrl);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

    }



 //Action method
    public void checkSearchBox() throws InterruptedException {
        //driver.findElement(By.className(dropdownClass)).click();
        driver.findElement(By.id(searchBoxIdLocator)).sendKeys(searchThisItem);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(samsungPath)).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#low-price")).sendKeys("170");
        driver.findElement(By.cssSelector("#high-price")).sendKeys("210");
        driver.findElement(By.cssSelector("#a-autoid-1 > span > input")).click();
        driver.findElement(By.cssSelector("#p_n_feature_twelve_browse-bin\\/14674909011 > span > a > div > label > i")).click();
        //driver.findElement(By.cssSelector("#p_n_feature_seven_browse-bin\\/6215731011 > span > a > div > label > i")).click();
        //driver.findElement(By.cssSelector("#p_n_feature_thirteen_browse-bin\\/14674918011 > span > div > label > i")).click();
        //driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-4-of-16.sg-col.sg-col-4-of-20 > div > div > span > a > div > img")).click();

    }

    @AfterMethod
    public void tearDown(){
        //driver.manage();// only close one browser
        driver.quit();// will close all the browsers
    }
}
