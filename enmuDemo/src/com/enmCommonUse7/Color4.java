package com.enmCommonUse7;
/**
 * 用法四：覆盖枚举的方法
 * toString()方法覆盖的例子。
 * @author WBB
 *
 */
public enum Color4 {
	RED("红",1),GREEN("绿",2),BLANK("白",3),YELLO("黄",4);
	private String name;
	private int index;
	private Color4(String name,int index) {
		this.name = name;
		this.index = index;
	}
	
	//覆盖方法
	@Override
	public String toString() {
		return this.index+"_"+this.name;
	}
	

	public static void main(String[] args) {
		System.out.println(Color4.RED.index);
	}
}
