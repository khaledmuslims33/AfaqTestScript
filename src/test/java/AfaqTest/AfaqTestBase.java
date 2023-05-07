package AfaqTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AfaqTestBase {

    public static WebDriver driver;

    @BeforeTest
    public void OpenBrowser() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\fox\\IdeaProjects\\QAcart\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://afaaq.oetest.tech/ar");
        driver.manage().window().maximize();
        Thread.sleep(6000);
    }

}
