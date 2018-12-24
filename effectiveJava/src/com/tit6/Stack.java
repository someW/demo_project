package com.tit6;

import java.util.Arrays;
import java.util.EmptyStackException;
//简单栈实现 - 存在内存泄漏问题
public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop() {
		if(size==0)
			throw new EmptyStackException();
//		return elements[--size];	//存在内存泄漏
		//修改后
		Object result = elements[--size];
		elements[size] = null;	//消除内存泄漏
		return result;
	}
	
	private void ensureCapacity() {
		if(elements.length == size)
			elements = Arrays.copyOf(elements, 2*size+1);
	}

}
