
public class Pallindrome {

	public static void main(String[] args) {
		int r,n=101,sum=0;
		int a=n;
		
		while(n!=0) {                                                            
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		}
		
        if(a==sum) {
        	System.out.println(a+ " is pallindrome");
        }
        else {
        	System.out.println(a+ " is not pallindrome");
        }
	}

}
