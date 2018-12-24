package com.enumSingleton;
/**
 * 这种编写方式被称为“双重检查锁”,主要在getSingleton()方法中，进行两次null检查
 * 这样可以极大提升并发度，进而提升性能
 * @author WBB
 *
 */
public class Singleton {
	 private static volatile Singleton singleton = null;
	 
	 private Singleton(){}
	 
	 public static Singleton getSingleton(){
	        if(singleton == null){
	            synchronized (Singleton.class){
	                if(singleton == null){
	                    singleton = new Singleton();
	                }
	            }
	        }
	        return singleton;
	    }   
}
