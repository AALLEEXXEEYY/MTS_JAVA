package str;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Zapolnit_zakaz {
    WebDriver driver;
    @FindBy (xpath = "//*[@id='input_1496239431201']")
    private WebElement nameInput;
    @FindBy (xpath = "(//*[@class='t-input t-input-phonemask'])[2]")
    private WebElement telephoneInput;
    @FindBy (xpath = "//*[@id='input_1627385047591']")
    private WebElement regionInput;
    @FindBy (xpath = "//*[@id='input_1630305196291']")
    private WebElement adressInput;
    @FindBy (xpath = "//*[@name='tildadelivery-city']")
    private WebElement cityInput;
    @FindBy (xpath = "//*[@class='t-radio__indicator']")
    private WebElement vyborDostavki;
    @FindBy (xpath = "//*[@name='tildadelivery-userinitials']")
    private WebElement recipient;
    @FindBy (xpath = "//*[@name='tildadelivery-street']")
    private WebElement street;
    @FindBy (xpath = "//*[@name='tildadelivery-house']")
    private WebElement house;
    @FindBy (xpath = "//*[@name='tildadelivery-aptoffice']")
    private WebElement office;
    @FindBy (xpath = "//*[@class='t-submit' and text()='ОФОРМИТЬ ЗАКАЗ']")
    private WebElement confirmBtn;
    public Zapolnit_zakaz(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public Zapolnit_zakaz Delay_3() {
        WebElement delay_3 = new WebDriverWait(driver, 10L)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='tildadelivery-userinitials']")));
        return this;
    }
    public Zapolnit_zakaz Delay_4() {
        WebElement delay_4 = new WebDriverWait(driver, 10L)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='t-submit' and text()='ОФОРМИТЬ ЗАКАЗ']")));
        return this;
    }
    public Zapolnit_zakaz enterUsername(String username) {
        nameInput.sendKeys(username);
        return this;
    }
    public Zapolnit_zakaz enterTelephone(String telephone) {
        telephoneInput.sendKeys(telephone);
        return this;
    }
    public Zapolnit_zakaz enterRegion(String region) {
        regionInput.sendKeys(region);
        return this;
    }
    public Zapolnit_zakaz enterAdress(String adress) {
        adressInput.sendKeys(adress);
        return this;
    }
    public Zapolnit_zakaz enterRecipient(String recipientName) {
        recipient.sendKeys(recipientName);
        return this;
    }
    public Zapolnit_zakaz enterStreet(String streetName) {
        street.sendKeys(streetName);
        return this;
    }
    public Zapolnit_zakaz enterHouse(String houseNumber) {
        house.sendKeys(houseNumber);
        return this;
    }
    public Zapolnit_zakaz enterOffice(String officeNumber) {
        office.sendKeys(officeNumber);
        return this;
    }

    public Zapolnit_zakaz clickConfirm() {
        confirmBtn.click();
        return this;
    }
}


