package MethodOverriding;

public class Ufc2 extends Ufc1{
	@Override
	public void conorMcgregor() {
		// TODO Auto-generated method stub
		super.conorMcgregor();
	}
	@Override
	public void conorMcgregor(int a) {
		
		super.conorMcgregor(a);
	}
	
	
	public static void main(String[] args) {
		Ufc2 u2=new Ufc2();
		u2.conorMcgregor();	
		u2.conorMcgregor(20);
	}
	


}
