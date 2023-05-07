package AfaqBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AfaqPageBase {

    protected WebDriver driver;
    public AfaqPageBase(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
