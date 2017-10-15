package IntroToArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("Abi");
		names.add("Ian");
		names.add("Aaron");
		names.add("Andrew");
		names.add("Sheep");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			String n = names.get(i);
			System.out.println(n);
		}
		//4. Print all the Strings using a for-each loop
		for (String n : names) {
			System.out.println(n);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i= i+2) {
			String n = names.get(i);
			System.out.println(n);
		}
		//6. Print all the Strings in reverse order.
		for (int i = names.size()-1 ; i >=  0; i--) {
			String n = names.get(i);
			System.out.println(n);
		}		
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i++) {
			String n = names.get(i);
			if(n.indexOf('e') > -1) {
				System.out.println(n);				
			}
		}
	}}
