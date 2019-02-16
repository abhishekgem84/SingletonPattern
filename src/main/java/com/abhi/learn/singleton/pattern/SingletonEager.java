package com.abhi.learn.singleton.pattern;

public class SingletonEager {
	private static SingletonEager sc=new SingletonEager();
	/**
	 * The constructor is private so no other class can instantiate this class.
	 */
	private SingletonEager() {
		
	}
	/**
	 * This function will make sure that only one object of the class gets created and even if there are several requests, 
	 * only the same instance of object is returned
	 * @return SingletonEager
	 */
	public static SingletonEager getInstance() {
		return sc;
	}
}
