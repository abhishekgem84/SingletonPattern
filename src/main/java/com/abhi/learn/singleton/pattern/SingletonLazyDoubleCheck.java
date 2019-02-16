package com.abhi.learn.singleton.pattern;

public class SingletonLazyDoubleCheck {
	/**
	 * Object will be created later on request
	 */
	private volatile static SingletonLazyDoubleCheck sldc = null;

	/**
	 * The constructor is private so no other class can instantiate this class.
	 */
	private SingletonLazyDoubleCheck() {
	}

	/**
	 * We check if the static variable sldc is null, then instantiate the object and
	 * return it, on first call when sldc would be null the object gets created and
	 * on next successive calls it will return the same object.
	 * 
	 * To cover the down fall of class SingletonLazy, we will put synchronized to
	 * this function so that in case of multithreaded environment one thread will
	 * access after another.
	 * 
	 * This is optimized, to reduce the use of synchronization. With the
	 * doucble-checked locking, we first check to see if an instance is created, and
	 * if not, then we synchronized, we only synchronize the first time.
	 * 
	 * Aprt from this there are some other ways to break the singleton pattern.
	 * 
	 * if the calss is Serializable. if it's Clonable. It can be break by
	 * Reflection. This calss if loaded by multiple class loaders.
	 * 
	 * @return SingletonLazy
	 */
	public static SingletonLazyDoubleCheck getInstance() {
		if (sldc == null) {
			synchronized (SingletonLazyDoubleCheck.class) {
				if (sldc == null)
					sldc = new SingletonLazyDoubleCheck();
			}
		}
		return sldc;
	}
}
