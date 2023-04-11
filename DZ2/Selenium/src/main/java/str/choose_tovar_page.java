package str;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class choose_tovar_page {

    WebDriver driver;
    @FindBy(xpath = "//*[@class='js-store-prod-name js-product-name t-store__card__title t-name t-name_md']")
    private WebElement futbolka;
    @FindBy (xpath = "//*[@class='t706__carticon-img']")
    private WebElement znachokKorzina;
    @FindBy(xpath = "//*[@class=\"t706__sidebar-continue t-btn\"]")
    private WebElement knopkaOformitZakaz;
    public choose_tovar_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public choose_tovar_page Delay_1() {
        WebElement delay_1 = new WebDriverWait(driver, 10L)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='js-store-prod-name js-product-name t-store__card__title t-name t-name_md']")));
        return this;
    }
    public choose_tovar_page addFutbolka() {
        futbolka.click();
        return this;
    }
    public choose_tovar_page tapKorzina() {
        znachokKorzina.click();
        return this;
    }

    public choose_tovar_page oformitZakaz() {
        knopkaOformitZakaz.click();
        return this;
    }
}


