package com.hazardousholdings.example.frontend;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class ServerDaemon {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting Frontend...");
		WebAppContext webAppContext = new WebAppContext();
		webAppContext.setContextPath("/");
		webAppContext.setResourceBase("webapp");
		webAppContext.setDescriptor("webapp/WEB-INF/web.xml");

		Server server = new Server(8080);
		server.setHandler(webAppContext);

		server.start();
		System.out.println("Started Frontend.");
		server.join();
	}

}
