package com.enumSingleton;
/**
 * ö�ٵ���
 * @author WBB
 *ʹ��ö�ٵ�����д����������ȫ���ÿ������л��ͷ��������
 *ö�����л�����jvm��֤�ģ�ÿһ��ö�����ͺͶ����ö�ٱ�����JVM�ж���Ψһ��
 */
public enum SingletonEnum {
	INSTANCE;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
