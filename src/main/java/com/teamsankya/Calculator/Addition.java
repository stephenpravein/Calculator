package com.teamsankya.Calculator;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.SimpleLayout;
//d i w e f
public class Addition {
	private static final Logger LOGGER=
			Logger.getLogger(Addition.class);
	
	static {
		ConsoleAppender con=new ConsoleAppender();
		LOGGER.addAppender(con);
		Layout lout=new SimpleLayout();
		RollingFileAppender rofl;
		try {
			rofl = new RollingFileAppender(lout,"Users/praveen");
			LOGGER.addAppender(rofl);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static int add(int a, int b) {
		LOGGER.info("adding two integers "+a+" "+b);
		LOGGER.error("adding two integers "+a+" "+b);
		LOGGER.warn("adding two integers "+a+" "+b);
		return a+b;
	}
	
	public static long add(long a, long b) {
		LOGGER.info("adding two long "+a+" "+b);
		LOGGER.error("adding two long "+a+" "+b);
		LOGGER.warn("adding two long "+a+" "+b);
		return a+b;
	}
	
	public static float add(float a, float b) {
		LOGGER.info("adding two float "+a+" "+b);
		LOGGER.error("adding two float "+a+" "+b);
		LOGGER.warn("adding two float "+a+" "+b);
		return a+b;
	}
}
