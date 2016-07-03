package sample.pageobjectpattern.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by SS on 2016/07/02.
 */
public class ReserveConfirmPage implements IfReservePage {

    private WebDriver driver;

    public ReserveConfirmPage(WebDriver driver) {
        this.driver = driver;
        checkTitle("予約内容確認");
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }

    public String getPrice() {
        return getTextById("price");
    }

    public void commit() {
        clickById("commit");
    }

}
