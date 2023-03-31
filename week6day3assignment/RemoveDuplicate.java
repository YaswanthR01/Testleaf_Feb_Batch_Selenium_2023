package week6.day3assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//expected output =ylnd
public class RemoveDuplicate {
	public static void main(String[] args) {
		String paypa ="PayPal India";
		String replaceAll = paypa.replaceAll("\\s","");
		System.out.println(replaceAll);
		String lowerCase = replaceAll.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		Set<Character> pay =new LinkedHashSet<Character>(); 
		Set<Character> dup =new LinkedHashSet<Character>();
		for (Character character :charArray) {
			boolean value=pay.add(character);
			if(value==false) {
				dup.add(character);
		}
			}
		List<Character> pay1 = new ArrayList<Character>(pay);
		List<Character> dup2 =new ArrayList<Character>(dup);
		for (int i = 0; i <pay1.size() ; i++) {
			for (int j = 0; j < dup2.size(); j++) {
				if (pay1.get(i)==dup2.get(j)) {
					pay1.remove(pay1.get(i));
				}
				
			}
			
		}
		System.out.println(pay);
		System.out.println(dup);
		System.out.println(pay1);


	}}
