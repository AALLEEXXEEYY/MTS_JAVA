package step_definitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogPageStepsDef {

    private static final By MORE_BUTTON = By.xpath("//*[@id='comjshop_list_product']/div[1]/div[2]/div/div/div[3]/div[8]/a[2]");
    private static final By PRODUCTS_NAME = By.xpath("//div[contains(@class,'productitem')]/div[@class='name']/a");

    @И("^выбирает продукт \"(.*)\"$")
    public void selectProduct(String productName) {
        SelenideElement product = $$(PRODUCTS_NAME).findBy(Condition.text(productName)).parent().parent();
        $(MORE_BUTTON).click();

    }

}
