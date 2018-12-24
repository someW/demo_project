package com.tit2;

public class NutritionFacs_JavaBeans {
	private int servingSize  = -1;
	private int servings 	 = -1;
	private int calories	 = 0;
	private int fat			 = 0;
	private int sodium		 = 0;
	private int carbohydrate = 0;
	
	public NutritionFacs_JavaBeans(){}
	//setters
	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
	public static void main(String[] args) {
		NutritionFacs_JavaBeans nj  = new NutritionFacs_JavaBeans();
		nj.setServingSize(240);
		nj.setServings(8);
	}

}
