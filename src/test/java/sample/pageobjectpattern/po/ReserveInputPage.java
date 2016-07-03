package sample.pageobjectpattern.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SS on 2016/07/02.
 */
public class ReserveInputPage implements IfReservePage {

    private WebDriver driver;

    @FindBy(name = "reserve_y")
    private WebElement reserveYear = null;

    @FindBy(name = "reserve_m")
    private WebElement reserveMonth = null;

    @FindBy(name = "reserve_d")
    private WebElement reserveDay = null;

    @FindBy(name = "reserve_t")
    private WebElement reserveTerm = null;

    @FindBy(name = "hc")
    private WebElement headCount = null;

    @FindBy(id = "breakfast_on")
    private WebElement breakfastOn = null;

    @FindBy(id = "breakfast_off")
    private WebElement breakfastOff = null;

    @FindBy(name = "plan_a")
    private WebElement earlyCheckInPlan = null;

    @FindBy(name = "plan_b")
    private WebElement sightseeingPlan = null;

    @FindBy(name = "gname")
    private WebElement guestName = null;

    @FindBy(id = "goto_next")
    private WebElement goToNextButton = null;

    public ReserveInputPage(WebDriver driver) {
        this.driver = driver;
        checkTitle("予約情報入力");
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }

    public void setReserveData(String year, String month, String day) {
        replaceVales(reserveYear, year);
        replaceVales(reserveMonth, month);
        replaceVales(reserveDay, day);
    }

    public void setReserveTerm(String term) {
        replaceVales(reserveTerm, term);
    }

    public void setHeadCount(String hc) {
        replaceVales(headCount, hc);
    }

    public void setBreakfast(boolean on) {
        clickByOnOff(on, breakfastOn, breakfastOff);
    }

    public void setEarlyCheckInPlan(boolean checked) {
        clickIfSelected(earlyCheckInPlan);
    }

    public void setSightseeingPlan(boolean checked) {
        clickIfSelected(sightseeingPlan);
    }

    public void setGuestName(String name) {
        replaceVales(guestName, name);
    }

    public ReserveConfirmPage goToNext() {
        click(goToNextButton);
        return PageFactory.initElements(driver, ReserveConfirmPage.class);
    }

}
