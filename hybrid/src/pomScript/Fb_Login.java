package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login {
	@FindBy(id="email")
	private WebElement unTbx;
	
	@FindBy(id="pass")
	private WebElement pwdTbx;
	
	@FindBy(name="login")
	private WebElement logBtn;
	
	public Fb_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void userName(String un) {
		unTbx.sendKeys(un);
	}
	public void passWord(String pwd) {
		pwdTbx.sendKeys(pwd);
	}
	public void clicklogin() {
		logBtn.click();
	}

}
