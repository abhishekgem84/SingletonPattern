package com.abhi.learn.singleton.pattern;

public class SingletonLazyMultithreaded {
	/**
	 * Object will be created later on request
	 */
	private static SingletonLazyMultithreaded slm = null;

	/**
	 * The constructor is private so no other class can instantiate this class.
	 */
	private SingletonLazyMultithreaded() {
	}

	/**
	 * We check if the static variable slm is null, then instantiate the object and
	 * return it, on first call when slm would be null the object gets created and
	 * on next successive calls it will return the same object.
	 * 
	 * To cover the down fall of class SingletonLazy, we will put synchronized to
	 * this function so that in case of multithreaded environment one thread will
	 * access after another.
	 * 
	 * This is not optimized this will case a delay if there are high number of
	 * thread accessing this function.
	 * 
	 * @return SingletonLazy
	 */
	public static synchronized SingletonLazyMultithreaded getInstance() {
		if (slm == null)
			slm = new SingletonLazyMultithreaded();
		return slm;
	}
}
