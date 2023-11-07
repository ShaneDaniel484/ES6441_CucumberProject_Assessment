package com.shane.TechAssessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class loginUtility {
String strUrl, strEmail, strPassword, strInvalidEmail, StrInvalidPassword;
	
	public loginUtility() {
		Register();
	}
	
	public void Register(){
		File file = new File("C:\\Users\\sdaniel\\Selenium\\TechincalAssessment-3(ES6441)\\com.shane.TechAssessment3\\src\\test\\resources\\data.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}catch(IOException e) {
			e.printStackTrace();
		}
		strUrl = prop.getProperty("url");
		strEmail = prop.getProperty("email");
		strPassword = prop.getProperty("password");
		strInvalidEmail = prop.getProperty("invalidemail");
		StrInvalidPassword = prop.getProperty("invalidpassword");
		}
}
 