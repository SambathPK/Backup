package com.practise3;

import java.util.HashMap;
import java.util.Map;

public class HasMap {
public static void main(String[] args) {
	Map<Integer,String> hm =new HashMap<>();
	hm.put(2, "Sampath");
	hm.put(3, "Subhash");
	hm.put(1, "Prithvi");
	hm.put(4, "Rohin");
	hm.put(6, "Tharun");
	hm.put(5, "Raghul");
	hm.put(7, "Sampath");
	
	System.out.println(hm);
	System.out.println(hm.get(2));
	
	hm.replace(2,"Pablo");
	System.out.println(hm);
	
	hm.put(9, "Gustavo");
	System.out.println(hm);
	
}
}
