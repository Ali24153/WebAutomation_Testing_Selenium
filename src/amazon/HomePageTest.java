package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomepageNew {
    @Test(priority = 2)
    public void testCellPhone() throws InterruptedException {
        checkSearchBox();
        String actualResults = "\"metro pcs cell phones\"";
        String expectedResults = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualResults, expectedResults, "Test Failed");
    }

    @Test(priority = 1)
    public void testPageTitle(){
        String actualResult="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String expectedResults=driver.getTitle();
        Assert.assertEquals(actualResult,expectedResults,"Text do not match");

    }
}
