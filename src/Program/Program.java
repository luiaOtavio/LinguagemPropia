package Program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
			case "acount()":
				System.out.print("Local onde quer armazena(c:\\exemplo\\titulo.txt):");
				String arq = sc.nextLine();
				try (BufferedWriter br = new BufferedWriter(new FileWriter(arq))) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					System.out.print("Nome:");
					String nome = sc.nextLine();
					
					System.out.print("Email:");
					String email = sc.nextLine();
					
					System.out.print("Senha:");
					String senha = sc.nextLine();
					
					Date data = new Date();
					br.write(sdf.format(data)+"\nnome: "+nome+"\nemail: "+email+"\nsenha: "+senha);
				}
				catch(java.util.InputMismatchException e) {
					System.out.println("use somente numeros");
				}
				
				catch(IOException e) {
					System.out.println("Erro: "+e.getMessage());
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
