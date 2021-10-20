package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class trainpath {
    ChromeDriver driver;

    //launch app
    void launchapp(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya.Tejas\\Music\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);

    }

    String extractEmi(String text1,String text2,String tenure ){
        driver.findElement(By.xpath("//input[@name='rate']/preceding::input[1]")).sendKeys(text1);
       driver.findElement(By.xpath("//span[contains(text(), 'Amount in Rs')]/following::input[2]")).sendKeys(text2);
        driver.findElement(By.xpath("//input[@name='rate']/following::input[1]")).sendKeys(tenure);
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
       // driver.findElement(By.linkText("Bank Holidays")).click();
    String s=driver.findElement(By.xpath("//input[@name='Button1']/following::input[@id='EMI']")).getAttribute("value");
    return s;
//        System.out.println(s);


    }

    void tearDown(){
        driver.quit();
        System.exit(0);
    }


//    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya.Tejas\\Music\\chrome\\chromedriver.exe");
//    ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
//        driver.findElement(By.xpath("//input[@name='rate']/preceding::input[1]")).sendKeys("10000");
//        driver.findElement(By.xpath("//span[contains(text(), 'Amount in Rs')]/following::input[2]")).sendKeys("25");
//        driver.findElement(By.xpath("//input[@name='rate']/following::input[1]")).sendKeys("10");
//        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
//    String s=driver.findElement(By.xpath("//input[@name='Button1']/following::input[@id='EMI']")).getAttribute("value");
//
//        System.out.println(s);
//        driver.findElement(By.linkText("Bank Holidays")).click();
}
