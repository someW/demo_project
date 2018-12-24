package com.enumSingleton;
/**
 * ����ʽ������classloder���Ʊ����˶��̵߳�ͬ�����⣩
 * @author WBB
 *��Ȼ����д���Ƚϼ򵥣����������޷������ӳٴ�������
 *��ʵ������õ������漰��Դ�϶࣬�����ȽϺ�ʱ��ʱ��
 *���Ǹ�ϣ�������Ծ����ܵ��ӳټ��أ��Ӷ���С��ʼ���ĸ���
 *���Ǳ����˵��� ��ʽ����
 */
public class SingletonHungry {
	private static SingletonHungry instance = 
			new SingletonHungry();
	
	private SingletonHungry() {}
	
	public static SingletonHungry getInstance() {
		return instance;
	}

}
