package com.demo;

import java.util.ArrayList;
import java.util.List;

public class demo1 {
	
	public static void main(String[] args) {
		int[] nums = {2,3,4,5,6,73,324,5,55};
		sortNum(nums);
		for(int x : nums) {
			System.out.print(x+",");
		}

	}
	
	
	public static void sortNum(int[] nums) {
		int t;
		if(nums==null||nums.length<=0) {
			throw new RuntimeException("---¿ÕÊý×é---");
		}else {
			for(int i=0;i<nums.length;i++) {
				for(int j=0;j<nums.length-i-1;j++) {
					if(nums[j]>nums[j+1]) {
						t=nums[j];
						nums[j]=nums[j+1];
						nums[j+1]=t;
					}
				}
			}
		}
	}

}
