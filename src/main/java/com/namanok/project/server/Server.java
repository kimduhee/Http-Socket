package com.namanok.project.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	public void start() throws IOException {
		int port = 8080;
		ExecutorService pool = Executors.newFixedThreadPool(5);
		ServerSocket server = new ServerSocket(port);
		while(server.isBound() && !server.isClosed()) {
			Socket socket = null;
			 try {
             	socket = server.accept();
             	Runnable r = new Processor();
             	pool.submit(r);
			 } catch(Exception e) {
				 
			 }
		}
	}
}
