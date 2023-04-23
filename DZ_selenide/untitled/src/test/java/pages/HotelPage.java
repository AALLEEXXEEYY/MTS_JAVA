package pages;
import org.openqa.selenium.By;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HotelPage {

//    SearchPage searchpagge = new SearchPage();
    private final static By APPROVE_NAME = By.xpath("/html/body/div[3]/div/div[5]/div[1]/div[1]/div[1]/div/div[2]/div[11]/div[1]/div/div/h2");
    private final static By APPROVE_AMOUNT_STARS = By.xpath("//*[@data-testid='rating-stars']");
    private final static By APPROVE_RATING = By.xpath("/html/body/div[3]/div/div[5]/div[1]/div[1]/div[1]/div/div[2]/div[13]/div/div/div[1]/div[2]/div/div[1]/a/div/div/div/div[1]");
    private final static By APPROVE_FEEDBACK = By.xpath("/html/body/div[3]/div/div[5]/div[1]/div[1]/div[1]/div/div[2]/div[13]/div/div/div[1]/div[2]/div/div[1]/a/div/div/div/div[2]/div[2]");
    private final static By APPROVET_PRICE = By.xpath("/html/body/div[3]/div/div[5]/div[1]/div[1]/div[3]/div/div[4]/div[3]/div/form/div[8]/div[1]/table/tbody/tr[1]/td[3]/div/div[1]/div[1]/div[2]/div/span[1]");
    private final static By ATLAS_HOTEL = By.xpath("/html/body/div[12]/div[3]/div[4]/div[3]/div/div/div[2]/div[2]/div/div[3]/div[1]/div/div");
    public HotelPage openSearchPage() {

        $(ATLAS_HOTEL).click();
        sleep(4000);
        return this;
    }
    public HotelPage approveHotel(SearchPage searchpagge) {
        $(APPROVE_NAME).shouldHave(text(searchpagge.name));
        $(APPROVE_AMOUNT_STARS).shouldHave(text(searchpagge.amountStars));
        $(APPROVE_RATING).shouldHave(text(searchpagge.ratingHotel));
        $(APPROVE_FEEDBACK).shouldHave(text(searchpagge.feedbackHotel));
        $(APPROVET_PRICE).shouldHave(text(searchpagge.priceHotel));
        return this;
    }




}
