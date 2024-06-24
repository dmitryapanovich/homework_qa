import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ReplenishmentWithoutCommissionTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://mts.by");
        ReplenishmentWithoutCommission replenishmentWithoutCommission = new ReplenishmentWithoutCommission(driver);
        replenishmentWithoutCommission.clickAcceptButton();
    }

    @Test
    public void testEmptyFieldsForMobileServices() {
        WebElement mobileNumberField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        String placeholderMobile = mobileNumberField.getAttribute("placeholder");
        WebElement mobileAmountField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        String placeholderAmount = mobileAmountField.getAttribute("placeholder");
        WebElement mobileEmailField = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        String placeholderEmail = mobileEmailField.getAttribute("placeholder");
        assert placeholderMobile.equals("Номер телефона") : "Неверный текст в плейсхолдере для поля Номер телефона";
        assert placeholderAmount.equals("Сумма") : "Неверный текст в плейсхолдере для поля Сумма";
        assert placeholderEmail.equals("E-mail для отправки чека") : "Неверный текст в плейсхолдере для поля Сумма";
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}