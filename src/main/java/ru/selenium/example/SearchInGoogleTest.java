package ru.selenium.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebElement;


public class SearchInGoogleTest {
    public static void main(String[] args) {

        FirefoxOptions SearchInGoogleTest = new FirefoxOptions();
        System.setProperty("webdriver.gecko.driver", "/IdeaProjects/QA/geckodriver");
        FirefoxDriver driver = new FirefoxDriver(SearchInGoogleTest);

        driver.get("https://google.com");

        driver.quit();



    }

}
