package com.snippets.singletonPattern;

public enum SingletonEnum {
	INSTANCE;
	
	private String name;
	
	private SingletonEnum() {
		this.name = "Singleton pattern - enum implementation.";
	}
	
	public String getName () {
		return this.name;
	}
}
