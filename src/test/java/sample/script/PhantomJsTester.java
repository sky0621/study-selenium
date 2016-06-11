package sample.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Created by SS on 2016/06/12.
 */
public class PhantomJsTester {

    public static void main(String... args) {

        System.setProperty("phantomjs.binary.path", "C:\\FHS\\usr\\local\\SeleniumWebDriver\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://example.selenium.jp/reserveApp");
        driver.findElement(By.id("guestname")).sendKeys("サンプルユーザ");
        driver.findElement(By.id("goto_next")).click();
        driver.quit();
    }

}
