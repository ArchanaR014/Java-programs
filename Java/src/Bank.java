import java.util.Scanner;

class account{
	private String name;
	private int balance;
	
	public void set_data() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter name");
		name=scan.nextLine();
	}
	
	public String get_data() {
		System.out.println("your name is " +name);
		return name;
	}
	
	public void set_balance() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter balance");
		balance=scan.nextInt();
	}
	
	public int get_balance() {
		System.out.println("your balance is " +balance);
		return balance;
	}
}

public class Bank {

	public static void main(String[] args) {
		account a=new account();
		a.set_data();
		a.get_data();
		a.set_balance();
		a.get_balance();
	}

}
