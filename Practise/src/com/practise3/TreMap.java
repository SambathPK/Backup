package com.practise3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreMap {
public static void main(String[] args) {
	Map<Integer,String> hm =new TreeMap<>();
	hm.put(2, "Sampath");
	hm.put(3, "Subhash");
	hm.put(1, "Prithvi");
	hm.put(4, "Rohin");
	hm.put(6, "Tharun");
	hm.put(5, "Raghul");
	hm.put(7, "Sampath");
	
	System.out.println(hm);
}
}
