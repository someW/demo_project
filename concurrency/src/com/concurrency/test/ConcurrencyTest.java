package com.concurrency.test;
/**
 * 
 * @remark 
 * @author Thinkpad
 * @createTime 2018��5��27�� t����5:23:53
 *
 */
public class ConcurrencyTest {
	
	private static final long count = 100000001;
	
	public static void main(String[] args) {
		concurrency();
		serial();
	}
	
	private static void concurrency() {
		long start = System.currentTimeMillis();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				int a = 0;
				for(long i=0;i<count;i++) {
					a +=5;
				}
				
			}
		});
		thread.start();
		int b =0;
		for(long i=0;i<count;i++) {
			b--;
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("ConcurrencyTest.concurrency():"+time+"ms,b="+b);
	}
	
	private static void serial() {
		long start = System.currentTimeMillis();
		int a = 0 ;
		for(long i=0;i<count;i++) {
			a += 5;
		}
		int b = 0;
		for(long i=0;i<count;i++) {
			b--;
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("serial:"+time+"ms,b="+b+",a="+a);
	}
	

}
