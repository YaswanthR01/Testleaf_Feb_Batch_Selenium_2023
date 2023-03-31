package week6.day3assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("HCL");
		names.add("Wipro");
		names.add("Aspire Systems");
		names.add("CTS");
		System.out.println(names.size());
		Collections.sort(names);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
	}

}
