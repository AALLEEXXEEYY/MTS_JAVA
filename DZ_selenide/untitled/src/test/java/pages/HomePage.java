package pages;



import config.ProjectConfig;
import com.codeborne.selenide.Selenide;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage {
    public static final ProjectConfig cfg = ConfigFactory.create(ProjectConfig.class);
    private final static By ACCEPT_COOKIE_BUTTON =By.xpath("//button[@id='onetrust-accept-btn-handler']");

    private final static By SEARCH_CITY = By.xpath("//*[@class='ce45093752']");
    private final static By CLICK_DATE = By.xpath("//*[@class='b91c144835']");
    private final static By CHOOSE_DATE = By.xpath("(//*[@class=\"e2f0d47913\"])[44]");


    private final By SEARCH = By.xpath("//*[@class='fc63351294 a822bdf511 d4b6b7a9e7 cfb238afa1 c938084447 f4605622ad aa11d0d5cd']");

    public HomePage OpenHomePage(){
        Selenide.open(cfg.Url());
        return this;
    }
    public HomePage acceptcookie(){

        $(ACCEPT_COOKIE_BUTTON).click();
        return this;
    }

    public HomePage searchCity(String city){

        $(SEARCH_CITY).sendKeys(city);
        sleep(4000);
        $(CLICK_DATE).click();
        $(CHOOSE_DATE).click();
        $(SEARCH).click();
        return this;


    }


}




