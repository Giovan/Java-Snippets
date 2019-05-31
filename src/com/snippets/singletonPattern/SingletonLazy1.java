package com.snippets.singletonPattern;

public class SingletonLazy1 {
	private static volatile SingletonLazy1 instance;
	private String name = null;
	private SingletonLazy1() {
		this.name = "Singleton pattern - lazy implementation, method 1.";
	}
	
	public static SingletonLazy1 getInstance() {
		if (instance == null) {
			synchronized (SingletonLazy1.class) {
				if (instance == null) {
					instance = new SingletonLazy1();
				}
			}
		}
		return instance;
	}
	
	public String getName() {
		return this.name;
	}
}
