package com.miscellaneous.entities;

import com.miscellaneous.handler.ServiceInterface;
import com.miscellaneous.logger.ConsoleLogger;

/**
 * Apply Service Locator Design Pattern
 * 
 * @author taila
 *
 */
public class DatabaseService implements ServiceInterface {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	public static final String NAME = "DatabaseService";

	@Override
	public String getName() {
		consoleLogger.writeInfor("Getting name of service...");
		return DatabaseService.NAME;
	}

	@Override
	public void execute() {
		consoleLogger.writeNotify("Executing database service...");
		System.out.println("Database Service executed !");
	}

}
