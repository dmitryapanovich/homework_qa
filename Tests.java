import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class Tests {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/dmitryapanovich/IdeaProjects/Autotest/src/main/resources/chromedriver");
        driver = new ChromeDriver();
     //   wait = new WebDriverWait(driver, 10);
        driver.get("http://mts.by");
    }

    @Test
    public void testEmptyFieldsForMobileServices() {
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();
        WebElement mobileNumberField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        String placeholderMobile = mobileNumberField.getAttribute("placeholder");
        assert placeholderMobile.equals("Номер телефона") : "Неверный текст в плейсхолдере для поля Номер телефона";
        WebElement mobileAmountField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        String placeholderAmount = mobileAmountField.getAttribute("placeholder");
        assert placeholderAmount.equals("Сумма") : "Неверный текст в плейсхолдере для поля Сумма";
        WebElement mobileEmailField = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        String placeholderEmail = mobileEmailField.getAttribute("placeholder");
        assert placeholderEmail.equals("E-mail для отправки чека") : "Неверный текст в плейсхолдере для поля Сумма";
    }

    @Test
    public void testEmptyFieldsForHomeInternet() {
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p"));
        option.click();
        WebElement mobileNumberField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        String placeholderMobile = mobileNumberField.getAttribute("placeholder");
        assert placeholderMobile.equals("Номер телефона") : "Неверный текст в плейсхолдере для поля Номер телефона";
        WebElement mobileAmountField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        String placeholderAmount = mobileAmountField.getAttribute("placeholder");
        assert placeholderAmount.equals("Сумма") : "Неверный текст в плейсхолдере для поля Сумма";
        WebElement mobileEmailField = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        String placeholderEmail = mobileEmailField.getAttribute("placeholder");
        assert placeholderEmail.equals("E-mail для отправки чека") : "Неверный текст в плейсхолдере для поля Сумма";
    }

    @Test
    public void testEmptyFieldsInstallment() {
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p"));
        option.click();
        WebElement mobileNumberField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        String placeholderMobile = mobileNumberField.getAttribute("placeholder");
        assert placeholderMobile.equals("Номер телефона") : "Неверный текст в плейсхолдере для поля Номер телефона";
        WebElement mobileAmountField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        String placeholderAmount = mobileAmountField.getAttribute("placeholder");
        assert placeholderAmount.equals("Сумма") : "Неверный текст в плейсхолдере для поля Сумма";
        WebElement mobileEmailField = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        String placeholderEmail = mobileEmailField.getAttribute("placeholder");
        assert placeholderEmail.equals("E-mail для отправки чека") : "Неверный текст в плейсхолдере для поля Сумма";
    }

    @Test
    public void testEmptyFieldsDebt() {
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p"));
        option.click();
        WebElement mobileNumberField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        String placeholderMobile = mobileNumberField.getAttribute("placeholder");
        assert placeholderMobile.equals("Номер телефона") : "Неверный текст в плейсхолдере для поля Номер телефона";
        WebElement mobileAmountField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        String placeholderAmount = mobileAmountField.getAttribute("placeholder");
        assert placeholderAmount.equals("Сумма") : "Неверный текст в плейсхолдере для поля Сумма";
        WebElement mobileEmailField = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        String placeholderEmail = mobileEmailField.getAttribute("placeholder");
        assert placeholderEmail.equals("E-mail для отправки чека") : "Неверный текст в плейсхолдере для поля E-mail для отправки чека";
    }

    @Test
    public void testPaymentModalWindow() {
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
        acceptButton.click();
        WebElement fieldPhone = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        fieldPhone.sendKeys("297777777");
        WebElement fieldSum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        fieldSum.sendKeys("10");
        WebElement buttonContinue = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        buttonContinue.click();
    //    К сожалению не получается добавить явное ожидание из-за ошибки java: incompatible types: int cannot be converted to java.time.Duration
    //    WebElement modalWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modalWindow")));
    //    WebElement sumText = modalWindow.findElement(By.id("sumText"));
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.cssSelector("div.bepaid-app iframe")).isDisplayed());
      //  WebElement sumText = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div/span[1]"));
      //  assertEquals(sumText.getText(), "10", "Неверная сумма отображена");


      //  WebElement payButton = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button"));
      //  assertEquals(payButton.getText(), "Оплатить  10.00 BYN", "Неверный сумма отображена на кнопке");


     //   WebElement phoneNumberLabel = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/span"));
     //   assertEquals(phoneNumberLabel.getText(), "Оплата: Услуги связи Номер:375297777777", "Неверный номер отображен");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
