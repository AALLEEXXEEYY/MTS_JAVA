package tests;

import pages.HomePage;
import pages.SearchPage;
import pages.finalpage;
import org.junit.Test;

public class FirstSelenideTest extends BaseTest{

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    finalpage finalpage = new finalpage();
    private String city= "Париж";
    private String old = "17";




    @Test
    public void bookingHotel() {

        homePage.OpenHomePage()
                .acceptcookie()
                .clickcar();

        searchPage.opinions(city)
                .yearsold(old)
                .search();

        finalpage.finalanswer();



    }
}







