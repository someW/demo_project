package com.enmCommonUse7;
/**
 * �÷��ģ�����ö�ٵķ���
 * toString()�������ǵ����ӡ�
 * @author WBB
 *
 */
public enum Color4 {
	RED("��",1),GREEN("��",2),BLANK("��",3),YELLO("��",4);
	private String name;
	private int index;
	private Color4(String name,int index) {
		this.name = name;
		this.index = index;
	}
	
	//���Ƿ���
	@Override
	public String toString() {
		return this.index+"_"+this.name;
	}
	

	public static void main(String[] args) {
		System.out.println(Color4.RED.index);
	}
}
