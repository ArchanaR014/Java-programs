import java.util.*;

class average1{
	private int a,b,c;
	
	public void calculate() {
		    Scanner scan=new Scanner(System.in);
		    System.out.println("enter 1st no");
			int a=scan.nextInt();
			System.out.println("enter 2nd no");
			int b=scan.nextInt();
			System.out.println("enter 3rd no");
			float c=scan.nextFloat();
			c=(a+b+c)/3;
			System.out.println("result=" +c);
	}
}

public class Average {

	public static void main(String[] args) {
		  average1 a1=new average1();
		  a1.calculate();

	}

}



