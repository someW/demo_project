package com.enumSingleton;
/**
 * 懒汉式单例
 * 这种写法能够在多线程中很好的工作避免同步问题，同时也具备lazy loading机制
 * @author Thinkpad
 *遗憾的是，由于synchronized的存在，效率很低，在单线程的情景下，
 *完全可以去掉synchronized,为了兼顾效率与性能问题，改进后代 见 Singleton 类
 */
public class SingletonLazy {
	private static volatile SingletonLazy instance;
	
	 private SingletonLazy() {}
	 
	 public static synchronized SingletonLazy getInstance() {
	        if (instance == null) {
	            instance = new SingletonLazy();
	        }
	        return instance;
	    }
}
