import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class Practice {
    protected WebDriver driver;


    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationcentral.com/demo/dropdown.html");
        WebElement staticDropdown = driver.findElement(By.tagName("select"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Option 2");
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.setUp();
    }
}
