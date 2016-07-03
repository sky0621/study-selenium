package sample.pageobjectpattern.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.name;

/**
 * Created by SS on 2016/07/02.
 */
interface IfReservePage {

    WebDriver getDriver();

    default void checkTitle(String title) {
        if (!title.equals(getDriver().getTitle())) {
            throw new IllegalStateException("現在のページが間違っています：" + getDriver().getTitle());
        }
    }

    default void replaceVales(WebElement webElement, String value) {
        webElement.clear();
        webElement.sendKeys(value);
    }

    default String getText(WebElement webElement) {
        return webElement.getText();
    }

    default void click(WebElement webElement) {
        webElement.click();
    }

    default void clickIfSelected(WebElement webElement) {
        if (!webElement.isSelected()) {
            click(webElement);
        }
    }

    default void clickByOnOff(boolean on, WebElement webElementForOn, WebElement webElementForOff) {
        if(on) {
            click(webElementForOn);
        } else {
            click(webElementForOff);
        }
    }

}
