package com.enmCommonUse7;
/**
 * 用法一：常量
 * 在JDK1.5 之前，我们定义常量都是： public static fianl.... 。
 * 现在好了，有了枚举，可以把相关的常量分组到一个枚举类型里，
 * 而且枚举提供了比常量更多的方法。 
 * @author WBB
 *
 */
public enum Color {
	RED,GREEN,BLANK,YELLOW;
	
	public static void main(String[] args) {
		System.out.println(Color.YELLOW);
	}
}
