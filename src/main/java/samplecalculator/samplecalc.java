package samplecalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplecalc {
    ChromeDriver driver;

    //launch app
    void launch(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya.Tejas\\Music\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }
   void performcalculation(String num1,String num2 ){
        driver.findElement(By.xpath("//input[@id='num1']")).sendKeys(num1);
        driver.findElement(By.xpath("//input[@id='num2']")).sendKeys(num2);
        driver.findElement(By.xpath("//button[@id='submit1']")).click();
       driver.findElement(By.xpath("//button[@id='submit2']")).click();
       driver.findElement(By.xpath("//button[@id='submit3']")).click();
       driver.findElement(By.xpath("//button[@id='submit4']")).click();


    }


}
