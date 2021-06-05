package com.miscellaneous.control;

import com.miscellaneous.container.Cache;
import com.miscellaneous.entities.InitialContext;
import com.miscellaneous.handler.ServiceInterface;
import com.miscellaneous.logger.ConsoleLogger;

/**
 * Apply Service Locator Design Pattern
 * 
 * @author taila
 *
 */
public class ServiceLocator {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	private static Cache cache = new Cache();

	public static ServiceInterface getService(String jndiName) {
		ServiceInterface serviceInterface = cache.getService(jndiName);

		if (serviceInterface != null)
			return serviceInterface;

		InitialContext initialContext = new InitialContext();
		ServiceInterface serviceInterface2 = (ServiceInterface) initialContext.lookup(jndiName);
		cache.addService(serviceInterface2);

		return serviceInterface2;
	}
}
