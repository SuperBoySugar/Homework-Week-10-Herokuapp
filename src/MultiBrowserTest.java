import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Edge";
    static WebDriver driver;

    public static void main(String[] args) {

        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();

        String baseUrl = "https://the-internet.herokuapp.com/login";
        // Open the URL
        driver.get(baseUrl);
        // Title of the Page
        String title = driver.getTitle();
        System.out.println(title);
        // Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page Source: " + driver.getPageSource());
        // Enter the email to email field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Prime");
        // Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Prime123");
        // close the browser
        //driver.close();
    }

}
