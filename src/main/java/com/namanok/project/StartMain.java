package com.namanok.project;

import com.namanok.project.server.Server;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("START!!");
		Server server = new Server();
		try {
			server.start();
		} catch(Exception e) {
			
		}
	}
}
