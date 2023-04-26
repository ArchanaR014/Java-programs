
public class Reverse {

	public static void main(String[] args) {
		int r,n=123456,sum=0;
		int a=n;
		
		while(n!=0) {                                                            
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		}
		
		System.out.println("reversed no "+ sum);
	}

}
