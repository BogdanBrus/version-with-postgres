package javaTest;

import org.apache.log4j.Logger;

public class TestLog {

	public static void main(String[] args) {
		
		Logger logger = log.LogInst.getLogger();
		logger.info("Run");
		logger.info("Run2", new Exception());
		
	}

}
