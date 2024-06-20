import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ReplenishmentWithoutCommission {

    private final WebDriver driver;

    public ReplenishmentWithoutCommission(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clickAcceptButton() {
        driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
    }

    public void clickDropdown() {
        driver.findElement(By.xpath("//span[text()='Услуги связи']")).click();
    }

    public void selectHomeInternet() {
        driver.findElement(By.xpath("//p[text()='Домашний интернет']")).click();
    }

    public void selectInstallment() {
        driver.findElement(By.xpath("//p[text()='Рассрочка']")).click();
    }

    public void selectDebt() {
        driver.findElement(By.xpath("//p[text()='Задолженность']")).click();
    }

    public void enterMobileNumberField(String number) {
        driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).sendKeys(number);
    }

    public void enterAmountField(String amount) {
       driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).sendKeys(amount);
    }

    public void clickContinueButton() {
        driver.findElement(By.xpath("//form[@id = 'pay-connection']/button[@type = 'submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.bepaid-app iframe")));
    }

}
//driver.switchTo().defaultContent();
//driver.switchTo().parentFrame(0)
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allowpaymentrequest]")))
//driver.findElement(By.xpath("//span[text()='10.00 BYN']")).getText()