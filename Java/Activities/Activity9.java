package Activities;

import java.util.ArrayList;

public class Activity9 {
	public static void main (String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Mango");
		myList.add("Apple");
		myList.add("Banana");
		myList.add(1, "Grapes");
		myList.add(0, "Papaya");
		System.out.println("Print all the Fruit names:");
		for (String s: myList) {
		System.out.println (s);
		}	
	System.out.println ("The thrid fruit in the list: " + myList.get(2));
	System.out.println("CHeck if Banana is in the List: " + myList.contains("Banana"));
	System.out.println("The size of the Array list: " +myList.size());
	myList.remove("Papaya");
	
	System.out.println("The size of the Array list: " +myList.size());
	
	}

}
