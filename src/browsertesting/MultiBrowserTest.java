package browsertesting;
/**Project-4 - Project Name: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser
        2. Open URL
        3. Print the title of the page
        4. Print the current url
        5. Print the page source
        6. Enter the email to email field
        7. Enter the password to password field
        8. Close the browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://www.saucedemo.com/";


    public static void main(String[] args) {
        //set up browser
        if(browser.equalsIgnoreCase("Chrome")){
            driver= new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong browser entered");
        }
        //open Url
        driver.get(baseUrl);
        //print title page
        System.out.println(driver.getTitle());
        //print current URl
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());
        //get username to username field
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        //get password to password field
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //close browser
        driver.close();


    }
}
