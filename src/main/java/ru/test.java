package ru;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Date;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebElement;

public class test{
    private Date today;
    public Date getToday(){
        return today;
    }
    public void setToday (Date aToday){
        today = aToday;
    }
    public static void main (String[] args){
        test ft = new test();
        ft.setToday(new Date());
        System.out.println(ft.getToday());
        FirefoxOptions SearchInGoogleTest = new FirefoxOptions();
        System.setProperty("webdriver.gecko.driver", "/home/nika/IdeaProjects/QA/geckodriver");
        FirefoxDriver driver = new FirefoxDriver(SearchInGoogleTest);
        driver.get("https://www.delta.com/eu/en");
        //Thread.Sleep(2000);
        driver.quit();
    }
}
