import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class Tests {

    @Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();
        WebElement blockName = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        String expectedName = "Онлайн пополнение\nбез комиссии";
        Assert.assertEquals(blockName.getText(), expectedName);
        driver.quit();
    }

    @Test
    public void secondTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();
        List<WebElement> paymentLogos = driver.findElements(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
        Assert.assertFalse(paymentLogos.isEmpty());
        driver.quit();
    }

    @Test
    public void thirdTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();
        WebElement infoLink = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        infoLink.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        driver.quit();
    }

    @Test
    public void fourthTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();
        WebElement fieldPhone = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        fieldPhone.sendKeys("297777777");
        WebElement fieldSum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        fieldSum.sendKeys("50");
        WebElement fieldEmail = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        fieldEmail.sendKeys("mts@gmail.com");
        WebElement buttonContinue = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        buttonContinue.click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.cssSelector("div.bepaid-app iframe")).isDisplayed());
        driver.quit();
    }

}
