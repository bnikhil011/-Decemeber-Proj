package service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import model.Student;

public class UserService {

	public boolean signup(Student student)
	{
		FileReader reader;
		try {
			reader = new FileReader("C:\\Users\\WELCOME\\Desktop\\december Target\\-Decemeber-Proj\\config.properties");
		
		  
			Properties p=new Properties();  
			p.load(reader);  
			String userid = p.getProperty("userid");
			p.setProperty("userid", "oneto1");
			System.out.println("Value of property file is "+ userid);
			return true;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
