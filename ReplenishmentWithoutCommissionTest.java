import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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

    @Test
    public void testEmptyFieldsForHomeInternet() {
        ReplenishmentWithoutCommission replenishmentWithoutCommission = new ReplenishmentWithoutCommission(driver);
        replenishmentWithoutCommission.clickDropdown();
        replenishmentWithoutCommission.selectHomeInternet();
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

    @Test
    public void testEmptyFieldsInstallment() {
        ReplenishmentWithoutCommission replenishmentWithoutCommission = new ReplenishmentWithoutCommission(driver);
        replenishmentWithoutCommission.clickDropdown();
        replenishmentWithoutCommission.selectInstallment();
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

    @Test
    public void testEmptyFieldsDebt() {
        ReplenishmentWithoutCommission replenishmentWithoutCommission = new ReplenishmentWithoutCommission(driver);
        replenishmentWithoutCommission.clickDropdown();
        replenishmentWithoutCommission.selectDebt();
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

    @Test
    public void testAmontOnFrame() {
        ReplenishmentWithoutCommission replenishmentWithoutCommission = new ReplenishmentWithoutCommission(driver);
        replenishmentWithoutCommission.enterMobileNumberField("297777777");
        replenishmentWithoutCommission.enterAmountField("10");
        replenishmentWithoutCommission.clickContinueButton();
        WebElement iframe = driver.findElement(By.cssSelector("body > div.bepaid-app > div > iframe"));
        driver.switchTo().frame(iframe);
        WebElement amount = driver.findElement(By.xpath("//span[contains(text(),'10.00 BYN')]"));
        String expectedTextAmount = "10.00 BYN";
        String amountText = amount.getText();
        Assert.assertEquals(amountText, expectedTextAmount, "Текст не совпадает");
    }

    @Test
    public void testAmountButtonOnFrame() {
        ReplenishmentWithoutCommission replenishmentWithoutCommission = new ReplenishmentWithoutCommission(driver);
        replenishmentWithoutCommission.enterMobileNumberField("297777777");
        replenishmentWithoutCommission.enterAmountField("10");
        replenishmentWithoutCommission.clickContinueButton();
        WebElement iframe = driver.findElement(By.cssSelector("body > div.bepaid-app > div > iframe"));
        driver.switchTo().frame(iframe);
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'375297777777')]"));
        String expectedTextButton = "Оплата: Услуги связи Номер:375297777777";
        String buttonText = button.getText();
        Assert.assertEquals(buttonText, expectedTextButton, "Текст не совпадает");
    }

    @Test
    public void testPhoneNumberOnFrame() {
        ReplenishmentWithoutCommission replenishmentWithoutCommission = new ReplenishmentWithoutCommission(driver);
        replenishmentWithoutCommission.enterMobileNumberField("297777777");
        replenishmentWithoutCommission.enterAmountField("10");
        replenishmentWithoutCommission.clickContinueButton();
        WebElement iframe = driver.findElement(By.cssSelector("body > div.bepaid-app > div > iframe"));
        driver.switchTo().frame(iframe);
        WebElement button = driver.findElement(By.xpath("//button [@class='colored disabled']"));
        String expectedTextButton = "Оплатить 10.00 BYN";
        String buttonText = button.getText();
        Assert.assertEquals(buttonText, expectedTextButton, "Текст не совпадает");
    }

    @Test
    public void testcardPlaceholdersOnFrame() {
        ReplenishmentWithoutCommission replenishmentWithoutCommission = new ReplenishmentWithoutCommission(driver);
        replenishmentWithoutCommission.enterMobileNumberField("297777777");
        replenishmentWithoutCommission.enterAmountField("10");
        replenishmentWithoutCommission.clickContinueButton();
        WebElement iframe = driver.findElement(By.cssSelector("body > div.bepaid-app > div > iframe"));
        driver.switchTo().frame(iframe);
        WebElement numberCardField = driver.findElement(By.xpath("//label[contains(text(), 'Номер карты')]"));
        String expectedNumberCard = "Номер карты";
        String numberCardText = numberCardField.getText();
        Assert.assertEquals(numberCardText, expectedNumberCard, "Текст не совпадает");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}