package com.enmCommonUse7;
/**
 * �÷�����switch
 * JDK1.6֮ǰ��switch���ֻ֧��int,char,enum���ͣ�ʹ��ö�٣��������ǵĴ���ɶ��Ը�ǿ�� 
 * @author WBB
 *
 */
enum Signal {  
    GREEN, YELLOW, RED  
}  
public class TrafficLight {
	Signal color = Signal.RED;
	public void chengr() {
		switch(color) {
			case RED:
				color = Signal.GREEN;
				break;
			case YELLOW:
				color = Signal.RED;
				break;
			case GREEN:
				color = Signal.YELLOW;
				break;
		}
	}
}
