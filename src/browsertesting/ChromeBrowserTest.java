package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        // set up browser
        WebDriver driver = new ChromeDriver();
        //open Url
        driver.get(baseUrl);
        //print title page
        System.out.println(driver.getTitle());
        //print current url
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        //get username to username field
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        //get password to password field
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //close browser
        driver.close();


    }
    }

