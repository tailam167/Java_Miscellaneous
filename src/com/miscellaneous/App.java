package com.miscellaneous;

import com.miscellaneous.control.ServiceLocator;
import com.miscellaneous.handler.ServiceInterface;
import com.miscellaneous.logger.ConsoleLogger;

/**
 * Apply Service Locator Design Pattern
 * 
 * @author taila
 *
 */
public class App {

	public static void main(String[] args) {

		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.writeInfor("<SERVICE LOCATOR DESIGN PATTERN>");

		/**
		 * Apply Service Locator Design Pattern: Use for obtaining the process involved
		 * in obtaining a service with a strong abstraction layer. Like a run-time
		 * linker, allow code to be added at run-time without re-compiling the source
		 * code. Can make some optimization. It will create a black box - harder to
		 * detect and recover from errors. Registry hides the dependencies --> causes
		 * run-time errors of compile-time ones. Difficult to maintain the registry -->
		 * DI is more convenient. Service locator and dependency injection are the just
		 * implementations of the dependency inversion principle, It could depend upon
		 * abstraction rather than on implementation --> loose couple. With service
		 * locator the application class asks for it explicitly by a message to the
		 * locator. With injection there is no explicit request, the service appears in
		 * the application class - hence the inversion of control. Easier to test
		 * applications with dependency injection. JNDI: Java Naming And Directory
		 * Interface. Allow java software clients to discovery and look up data and
		 * object via a name. It is a API: independent of any implementations. It
		 * implemented with service locator pattern usually.
		 */
		ServiceInterface serviceInterface = ServiceLocator.getService("DatabaseService");
		serviceInterface.execute();
		serviceInterface = ServiceLocator.getService("MessagingService");
		serviceInterface.execute();

	}

}
