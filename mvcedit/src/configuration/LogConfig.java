package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;


public class LogConfig {
	private static Properties logProperty = new Properties();
	private static String logFile;

	@SuppressWarnings("static-access")
	public LogConfig(String logFile){
		this.logFile = logFile;
	}

	public void init(){
		try {
			logProperty.load(new FileInputStream(logFile));//load(new FileInputStream(logFile));
			PropertyConfigurator.configure(logProperty);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
