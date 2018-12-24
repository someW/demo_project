package com.enmCommonUse7;
/**
 * �÷�������ö��������·���
 * ��������Զ����Լ��ķ�������ô������enumʵ�����е�������һ���ֺš�
 * ���� Java Ҫ������ȶ��� enum ʵ���� 
 * @author WBB
 *
 */
public enum Color3 {
	RED("��",1),GREEN("��",2),BLANK("��",3),YELLO("��",4);
	//��Ա����
	private String name;
	private int index;
	//���캯��
	private Color3(String name,int index) {
		this.name = name;
		this.index = index;
	}
	
	//��ͨ����
	public static String getName(int index) {
		for(Color3 c : Color3.values()) {
			if(c.index == index) {
				return c.name;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
