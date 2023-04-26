import java.util.*;

class area{
	private int l,b,res;
	
	/*public area(int l1,int b1) {
		l=l1;
		b=b1;
	}*/
	public area(int l,int b) {
		this.l=l;
		this.b=b;
	}
	
	public void getArea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int l=sc.nextInt();
		
		System.out.println("enter breadth");
		int b=sc.nextInt();
		
		res=l*b;
		System.out.println("area of rectangle is " +res);
		
	}
}
public class Rectangle {

	public static void main(String[] args) {
		area a=new area(4,2);
		a.getArea();
	}

}

