package sample.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by SS on 2016/06/12.
 */
public class ChromeTester {

    public static void main(String... args) {

        System.setProperty("webdriver.chrome.driver", "C:\\FHS\\usr\\local\\SeleniumWebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://example.selenium.jp/reserveApp");
        driver.findElement(By.id("guestname")).sendKeys("サンプルユーザ");
        driver.findElement(By.id("goto_next")).click();
        driver.quit();
    }

}
