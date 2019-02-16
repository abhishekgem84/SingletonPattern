package com.abhi.learn.singleton.pattern;

public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class LazyHolder {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	/**
	 * if one wants to to lazy creation of object without synchronization
	 * 
	 * @return BillPughSingleton
	 */
	public static BillPughSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}
