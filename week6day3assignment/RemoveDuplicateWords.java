package week6.day3assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] msg =text.split(" ");
		Set<String> names =new LinkedHashSet<String>();
		for (int i = 0; i < msg.length; i++) {
			names.add(msg[i]);
		}
		
		System.out.println(names);
		String string = names.toString().replaceAll("[^A-Z a-z 0-9]", "");
	    System.out.println(string);
	}

}
