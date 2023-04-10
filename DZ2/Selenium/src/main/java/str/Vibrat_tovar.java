package str;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Vibrat_tovar {

    WebDriver driver;
    @FindBy(xpath = "//*[@class='js-store-prod-name js-product-name t-store__card__title t-name t-name_md']")
    private WebElement futbolka;
    @FindBy (xpath = "//*[@class='t706__carticon-img']")
    private WebElement znachokKorzina;
    @FindBy(xpath = "//*[@class=\"t706__sidebar-continue t-btn\"]")
    private WebElement knopkaOformitZakaz;
    public Vibrat_tovar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public Vibrat_tovar Delay_1() {
        WebElement delay_1 = new WebDriverWait(driver, 10L)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='js-store-prod-name js-product-name t-store__card__title t-name t-name_md']")));
        return this;
    }
    public Vibrat_tovar addFutbolka() {
        futbolka.click();
        return this;
    }
    public Vibrat_tovar tapKorzina() {
        znachokKorzina.click();
        return this;
    }

    public Vibrat_tovar oformitZakaz() {
        knopkaOformitZakaz.click();
        return this;
    }
}


