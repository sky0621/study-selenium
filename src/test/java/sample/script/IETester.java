package sample.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by SS on 2016/06/12.
 */
public class IETester {

    public static void main(String... args) {

        System.setProperty("webdriver.ie.driver", "C:\\FHS\\usr\\local\\SeleniumWebDriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://example.selenium.jp/reserveApp");
        driver.findElement(By.id("guestname")).sendKeys("サンプルユーザ");
        driver.findElement(By.id("goto_next")).click();
        driver.quit();
    }

}
