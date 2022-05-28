package com.practise;

public class InstanceVariable {
  
	     
	    public String name; 
	    String division;     
	    private int age;    
	   
	    public InstanceVariable(String sname)  
	    {  
	        name = sname;  
	    }  
	  
	    
	    public void setDiv(String sdiv)  
	    {  
	        division = sdiv;  
	    }  
	      
	    
	    public void setAge(int sage)  
	    {  
	        age = sage;  
	    }  
	  
	    
	    public void printstud()  
	    {  
	        System.out.println("Student Name: " + name );  
	        System.out.println("Student Division: " + division);   
	        System.out.println("Student Age: " + age);  
	    }  
	  
	    
	    public static void main(String args[])  
	    {  
	        InstanceVariable s = new InstanceVariable("SampT");  
	        s.setAge(18);  
	        s.setDiv("B");  
	        s.printstud();  
	    }  
	}  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

