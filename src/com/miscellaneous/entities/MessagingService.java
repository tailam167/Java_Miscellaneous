package com.miscellaneous.entities;

import com.miscellaneous.handler.ServiceInterface;
import com.miscellaneous.logger.ConsoleLogger;

/**
 * Apply Service Locator Design Pattern
 * 
 * @author taila
 *
 */
public class MessagingService implements ServiceInterface {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	public static final String NAME = "MessagingService";

	@Override
	public String getName() {
		consoleLogger.writeInfor("Getting name of messaging service...");
		return MessagingService.NAME;
	}

	@Override
	public void execute() {
		consoleLogger.writeNotify("Executing Messaging Service...");
		System.out.println("Messaging Service executed !");
	}

}
