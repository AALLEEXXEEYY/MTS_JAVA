package pages;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SearchPage {

    private final static By SHOW_ON_MAP = By.xpath("(//*[@data-testid='map-trigger'])[1]");
    private final static By HOTEL = By.cssSelector("#b2searchresultsPage > div.map_full_overlay__wrapper > div.map_with_list__container > div.map_left_cards.map_left_cards--v2 > div.map_left_cards__container > div > a:nth-child(1) > div.map-card__content-container > div.map-card__title > span");
    private final static By NAME_HOTEL = By.xpath("/html/body/div[12]/div[3]/div[2]/div[2]/div/a[1]/div[3]/div[1]/span");
    private final static By AMOUNT_STARS = By.xpath("/html/body/div[12]/div[3]/div[2]/div[2]/div/a[1]/div[3]/div[1]/span/span/span/span");
    private final static By RATING_HOTEL = By.xpath("/html/body/div[12]/div[3]/div[2]/div[2]/div/a[1]/div[3]/div[2]/div/div/div[1]");
    private final static By FEEDBACK_HOTEL = By.xpath("/html/body/div[12]/div[3]/div[2]/div[2]/div/a[1]/div[3]/div[2]/div/div/div[2]/div[2]");
    private final static By PRICE_HOTEL = By.xpath("/html/body/div[12]/div[3]/div[2]/div[2]/div/a[1]/div[3]/div[3]/div[3]/div[2]/div/div[2]/span[1]");
    public String name;

    public String amountStars;

    public String ratingHotel;

    public String feedbackHotel;

    public String priceHotel;

    public SearchPage Showonmap() {

        $(SHOW_ON_MAP).click();
        return this;
    }
    public SearchPage saveData() {

        sleep(6000);
        $(HOTEL).hover();
        name=$(NAME_HOTEL).getText();
        amountStars=$(AMOUNT_STARS).getText();
        ratingHotel=$(RATING_HOTEL).getAttribute("aria-label");
        feedbackHotel=$(FEEDBACK_HOTEL).getText();
        priceHotel=$(PRICE_HOTEL).getText();
        return this;
    }

}





