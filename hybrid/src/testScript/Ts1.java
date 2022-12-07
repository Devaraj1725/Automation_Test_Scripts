package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genricScript.Base_Test;
import genricScript.Generic_Readdata;
import pomScript.Fb_Login;

public class Ts1  extends Base_Test{
@Test
public void script() throws EncryptedDocumentException, IOException {
	
	String username = Generic_Readdata.getData("Sheet1", 0, 0);
	String password= Generic_Readdata.getData("Sheet1", 1, 0);
	Fb_Login fb=new Fb_Login(driver);
	fb.userName(username);
    fb.passWord(password);
	fb.clicklogin();
	
}
}
