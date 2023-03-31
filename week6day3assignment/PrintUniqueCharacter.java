package week6.day3assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name = "Yaswanth";
		char[] character = name.toCharArray();
		Set<Character> print=new HashSet<Character>();
		for (Character character2 : character) {
			boolean value =print.add(character2);
			if (value==false) {
				print.remove(character2);
			}
			
		}
		System.out.println(print);
	}

}
