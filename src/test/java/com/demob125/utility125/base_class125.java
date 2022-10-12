package com.demob125.utility125;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class125 {
	public static Properties prop125; 
	public static WebDriver driver;
public base_class125() {
	prop125 = new Properties();
	
	try {
		FileInputStream fls125 = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\demob125\\configure125\\config125.properties");
// first e input file stream ante hobe user. dir + config file r path src thk
		prop125.load(fls125);
		//load is a method given by property class
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void initiBrowser() {
	String browserset125 = prop125.getProperty("Browser125");
	if(browserset125.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\webdriver125\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(testdata125.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testdata125.implicitlyWait, TimeUnit.SECONDS);
		System.out.println("ChromeBrowser launch");
}
	else if(browserset125.equals("FF"));
}
public static void getURL(String URL) {
	driver.get(prop125.getProperty("URL"));
	
}
}
