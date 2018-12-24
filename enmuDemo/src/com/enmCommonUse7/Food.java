package com.enmCommonUse7;
/**
 * �÷�����ʹ�ýӿ���֯ö��	
 * @author Thinkpad
 *
 */
public interface Food {
	enum Coffee implements Food {
		BLACK_COFFEE,DECAF_COFFEE,LATTE,CAPPUCCINO
	}
	
	enum Dessert implements Food {
		  FRUIT, CAKE, GELATO  
	}
	
	static void testImplementsInterface() { 
		for(Food.Dessert dessertEnum : Food.Dessert.values()) {
			System.out.println(dessertEnum + "  ");  
		}
		//���о��Ǹ�����̬���Ĺ��ܰɣ�
		Food food = Food.Dessert.CAKE;
		System.out.println(food);
		food = Coffee.BLACK_COFFEE;  
		System.out.println(food);
	}
	public static void main(String[] args) {
		testImplementsInterface();
	}
}


