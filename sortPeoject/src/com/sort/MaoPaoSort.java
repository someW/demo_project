package com.sort;

import java.util.ArrayList;
import java.util.List;

public class MaoPaoSort {
	
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(15);
		array.add(6);
		array.add(1);
		array.add(5);
		array.add(16);
		array.add(4);
		array.add(13);
		array.add(19);
		array.add(18);
		
		System.out.println(mpSort(array));
	}
	
	static List<Integer> mpSort(List<Integer> nums) {
		Integer t = 0;
		for(int i = 0; i<nums.size(); i++) {
			for(int j = 0; j<nums.size()-i-1; j++) {
				if(nums.get(j)>nums.get(j+1)) {
					t=nums.get(j);
					nums.set(j, nums.get(j+1));
					nums.set(j+1, t);
				}
			}
		}
		
		return nums;
		
	}

}
