package demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class JDISitetest {


    @Test
    public void Test_A() {

        System.setProperty("webdriver.chrome.driver","C:/Users/1/MTS1/DZ2/Chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        SoftAssertions softAssertions = new SoftAssertions();
        driver.get("https://homebrandofficial.ru/wear");
        WebElement delay_1 = new WebDriverWait(driver,5L)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"query\"]")));

        driver.findElement(By.xpath("//*[@class=\"t-store__search-icon js-store-filter-search-btn\"]")).click();

        driver.findElement(By.xpath("//*[@name=\"query\"]")).sendKeys("Лонгслив White&Green");

        driver.findElement(By.xpath("//*[@class=\"t-store__search-icon js-store-filter-search-btn\"]")).click();


        WebElement delay_2 = new WebDriverWait(driver, 5L)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='t-store__filter__prods-number js-store-filters-prodsnumber-wrap t-descr t-descr_xxs']")));

        String count = driver.findElement(By.xpath("//*[@class='t-store__filter__prods-number js-store-filters-prodsnumber-wrap t-descr t-descr_xxs']")).getText();
        String Trueauntification = "Найдено: 1";

        softAssertions.assertThat(count).as("Неправильное количество").isEqualTo(Trueauntification);

        String name = driver.findElement(By.xpath("//*[@class='js-store-prod-name js-product-name t-store__card__title t-name t-name_md']")).getText();
        String trueName = "Лонгслив White&Green";

        softAssertions.assertThat(name).as("Неправильное название").isEqualTo(trueName);

        String cost = driver.findElement(By.xpath("//*[@class='js-product-price js-store-prod-price-val t-store__card__price-value notranslate']")).getText();

        String trueCost = "2 800";


        softAssertions.assertThat(cost).as("Неправильно указана цена").isEqualTo(trueCost);

        softAssertions.assertAll();


    }

}
