import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "dependency/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

       /* WebElement autoCompleteItem = driver.findElement(By.id("autocomplete"));
        autoCompleteItem.click();
*/
        WebElement datePicker = driver.findElement(By.cssSelector("body > div > div > div > a:nth-child(4)"));
        datePicker.click();



//        driver.quit();
    }
}
