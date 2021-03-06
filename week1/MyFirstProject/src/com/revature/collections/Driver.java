package com.revature.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Larry");
		names.add("Sally");
		names.add("Ned Stark");
		names.add("Ned Stark");
		
		for(String name : names) {
			StringBuilder sb = new StringBuilder(name);
			System.out.println(sb.reverse());
		}
		
		List<String> names2 = new ArrayList<>();
		
		names2.add("Larry");
		names2.add("Sally");
		names2.add("Ned Stark");
		names2.add("Ned Stark");
		
		System.out.println(names.equals(names2)); // Will be true
		System.out.println(names == names2); // Will be false
		
		names2.add("Barry");
		
		System.out.println(names.equals(names2)); // Will be false
		
		System.out.println(names.get(2));
		
		Set<String> namesSet = new HashSet<>();
		
		namesSet.add("Larry");
		namesSet.add("Sally");
		namesSet.add("Ned Stark");
		namesSet.add("Ned Stark");
		
		// Let's say we are looking for Ned Stark
		// We can also check the set to see if Ned Stark is in the Set at all
		System.out.println(namesSet.contains("Ned Stark")); // Will be true
		String ned;
		for(String name : namesSet) {
			System.out.println(name);
			if(name.equals("Ned Stark")) {
				ned = name;
			}
		}
		
		Queue<String> myQueue = new LinkedList<>();
		
		myQueue.add("Larry");
		myQueue.add("Sally");
		myQueue.add("Ned Stark");
		myQueue.add("Ned Stark");
		
		for(String name : myQueue) {
			System.out.println(name);
		}
		// The above enhanced for-loop does work
		// But it doesn't really follow the classic way of working with a FIFO data structure
		
		System.out.println(myQueue.size());
		
		// Below is a way of processing every element in the queue, one by one
		// By the end, the queue will be empty
		while(!myQueue.isEmpty()) {
			String name = myQueue.poll();
			System.out.println(name);
		}
		
		System.out.println(myQueue.size());
		
		
		Map<String, Integer> frequencyMap = new HashMap<>();
		// The keys in Maps are unique
		
		// Populating the map
		for(String name : names) {
			if(frequencyMap.containsKey(name)) {
				// The frequencyMap already contains the count for this name
				// So we want to increase that count by 1
				int currentCount = frequencyMap.get(name); // Obtain the current count
				frequencyMap.put(name, currentCount + 1); // Replace the count with 1 higher value
			} else {
				// The frequencyMap has yet to count this particular name
				frequencyMap.put(name, 1); // Track the name with a count of 1 if we haven't seen it before
			}
		}
		
		System.out.println(frequencyMap);
		
		// We have 2 methods: keySet() and entrySet() which returns a Set of the keys or entries
		// that we can use to iterate over
		for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// The below for loop does the same thing as above, but is slightly less efficient
//		for(String key : frequencyMap.keySet()) {
//			Integer value = frequencyMap.get(key);
//			
//			// Other steps below
//		}
	}

}
