package com.snippets.singletonPattern;


public class App {
	public static void main(String[] args) {
		System.out.println("Testing singleton pattern");
		System.out.println(SingletonLazy1.getInstance().getName());
		System.out.println(SingletonLazy2.getInstance().getName());
		System.out.println(SingletonEager.getInstance().getName());
		System.out.println(SingletonStaticBlock.getInstance().getName());
		System.out.println(SingletonEnum.INSTANCE.getName());
	}
}
