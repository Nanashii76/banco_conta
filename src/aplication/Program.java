package aplication;

import java.util.Scanner;
import entities.Conta;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number:\n");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder:\n");
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit: (y/n)\n");
		char confirm = sc.next().charAt(0);
		
		
		if ( confirm == 'y' ) {
			System.out.print("Enter initial deposit value:\n");
			double deposito = sc.nextDouble();
			
			Conta pessoa = new Conta(number, name, deposito);
			System.out.println("Account data:");
			System.out.println(pessoa.toString() + "\n");
			
			System.out.print("Enter a deposit value:\n");
			deposito = sc.nextDouble();
			pessoa.deposito(deposito);
			System.out.println("Updated account data: ");
			System.out.println(pessoa.toString() + "\n");
			
			System.out.print("Enteder a withdraw value:\n");
			double saque = sc.nextDouble();
			pessoa.saque(saque);
			System.out.println("Updated account data:");
			System.out.println(pessoa.toString() + "\n");
			
		} else {
			Conta pessoa = new Conta(number,name);
			System.out.println(pessoa.toString() + "\n");	
			
			System.out.print("Enter a deposit value:\n");
			double deposito = sc.nextDouble();
			pessoa.deposito(deposito);
			System.out.println("Updated account data: ");
			System.out.println(pessoa.toString() + "\n");
			
			System.out.print("Enteder a withdraw value:\n");
			double saque = sc.nextDouble();
			pessoa.saque(saque);
			System.out.println("Updated account data:");
			System.out.println(pessoa.toString() + "\n");
		}
		
		sc.close();
		

	}

}
