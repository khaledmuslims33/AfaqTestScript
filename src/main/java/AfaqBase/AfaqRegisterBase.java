package AfaqBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AfaqRegisterBase extends AfaqPageBase{
    public AfaqRegisterBase(WebDriver driver) {
        super(driver);
    }


    // The Locators
    @FindBy(partialLinkText = "الجمعية العموم")
    WebElement assemblyMember;

    @FindBy(xpath = "//p[contains(text(),'اعضاء الجمعية العمومية لمؤسسة افاق الخيرية')]")
    WebElement Afaqheader1;

    @FindBy(xpath = "//h2[contains(text(),'الجمعية العمومية')]")
    WebElement Afaqheader2;









    // The Methods

    public void AssemblyMemberFun()
    {
        assemblyMember.click();
    }



    public void CheckHeaderFun()
    {
       String Header1 =  Afaqheader1.getText();
       String Header2 = Afaqheader2.getText();

       if (Header1 == null || Header2 == null)
       {
           System.out.println("oh,Sorry The General Assembly Members didn't existed !!!");
       }
       else {
           System.out.println(Header1);
           System.out.println(Header2);
           System.out.println("The General Assembly Members is existed Already");
       }

    }



    public void CheckMembersFun()
    {
        List<WebElement> Members = driver.findElements(By.className("text-center"));
        for(WebElement element : Members) {
           String Name_Member = element.getText();
            System.out.println(Name_Member);
        }

    }




}
