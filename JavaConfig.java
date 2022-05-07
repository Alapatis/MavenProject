package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class JavaConfig {

	public static String getPropertyValue(String propname) {
		FileReader input=null;
	
		
		try {
			 input= new FileReader("C:\\Users\\sitha\\eclipse-workspace\\AprilMavenFrameworks\\src\\main\\java\\configuration\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties p=new Properties();
		
		try {
			p.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String Propvalue=p.getProperty(propname);
		return Propvalue;
}
}
