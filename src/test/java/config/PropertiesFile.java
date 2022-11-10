package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import basePKG.MainClass;

public class PropertiesFile extends MainClass{
	
	static Properties prop = new Properties();
	static String proPath = System.getProperty("user.dir");
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() {
		try {
	
		InputStream input =new FileInputStream(proPath+"/src/test/java/config/config.properties");
		prop.load(input);
		System.out.println(prop.getProperty("browser"));
		
	}catch (Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();		
	}
	}
	public static void setProperties() {
		try {
		OutputStream outPut = new FileOutputStream(proPath+"/src/test/java/config/config.properties");
		prop.setProperty("browser","Chrome");
		prop.store(outPut, null);
		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();		
		}
	}
}
