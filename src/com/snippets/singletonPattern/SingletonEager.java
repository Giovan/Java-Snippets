package com.snippets.singletonPattern;

public class SingletonEager {
	private static final SingletonEager INSTANCE = new SingletonEager();
	
	private String name = null;
	
	private SingletonEager() {
		this.name = "Singleton pattern - eager implementation.";
	}
	
	public static SingletonEager getInstance() {
		return INSTANCE;
	}
	
	public String getName() {
		return this.name;
	}
}
