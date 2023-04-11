package str;


import org.openqa.selenium.WebDriver;
import org.assertj.core.api.SoftAssertions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proverka_NT {

    private final String baseUrl = "https://homebrandofficial.ru/wear";
    private final WebDriver driver;

    @FindBy(xpath = "//*[@class='js-errorbox-all t-form__errorbox-wrapper']")
    public WebElement errorbox;

    public Proverka_NT(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openHomePage() {
        driver.get(baseUrl);
    }

    public void errorBoxShouldBe(SoftAssertions softAssert, String expectedTitle) {
        softAssert.assertThat(errorbox.getText()).as("Окно ошибки не правильное")
                .isEqualTo(expectedTitle);
    }
}



