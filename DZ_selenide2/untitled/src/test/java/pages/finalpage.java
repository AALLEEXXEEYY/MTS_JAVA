package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class finalpage {


    private final static By APPROVE_NAME = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/div[2]/div/div[3]/p");


    public finalpage finalanswer() {
        $(APPROVE_NAME).shouldHave(text("Возраст водителя должен быть не менее 18"));

        return this;
    }




}
