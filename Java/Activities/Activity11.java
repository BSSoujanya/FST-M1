package Activities;

import java.util.HashMap;

public class Activity11 {
public static void main(String[] args) {
	HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	hash_map.put(1, "Blue");
	hash_map.put(2, "Black");
	hash_map.put(3,"White");
	hash_map.put(4, "Red");
	hash_map.put(5, "Green");
	
	System.out.println("The Original map: " +hash_map);
	hash_map.remove(5);
	System.out.println("Updated map is: "+hash_map);
	if(hash_map.containsValue("Red"))
	{
		System.out.println("Red is present in the map");
	}
	else {
		System.out.println("Red is not present in the map");
	}
	
	System.out.println("Size of the map is: " +hash_map.size());
}
}
