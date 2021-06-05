package com.miscellaneous.container;

import java.util.ArrayList;
import java.util.List;

import com.miscellaneous.handler.ServiceInterface;
import com.miscellaneous.logger.ConsoleLogger;

/**
 * Apply Service Locator Design Pattern
 * 
 * @author taila
 *
 */
public class Cache {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	private List<ServiceInterface> serviceInterfaceList;

	public Cache() {
		this.serviceInterfaceList = new ArrayList<>();
	}

	public ServiceInterface getService(String jndiName) {

		for (ServiceInterface serviceInterface : serviceInterfaceList) {
			if (serviceInterface.getName().equals(jndiName)) {
				consoleLogger.writeInfor("Found service: " + String.valueOf(serviceInterface));
				return serviceInterface;
			}
		}
		return null;
	}

	public void addService(ServiceInterface serviceInterface) {
		this.serviceInterfaceList.add(serviceInterface);
	}
}
