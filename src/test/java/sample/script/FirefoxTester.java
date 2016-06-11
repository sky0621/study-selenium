package sample.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SS on 2016/06/12.
 */
public class FirefoxTester {

    public static void main(String... args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://example.selenium.jp/reserveApp");
        driver.findElement(By.id("guestname")).sendKeys("サンプルユーザ");
        driver.findElement(By.id("goto_next")).click();
        driver.quit();
    }

}
