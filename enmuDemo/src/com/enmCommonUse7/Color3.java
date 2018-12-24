package com.enmCommonUse7;
/**
 * 用法三：向枚举中添加新方法
 * 如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。
 * 而且 Java 要求必须先定义 enum 实例。 
 * @author WBB
 *
 */
public enum Color3 {
	RED("红",1),GREEN("绿",2),BLANK("白",3),YELLO("黄",4);
	//成员变量
	private String name;
	private int index;
	//构造函数
	private Color3(String name,int index) {
		this.name = name;
		this.index = index;
	}
	
	//普通方法
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
