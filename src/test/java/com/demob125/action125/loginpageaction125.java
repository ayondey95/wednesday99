package com.demob125.action125;

import org.testng.Assert;

import com.demob125.locator125.loginpagelocator125;
import com.demob125.utility125.base_class125;

public class loginpageaction125 extends base_class125 {
	loginpagelocator125 loginpagelocator125_1 = new loginpagelocator125();
	
	public void UserCredential(String u, String p) throws Exception {
		loginpagelocator125_1.username.sendKeys(u);
		loginpagelocator125_1.password.sendKeys(p);
		loginpagelocator125_1.login_button.click();
		Thread.sleep(2000);
	}
	
	//public void  Verify_login_display() throws Exception {
	//boolean loginoptions =	loginpagelocator125_1.username.isDisplayed();
	//Assert.assertTrue(loginoptions);
	//Thread.sleep(5000);
}
//}
