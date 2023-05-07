package AfaqTest;

import AfaqBase.AfaqRegisterBase;
import org.testng.annotations.Test;

public class AfaqRegisterTest extends AfaqTestBase{


    @Test(priority = 1) // Open The General Assembly Members Model
    public void OpenGeneralAssemblyMember() throws InterruptedException {
        AfaqRegisterBase Member = new AfaqRegisterBase(driver);
        Member.AssemblyMemberFun();
        Thread.sleep(3000);
    }

    @Test(priority = 2) // Check The General Assembly Members Model That Displayed Already
    public void CheckGeneralAssemblyMembersModel() throws InterruptedException {
        AfaqRegisterBase Member = new AfaqRegisterBase(driver);
        Member.CheckHeaderFun();
        Thread.sleep(3000);
    }

    @Test(priority = 3) // Check The General Assembly Members That Displayed Already
    public void CheckGeneralAssemblyMembers() throws InterruptedException{
        AfaqRegisterBase Member = new AfaqRegisterBase(driver);
        Member.CheckMembersFun();
        Thread.sleep(3000);
    }
}
