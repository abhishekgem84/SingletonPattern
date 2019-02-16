package com.abhi.learn.singleton.pattern;

public class SingletonLazy {
	/**
	 * Object will be created later on request
	 */
	private static SingletonLazy sl = null;//

	/**
	 * The constructor is private so no other class can instantiate this class.
	 */
	private SingletonLazy() {
	}

	/**
	 * We check if the static variable sl is null, then instantiate the object and
	 * return it, on first call when sl would be null the object gets created and on
	 * next successive calls it will return the same object.
	 * 
	 * One down fall of the approach is, its not thread safe.
	 * 
	 * @return SingletonLazy
	 */
	public static SingletonLazy getInstance() {
		if (sl == null)
			sl = new SingletonLazy();
		return sl;
	}

}
