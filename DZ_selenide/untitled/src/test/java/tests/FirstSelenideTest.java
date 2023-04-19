package tests;

import pages.HomePage;
import pages.SearchPage;
import pages.HotelPage;
import org.junit.Test;

public class FirstSelenideTest extends BaseTest{

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    HotelPage hotelPage = new HotelPage();
    private String city= "Париж";


    @Test
    public void bookingHotel() {

        homePage.OpenHomePage()
                .acceptcookie()
                .searchCity(city);

        searchPage.Showonmap();
        searchPage.saveData();

        hotelPage.openSearchPage();
        hotelPage.approveHotel();


    }
}







