package log;

import org.apache.log4j.Logger;

import configuration.LogConfig;
import resources.R;

public class LogInst {
	

		private static String LOG_PROPERTIES_FILE = R.LogConst.LOG_PROPERTIES_FILE;
		private static Logger logger = Logger.getLogger(LogInst.class);
		
		private static void init(){
			LogConfig conf = new LogConfig(LOG_PROPERTIES_FILE);
			conf.init();
		}
		
		public static Logger getLogger(){
			LogInst.init();
			return logger;
		}
	
}
