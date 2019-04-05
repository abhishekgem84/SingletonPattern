package com.abhi.learn.singleton.pattern;

import java.io.ObjectStreamException;
import java.io.Serializable;
//This is demonstration of true singleton desgin pattern
public class Singleton implements Serializable {

	private static final long serialVersionUID = 1346318162223585205L;
	private static Singleton sc = new Singleton();

	private Singleton() {
		if (sc != null) {
			throw new IllegalStateException("Alrady created.");
		}
	}

	public static Singleton getInstance() {
		return sc;
	}

	private Object readResolve() throws ObjectStreamException {
		return sc;
	}

	private Object writeReplace() throws ObjectStreamException {
		return sc;
	}

	/**
	 * To restrict clonning
	 */
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton, cannot be clonned");
	}

	/**
	 * To prevent the singleton getting instantiated from different class loaders,
	 * method associates the classloader with the current thread, it the classloader
	 * is null the method uses the same classloadder that loaded the siingleton
	 * class.
	 * 
	 * @param classname
	 * @return
	 * @throws ClassNotFoundException
	 */
	public static Class getClass(String classname) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		if (classLoader == null) {
			classLoader = Singleton.class.getClassLoader();
		}
		return (classLoader.loadClass(classname));
	}
}
