package bankOfAmerica;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {



    @Test(priority = 1)
    public void testHomePage(){

        String actualResult="Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
        String expectedResults=driver.getTitle();
        Assert.assertEquals(actualResult,expectedResults,"Title do not match");
    }

    @Test(priority = 2)
    public void testSearchBox() throws InterruptedException {
        checkSearchBox();
        String actualText="Credit Cards";
        String expectedText=driver.findElement(By.xpath("//*[@id=\"searchStub\"]/div/div/div/div/div[5]/p[1]/span")).getText();
        Assert.assertEquals(actualText,expectedText,"Text do not match");
    }
    @Test(priority = 3)
    public void testSignInButton(){
        String actualResult="Your Online ID is missing. Please try again.";
        String expectedResult=driver.findElement(By.className("spa-btn spa-btn--primary spa-btn--block spa-btn--medium")).getText();
        Assert.assertEquals(actualResult,expectedResult,"Text do not match");

    }
}
