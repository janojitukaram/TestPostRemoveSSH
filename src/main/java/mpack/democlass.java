package mpack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class democlass {

	public static void main(String[] args) {

		Logger logger = LogManager.getLogger(democlass.class);
		System.out.println("Hello world   ");
		logger.debug("debug message");
		logger.info("info message");
		logger.error("error message");
		logger.fatal("fatal message");
		logger.trace("trace message");
	}

}
