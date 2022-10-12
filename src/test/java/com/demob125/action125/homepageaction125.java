package com.demob125.action125;

import com.demob125.locator125.homepagelocator125;
import com.demob125.utility125.base_class125;

public class homepageaction125 extends base_class125 {
	homepagelocator125 homepagelocator_1 = new homepagelocator125();
	public void Click_loginlink() throws Exception {
		homepagelocator_1.loginlink.click();
		Thread.sleep(3000);
		
	}

}
