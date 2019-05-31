package com.snippets.singletonPattern;

public class SingletonStaticBlock {
	private static final SingletonStaticBlock INSTANCE;
	
	static {
		try {
			INSTANCE = new SingletonStaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("An error occurred!", e);
		}
	}
	
	private String name = null;
	
	private SingletonStaticBlock() {
		this.name = "Singleton pattern - static block implementation.";
	}
	
	public static SingletonStaticBlock getInstance() {
		return INSTANCE;
	}
	
	public String getName() {
		return this.name;
	}
}
