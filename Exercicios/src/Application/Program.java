package Application;
import java.util.Locale;
import entities.Account;
import java.util.Scanner;


public class Program{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		double balance;
		int accountNumber;
		String holder, yn;
		
	
		
		
		System.out.print("Enter account number: ");
		accountNumber = sc.nextInt();
		sc.nextLine(); // consome a quebra de linha

		System.out.print("Enter account holder: ");
		holder = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)?");
		yn = sc.nextLine();
		
		if (yn.equalsIgnoreCase("y")) {
			System.out.println("Enter  initial deposit value: ");
			balance = sc.nextDouble();
		}
		
		else {
		    balance = 0.0;
		}
		
		 Account account = new Account(accountNumber, holder, balance);

		 System.out.println();
		 System.out.println("Account data:");
		 System.out.println(account);
		 System.out.println();

		 System.out.print("Enter a deposit value: ");
		 double depositValue = sc.nextDouble();
		 account.deposit(depositValue);

		 System.out.println("Updated account data:");
		 System.out.println(account);
		 System.out.println();

		 System.out.print("Enter a withdraw value: ");
		 double withdrawValue = sc.nextDouble();
		 account.withdraw(withdrawValue);

		 System.out.println("Updated account data:");
		 System.out.println(account);
		 System.out.println();

		
		
sc.close();
}
}