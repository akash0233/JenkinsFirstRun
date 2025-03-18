import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        Actions a = new Actions(driver);
        WebElement serach = driver.findElement(By.xpath("//textarea[@title='Search']"));
        a.moveToElement(serach).click().keyDown(Keys.SHIFT).sendKeys("india").doubleClick().build().perform();
        // varti shift key press karun india type kely jene karun Capital mdhe type hoeil INDIA
    }
}
