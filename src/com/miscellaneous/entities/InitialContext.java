package com.miscellaneous.entities;

import com.miscellaneous.logger.ConsoleLogger;

/**
 * Apply Service Locator Design Pattern
 * 
 * @author taila
 *
 */
public class InitialContext {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	public Object lookup(String jndiName) {
		switch (jndiName) {
		case DatabaseService.NAME:
			consoleLogger.writeInfor("Database Service is found !");
			return new DatabaseService();
		case MessagingService.NAME:
			consoleLogger.writeInfor("Messaging Service is found !");
			return new MessagingService();
		default:
			consoleLogger.writeInfor("Can't find jndiName !");
			return null;
		}
	}

}
