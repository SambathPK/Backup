package MethodOverriding;

public class Ufc1 {
public void conorMcgregor() {
		System.out.println("UFC welterweight champion");
	}
public  void conorMcgregor(int a) {
	System.out.println("UFC Heavyweight champion");
}
public static void main(String[] args) {
	Ufc1 u=new Ufc1();
	u.conorMcgregor();
	u.conorMcgregor(10);
}

}
