package week6.day3assignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,7,8,9,1,2,3,10};
		
		Set<Integer> num =new TreeSet<Integer>();
		for (Integer integer : nums) {
			num.add(integer);
		}
		System.out.println(num);
		List<Integer> number =new ArrayList<Integer>(num);
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]!=j+1){
				System.out.println(j+1);
				break;
		}
		
			
			}
	}

}
