import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReplenishmentWithoutCommission {

    private final WebDriver driver;

    public ReplenishmentWithoutCommission(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAcceptButton() {
        driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
    }

}
