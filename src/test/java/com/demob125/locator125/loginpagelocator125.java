package com.demob125.locator125;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.demob125.utility125.base_class125;

public class loginpagelocator125 extends base_class125 {
	public  loginpagelocator125() {
		PageFactory.initElements(driver, this );
		
	}
	@FindBy(how = How.ID, using="loginusername")
	public WebElement username;

	@FindBy(how = How.ID, using="loginpassword")
	public WebElement password;
	@FindBy(how = How.XPATH , using="//button[text()='Log in']")
	public WebElement login_button;
}
