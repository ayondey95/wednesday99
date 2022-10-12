package com.demob125.locator125;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.demob125.utility125.base_class125;

public class homepagelocator125 extends base_class125 {
	public homepagelocator125() {
		PageFactory.initElements(driver, this );
		
	}
	 @FindBy(how = How.ID, using= "login2")
public WebElement loginlink;
}
