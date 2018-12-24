package com.enumSingleton;
/**
 * 枚举单例
 * @author WBB
 *使用枚举单例的写法，我们完全不用考虑序列化和反射的问题
 *枚举序列化是由jvm保证的，每一个枚举类型和定义的枚举变量在JVM中都是唯一的
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
