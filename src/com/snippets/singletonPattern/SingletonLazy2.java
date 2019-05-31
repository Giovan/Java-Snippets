package com.snippets.singletonPattern;

public class SingletonLazy2 {
	private static SingletonLazy2 instance;
	private String name = null;
	
	private SingletonLazy2() {
		this.name = "Singleton pattern - lazy implementation, method 2.";
	}
	
	public static synchronized SingletonLazy2 getInstance() {
		if (instance == null) {
			instance = new SingletonLazy2();
		}
		return instance;
	}
	
	public String getName() {
		return this.name;
	}
}
