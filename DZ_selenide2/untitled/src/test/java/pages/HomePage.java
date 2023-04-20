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

    private final static By CHOOOSE_CARS = By.xpath("//a[@id=\"cars\"]");

    public HomePage OpenHomePage(){
        Selenide.open(cfg.Url());
        return this;
    }
    public HomePage acceptcookie(){

        $(ACCEPT_COOKIE_BUTTON).click();
        return this;
    }

    public HomePage clickcar(){

        $(CHOOOSE_CARS).click();
        sleep(4000);

        return this;


    }


}




