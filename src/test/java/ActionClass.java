import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
    @Test
    public void sampleTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());//new step

        Actions a = new Actions(driver);
        WebElement serach = driver.findElement(By.xpath("//textarea[@title='Search']"));
        a.moveToElement(serach).click().keyDown(Keys.SHIFT).sendKeys("india").doubleClick().build().perform();
        // varti shift key press karun india type kely jene karun Capital mdhe type hoeil INDIA

    }
}
