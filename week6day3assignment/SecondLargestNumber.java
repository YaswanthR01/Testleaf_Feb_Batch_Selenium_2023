package week6.day3assignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> num =new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			num.add(data[i]);
				
		}
		System.out.println(num);
		List<Integer> number =new ArrayList<Integer>(num);
		System.out.println(number.get(number.size()-2));
	}
}

