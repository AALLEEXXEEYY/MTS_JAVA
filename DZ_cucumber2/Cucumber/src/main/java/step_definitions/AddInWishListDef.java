package step_definitions;

import io.cucumber.java.ru.И;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class AddInWishListDef {

    private static final By AMOUNT_BUTTON = By.xpath("//input[@onkeyup='reloadPrices();']");

    private static final By BASKET_BUTTON = By.xpath("//input[@class='btn btn-primary button btn-buy']");



    @И("^меняем количество товара на одиннадцать$")
    public void setAmount(){
        $(AMOUNT_BUTTON).sendKeys("1");

    }
    @И("^добавляем товар в корзину$")
    public void selectProduct() {
        $(BASKET_BUTTON).click();
    }

}
