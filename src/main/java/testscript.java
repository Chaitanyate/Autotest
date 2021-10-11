import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscript {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chaitanya.Tejas\\Music\\chrome\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
        driver.findElement(By.id("nav-search-submit-button")).click();
        System.exit(0);
    }
}
