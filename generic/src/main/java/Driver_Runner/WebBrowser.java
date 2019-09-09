package Driver_Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class WebBrowser {
    public static WebDriver driver = null;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver","../generic/driver/chromedriver");
        driver= new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       // driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.get("https://www2.hm.com/en_us/index.html");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void closeSetup(){
        driver.close();
    }

}
