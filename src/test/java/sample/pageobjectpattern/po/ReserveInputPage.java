package sample.pageobjectpattern.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by SS on 2016/07/02.
 */
public class ReserveInputPage implements IfReservePage {

    private WebDriver driver;

    public ReserveInputPage(WebDriver driver) {
        this.driver = driver;
        checkTitle("予約情報入力");
    }

    @Override
    public WebDriver getDriver() {
        return this.driver;
    }

    public void setReserveData(String year, String month, String day) {
        replaceVales("reserve_y", year);
        replaceVales("reserve_m", month);
        replaceVales("reserve_d", day);
    }

    public void setReserveTerm(String term) {
        replaceVales("reserve_t", term);
    }

    public void setHeadCount(String hc) {
        replaceVales("hc", hc);
    }

    public void setBreakfast(boolean on) {
        if(on) {
            click("breakfast_on");
        } else {
            click("breakfast_off");
        }
    }

    public void setEarlyCheckInPlan(boolean checked) {
        clickIfSelected("plan_a");
    }

    public void setSightseeingPlan(boolean checked) {
        clickIfSelected("plan_b");
    }

    public void setGuestName(String name) {
        replaceVales("gname", name);
    }

    public ReserveConfirmPage goToNext() {
        click("goto_next");
        return new ReserveConfirmPage(driver);
    }

}
