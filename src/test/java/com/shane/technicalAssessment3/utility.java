package com.shane.technicalAssessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utility {
String email;
String email1;
String url;
String password;
String password1;

public utility() {
	data();
}
public void data() {
	File file = new File("C:\\Users\\lsrinivasan\\OneDrive - Expleo France\\Desktop\\ES6567-Logesh_Selenium_Cucumber_Assessment-03\\TechAssessment03\\src\\test\\resource\\data.properties");
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties prop = new Properties();
	try {
		prop.load(fis);
	} catch (IOException e) {
		e.printStackTrace();
}
	url =prop.getProperty("url");
	email =prop.getProperty("email");
	email1= prop.getProperty("email1");
	password=prop.getProperty("password");
	password1=prop.getProperty("password1");

}
}
