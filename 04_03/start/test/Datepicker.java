import net.bytebuddy.asm.Advice;
import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    private static Object RETURN;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "dependency/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("05/06/2021");
        Thread.sleep(3000);

        dateField.sendKeys(Keys.RETURN);

        Thread.sleep(3000);
        driver.quit();
    }
}