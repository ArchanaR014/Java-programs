import java.util.Scanner;

class bank11{
	String name;
	double balance;
	
	public void account() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.nextLine();
		
		System.out.println("enter balance");
		balance=sc.nextDouble();
				
	}
}

class deposit extends bank11{
	double amnt;
	
	public void deposit_acc() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amnt");
		amnt=sc.nextInt();
		
		double amnt1= (balance+amnt);
		System.out.println("ur balance is " +amnt1);
		
	}
}

class archana extends deposit{
	String email;
	long phno;
	
	public void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email addr");
		email=sc.nextLine();
		System.out.println("enter phone no");
		phno=sc.nextLong();
		
	}
}

public class Inheri {

	public static void main(String[] args) {
		 archana d=new archana();
		d.account();
		d.deposit_acc();
		d.display();
	}
}

