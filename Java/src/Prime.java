import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int i;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int n=scan.nextInt();
		if(n==0||n==1) {
			System.out.println(n + " is not prime");
		}
		else {
			for(i=2;i<=n/2;i++) {
				if(n%i==0) {
					System.out.println(n+ " is not prime");
					break;
				}
			}
		       if(i>n/2) {
		    	   System.out.println(n+ " is prime");
			}
		}
	}

}
