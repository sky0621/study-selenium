package sample.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SS on 2016/06/19.
 */
public class WdTest {

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new FirefoxDriver();
    }

    @Test
    public void 処理Aが成功すること() {

        driver.get("http://example.selenium.jp/reserveApp");
        driver.findElement(By.id("guestname")).sendKeys("サンプルユーザ");
        driver.findElement(By.id("goto_next")).click();
    }

    @After
    public void tearDown() {

        driver.quit();
    }

}
