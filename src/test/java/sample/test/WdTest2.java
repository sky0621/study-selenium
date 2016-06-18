package sample.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by SS on 2016/06/19.
 */
public class WdTest2 {

    private static WebDriver driver;

    @BeforeClass
    public static void setupBeforeClass() {

        if (driver != null) return;

        driver = new FirefoxDriver();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                driver.quit();
            }
        });
    }

    @Test
    public void 処理Aが成功すること() {

        driver.get("http://example.selenium.jp/reserveApp");
        driver.findElement(By.id("guestname")).sendKeys("サンプルユーザ");
        driver.findElement(By.id("goto_next")).click();

        assertThat(driver.getTitle(), is("予約エラー"));
    }

    @Test
    public void 処理Bが成功すること() {

        driver.get("http://example.selenium.jp/reserveApp");
        driver.findElement(By.id("guestname")).sendKeys("サンプル２ユーザ");

        assertThat(driver.getTitle(), is("予約情報入力"));
    }

}
