package Program;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("#>");
		String cod = sc.nextLine();
		
		while(!"exit()".equals(cod)) {
			switch (cod) {
			case "coun":
				try {
					System.out.print("Nome:");
					String nome = sc.nextLine();
					System.out.print("Email:");
					String email = sc.nextLine();
					System.out.print("Senha:");
					String senha = sc.nextLine();
					System.out.print("Numero de telefone:");
					int numero = sc.nextInt();
				}
				catch(java.util.InputMismatchException e) {
					System.out.println("use somente numeros");
				}
				break;

			default:
				System.out.println("codigo '"+cod+"' não existe");
				break;
			}
			System.out.print("#>");
			cod = sc.nextLine();
		}
	}//man

}//Princpal
