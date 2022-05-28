package JumpingStatement;

public class Return {
int a=10;
int b=20;
public int add() {
	int c = a+b;
	return c;
}
public static void main(String[] args) {
	Return r=new Return();
	int c=r.add();
	System.out.println(c);
}
}
