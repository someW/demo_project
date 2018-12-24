package com.tit2;

public class NutritionFacs_Builder {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder{
		//required parameters
		private final int servingSize;
		private final int servings;
		
		//optional parameters - initialized to default values
		private int calories	   = 0;
		private int fat		   = 0;
		private int carbohydrate = 0;
		private int sodium	   = 0;
		
		public Builder(int servingSize,int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val){
			calories = val;
			return this;
		}
		public Builder fat(int val){
			fat = val;
			return this;
		}
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		public Builder sodium(int val){
			sodium = val;
			return this;
		}
		
		public NutritionFacs_Builder build(){
			return new NutritionFacs_Builder(this);
		}
	}
	
	private NutritionFacs_Builder(Builder builder){
		servingSize  = builder.servingSize;
		servings     = builder.servings;
		calories     = builder.calories;
		fat 		 = builder.fat;
		sodium		 = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	public static void main(String[] args) {
		NutritionFacs_Builder nb = new NutritionFacs_Builder.Builder(240, 8).
			calories(100).sodium(35).carbohydrate(27).build();
		
	}

}
