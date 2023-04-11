package str;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nazhat_na_oformlenie {

    WebDriver driver;
    @FindBy(xpath = "//*[@class='t-store__prod-popup__btn t-btn t-btn_sm']")
    private WebElement korzina;
    public nazhat_na_oformlenie(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public nazhat_na_oformlenie Delay_2() {
        WebElement delay_2 = new WebDriverWait(driver, 10L)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='t-store__prod-popup__btn t-btn t-btn_sm']")));
        return this;
    }
    public nazhat_na_oformlenie dobavitKorzina() {
        korzina.click();
        return this;
    }
}






