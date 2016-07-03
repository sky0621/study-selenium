package sample.pageobjectpattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sample.pageobjectpattern.po.ReserveConfirmPage;
import sample.pageobjectpattern.po.ReserveInputPage;

import java.util.Calendar;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by SS on 2016/07/02.
 */
public class PageObjectSampleTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private static Calendar nextSaturday() {
        Calendar calen = Calendar.getInstance();
        calen.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
        calen.add(Calendar.DATE,7);
        return calen;
    }

    @Test
    public void 宿泊予約が成功すること() {
        // 予約情報入力ページ
        driver.get("http://example.selenium.jp/reserveApp");
        ReserveInputPage inputPage = new ReserveInputPage(driver);
        Calendar nextSaturday = nextSaturday();
        inputPage.setReserveData(
                Integer.toString(nextSaturday.get(Calendar.YEAR)),
                Integer.toString(nextSaturday.get(Calendar.MONTH) + 1),
                Integer.toString(nextSaturday.get(Calendar.DATE))
        );
        inputPage.setReserveTerm("1");
        inputPage.setHeadCount("2");
        inputPage.setBreakfast(true);
        inputPage.setEarlyCheckInPlan(true);
        inputPage.setGuestName("サンプルユーザ");

        // 予約内容確認ページ
        ReserveConfirmPage confirmPage = inputPage.goToNext();
        assertThat(confirmPage.getPrice(), is("21500"));
        confirmPage.commit();
    }

}
