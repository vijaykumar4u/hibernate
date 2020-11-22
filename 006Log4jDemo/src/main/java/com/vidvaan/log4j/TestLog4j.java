package com.vidvaan.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.pattern.LogEvent;

public class TestLog4j {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(TestLog4j.class);
		logger.setLevel(Level.ALL);
		logger.trace("Trace Level");
		logger.info("Info Level");
		logger.debug("Debug level");
		logger.warn("Warn level");
		logger.fatal("Fatal level");
		logger.error("error level");
		
	}

}
