package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperteis {

	//Load properties file from folder
	public static Properties userdata = 
			loadProperties(System.getProperty("user.dir")+"\\src\\main\\java\\propreties\\UserData.propreteis");

	private static Properties loadProperties(String path)
	{
		Properties pro = new Properties();
		//Stream for reading file 
		try {
			FileInputStream stream =new FileInputStream(path);
			pro.load(stream);
		} catch (FileNotFoundException e) {
			System.out.println("Error Occoured : "+ e.getMessage());
		} catch (IOException e) {
			System.out.println("Error Occoured : "+ e.getMessage());
		}
		return pro;
	}

}
