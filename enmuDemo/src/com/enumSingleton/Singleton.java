package com.enumSingleton;
/**
 * ���ֱ�д��ʽ����Ϊ��˫�ؼ������,��Ҫ��getSingleton()�����У���������null���
 * �������Լ������������ȣ�������������
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
