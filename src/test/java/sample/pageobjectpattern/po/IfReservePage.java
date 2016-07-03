package sample.pageobjectpattern.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    default void replaceVales(String name, String value) {
        getDriver().findElement(name(name)).clear();
        getDriver().findElement(name(name)).sendKeys(value);
    };

    default String getTextById(String id) {
        return getDriver().findElement(id(id)).getText();
    };

    default void click(String name) {
        getDriver().findElement(name(name)).click();
    }

    default void clickById(String id) {
        getDriver().findElement(id(id)).click();
    }

    default void clickIfSelected(String name) {
        if(!getDriver().findElement(name(name)).isSelected()){
            click(name);
        }
    }

}
