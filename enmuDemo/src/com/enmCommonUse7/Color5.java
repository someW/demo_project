package com.enmCommonUse7;
/**
 * �÷��壺ʵ�ֽӿ�
 * ���е�ö�ٶ��̳���java.lang.Enum�ࡣ����Java ��֧�ֶ�̳У�����ö�ٶ������ټ̳������ࡣ
 * @author Thinkpad
 *
 */
public enum Color5 implements Behaviour{
	RED("��",1),GREEN("��",2),BLANK("��",3),YELLO("��",4);
	private String name;
	private int index;
	
	private Color5(String name, int index) {
		this.name = name;
		this.index = index;
	}
	//�ӿڷ���
	@Override
	public void print() {
		System.out.println(this.index+":"+this.name);
	}

	@Override
	public String getInfo() {
		return this.name;
	}

}
