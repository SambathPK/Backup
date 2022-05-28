package com.practise3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkhasMap {
public static void main(String[] args) {
	Map<Integer,String> hm =new LinkedHashMap<>();
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
