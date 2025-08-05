package Activities;

import java.util.HashSet;

public class Activity10 {
	public static void main (String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");//Adding elements
		hs.add("A");
		hs.add("L");
		hs.add("S");
		hs.add("H");
		hs.add("N");
		
		System.out.println("Original Hashset: " +hs);//Print Hashset
		
		System.out.println("Size of the Hashset: "+hs.size()); //Size of Hashset
		
		System.out.println("Remvoing H from Hashset: "+hs.remove("H")); //Removing a letter
		
		if (hs.remove("C")) {
			System.out.println("C is removed from Hasset");
				}
		else {
		System.out.println("C is not removed from Hashset");
		}	
		System.out.println("Checking if N is present: " +hs.contains("N"));
		System.out.println("Updated Hashset: "+hs);
			
	}}

