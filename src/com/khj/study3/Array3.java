package com.khj.study3;

public class Array3 {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		System.out.println(nums.length);

		int [] copyNums = new int [nums.length+1];
		System.out.println(copyNums[4]);
		
		for(int i=0;i<nums.length;i++) {
			copyNums[i]=nums[i];
		}

		copyNums[nums.length]=5;
		
		nums=copyNums;
		
		//nums = 5칸
		
		int [] newNums = new int [4];
		
		for(int i=0;i<newNums.length;i++) {
			newNums[i]=nums[i];
		}
		
		nums=newNums;
				
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);			
		}
		System.out.println(nums.length);
	}
}
