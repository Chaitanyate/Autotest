import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtest {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya.Tejas\\Music\\chrome\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.bing.com/");
//        driver.findElement(By.id("loanamount")).sendKeys("20000");
//        driver.findElement(By.id("rate")).sendKeys("20");
//
//        driver.findElement(By.id("pmonths")).sendKeys("10");
//        driver.findElement(By.id("Button1")).click();
//
//        String s =driver.findElement(By.id("EMI")).getAttribute("value");
//        System.out.println(s);
        driver.findElement(By.id("sb_form_q")).sendKeys("cricbuzz");
        driver.findElement(By.id("search_icon")).submit();
        System.exit(0);

    }
}
