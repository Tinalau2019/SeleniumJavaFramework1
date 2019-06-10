package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		System.out.println("\n Hello World ...!   \n");
		
		
	logger.trace("this is a trace message");	
	logger.info("this is information massage");
	logger.error("this is an error message");
	logger.warn("this is an warning message");
	
	System.out.println("\n Completed");
	
    
	}

}
