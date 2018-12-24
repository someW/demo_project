package com.enumSingleton;
/**
 * ����ʽ����
 * ����д���ܹ��ڶ��߳��кܺõĹ�������ͬ�����⣬ͬʱҲ�߱�lazy loading����
 * @author Thinkpad
 *�ź����ǣ�����synchronized�Ĵ��ڣ�Ч�ʺܵͣ��ڵ��̵߳��龰�£�
 *��ȫ����ȥ��synchronized,Ϊ�˼��Ч�����������⣬�Ľ���� �� Singleton ��
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
