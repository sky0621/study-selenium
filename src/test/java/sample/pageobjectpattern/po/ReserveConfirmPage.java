package sample.pageobjectpattern.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SS on 2016/07/02.
 */
public class ReserveConfirmPage implements IfReservePage {

    private WebDriver driver;

    @FindBy(id = "price")
    private WebElement priceText = null;

    @FindBy(id = "commit")
    private WebElement commitButton = null;

    public ReserveConfirmPage(WebDriver driver) {
        this.driver = driver;
        checkTitle("予約内容確認");
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }

    public String getPrice() {
        return getText(priceText);
    }

    public void commit() {
        click(commitButton);
    }

}
