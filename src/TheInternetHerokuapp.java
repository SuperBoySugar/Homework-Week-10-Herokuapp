import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheInternetHerokuapp {

    public static void main(String[] args) {

        // Variable to store Url
        String baseUrl = "https://the-internet.herokuapp.com/login";

        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the Url into Browser
        driver.get(baseUrl);
        // Maximize the Browser
        driver.manage().window().maximize();
        // Get the title of the Page
        String title = driver.getTitle();
        System.out.println(title);
        // Print current Url
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Print the Page source
        System.out.println("Page Source: " + driver.getPageSource());
        // Enter the email to email field
        WebElement usernamefield = driver.findElement(By.name("username"));
        usernamefield.sendKeys("Primexyz@gamil.com");
        // Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Prime123");
        // close the browser
        //driver.close();
    }


}
