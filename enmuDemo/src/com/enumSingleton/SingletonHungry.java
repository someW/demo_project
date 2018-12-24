package com.enumSingleton;
/**
 * 饿汉式（基于classloder机制避免了多线程的同步问题）
 * @author WBB
 *显然这种写法比较简单，但问题是无法做到延迟创建对象
 *事实上如果该单例类涉及资源较多，创建比较耗时间时，
 *我们更希望它可以尽可能地延迟加载，从而减小初始化的负载
 *于是便有了的懒 汉式单例
 */
public class SingletonHungry {
	private static SingletonHungry instance = 
			new SingletonHungry();
	
	private SingletonHungry() {}
	
	public static SingletonHungry getInstance() {
		return instance;
	}

}
