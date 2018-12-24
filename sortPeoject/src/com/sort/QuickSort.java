package com.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @remark 快速排序 : D&C 分治思想 分而治之
 * 	速度取决基准值，如果基准值取两头-最糟请款：O(n²)，取中间-平均情况：O(nlogn)
 * @author WJ
 * @createTime 2018年6月3日 t下午8:29:10
 *
 */
public class QuickSort {

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

		System.out.println(QuickSort(array));
	}

	public static String QuickSort(List<Integer> list) {
		if (list.size() < 2 && list.size() > 0)
			return QuickSort.toString(list);
		else {
			if (list.size() == 0) {
				return "";
			} else {
				// 基准值
				int pivot = list.get(list.size() / 2);
				List<Integer> less = new ArrayList<>();
				List<Integer> greater = new ArrayList<>();
				for (int i = 0; i < list.size(); i++) {
					if (pivot > list.get(i)) {
						less.add(list.get(i));
					} else if (pivot < list.get(i)) {
						greater.add(list.get(i));
					}
				}
				if (less.size() > 0 && greater.size() > 0) {
					return QuickSort(less) + "," + pivot + "," + QuickSort(greater);
				} else if (less.size() == 0) {
					return pivot + "," + QuickSort(greater);
				} else if (greater.size() == 0) {
					return QuickSort(less) + "," + pivot;
				}else {
					return "";
				}
			}
		}
	}
	
	public static String toString(List<Integer> list) {
		String num="";
		for(int n : list) {
			num+=n;
		}
		return num;
	}
	
}
