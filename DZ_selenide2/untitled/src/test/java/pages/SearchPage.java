package pages;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class SearchPage {

    private final static By SEARCH_CITY = By.xpath("//input[@id=\"searchbox-toolbox-fts-pickup\"]");
    private final static By DATE_RECEIVING = By.xpath("//button[@id=\"searchbox-toolbox-date-picker-pickup-date\"]");
    private final static By CHOOSE_DATE = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/span/div/div[1]/div/div/div/div[2]/table/tbody/tr[2]/td[2]/span");
    private final static By TIME_RECEIVING = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/span/div/div[3]/div/div/div/select");
    private final static By DATE_RETURN = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div/button");
    private final static By CHOOSE_DATE1 = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/span/div/div[1]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/span");
    private final static By TIME_RETURN = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/select");
    private final static By PUT_AWAY = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div/div/div/input");
    private final static By INPUT_YEARS = By.xpath("//input[@name=\"drivers-age-input-text\"]");
    private final static By SEARCH_BUTTON = By.xpath("//button[@data-testid=\"searchbox-toolbox-submit-button\"]");


    public SearchPage opinions(String city) {
        sleep(6000);
        $(SEARCH_CITY).sendKeys(city);
        sleep(1000);
        $(DATE_RECEIVING).click();
        sleep(1000);
        $(CHOOSE_DATE).click();
        sleep(1000);
        $(TIME_RECEIVING).click();
        sleep(1000);
        $(DATE_RETURN).click();
        sleep(1000);
        $(CHOOSE_DATE1).click();
        sleep(1000);
        $(TIME_RETURN).click();

        return this;
    }
    public SearchPage yearsold(String old) {

        $(PUT_AWAY).click();
        sleep(5000);
        $(INPUT_YEARS).click();
        sleep(1000);
        $(INPUT_YEARS).sendKeys(old);
        return this;

    }
    public SearchPage search(){
        $(SEARCH_BUTTON).click();
        return this;
    }

}





