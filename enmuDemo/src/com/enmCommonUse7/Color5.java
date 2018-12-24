package com.enmCommonUse7;
/**
 * 用法五：实现接口
 * 所有的枚举都继承自java.lang.Enum类。由于Java 不支持多继承，所以枚举对象不能再继承其他类。
 * @author Thinkpad
 *
 */
public enum Color5 implements Behaviour{
	RED("红",1),GREEN("绿",2),BLANK("白",3),YELLO("黄",4);
	private String name;
	private int index;
	
	private Color5(String name, int index) {
		this.name = name;
		this.index = index;
	}
	//接口方法
	@Override
	public void print() {
		System.out.println(this.index+":"+this.name);
	}

	@Override
	public String getInfo() {
		return this.name;
	}

}
