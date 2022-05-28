package com.practise2;

public class StringDemo1 {
public static void main(String[] args) {
	String s="Plata or Plomo";
   int length = s.length();  
   System.out.println(length);
   
   boolean equals = s.equals("Plata or Plomo");
   System.out.println(equals);
   
   boolean equalsIgnoreCase = s.equalsIgnoreCase("plata or plomo");
   System.out.println(equalsIgnoreCase);
   
   boolean contains = s.contains("or");
   System.out.println(contains);
   
   char charAt = s.charAt(4); 
   System.out.println(charAt);
   
   int indexOf = s.indexOf("a");
   System.out.println(indexOf);
   
   String upperCase = s.toUpperCase();
   System.out.println(upperCase);
   
   String lowerCase = s.toLowerCase();
   System.out.println(lowerCase);
   
   boolean startsWith = s.startsWith("Plata");
   System.out.println(startsWith);
   
   boolean endsWith = s.endsWith("omo");
   System.out.println(endsWith);
   
   String replace = s.replace('a', 'i'); 
   System.out.println(replace);
   
   String replace2 = s.replace("Plata or Plomo", "Tata");
   System.out.println(replace2);
   
   String substring = s.substring(3);
   System.out.println(substring);
   
   String substring2 = s.substring(3, 10);
   System.out.println(substring2);
   
   CharSequence subSequence = s.subSequence(2,7);
   System.out.println(subSequence);
   

   
}
}
