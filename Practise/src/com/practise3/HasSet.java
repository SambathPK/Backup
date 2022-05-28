package com.practise3;

import java.util.HashSet;
import java.util.Set;

public class HasSet {
public static void main(String[] args) {
  Set<Object> hs= new HashSet<Object>();
  
  hs.add(1);
  hs.add(2);
  hs.add(3);
  hs.add(4);
  hs.add(5);
  hs.add("Hello");
  hs.add('c');
  
  System.out.println(hs);
  
}
}
