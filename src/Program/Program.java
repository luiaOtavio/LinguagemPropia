package Program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entites.Acount;

public class Program {

	public static void main(String[] args)throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Acount> conta = new ArrayList<>();
		
		System.out.print("#>");
		String cod = sc.nextLine();
		
		while(!"exit()".equals(cod)) {
			switch (cod) {
			
			case "acount()":							
				System.out.print(" Nome do arquivo + extenção:(exemplo.txt) ");
				String nomes = sc.nextLine();			
				System.out.print("Local onde quer armazena(c:\\exemplo\\):");
				String arq = sc.nextLine();
				String tudo = arq+"\\"+nomes;
				System.out.println(tudo);
				System.out.println("");				
				File file = new File(tudo);
				try (BufferedWriter br = new BufferedWriter(new FileWriter(tudo))) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					System.out.print("Nome:");
					String nome = sc.nextLine();
					
					System.out.print("Email:");
					String email = sc.nextLine();
					
					System.out.print("Senha:");
					String senha = sc.nextLine();
					
					System.out.print("Numero de telefone: ");
					int numero = sc.nextInt();
					Integer.toString(numero);
					System.out.println("Conta criada com exito !!!");
					Acount id = new Acount(nome, email, senha, numero);
					conta.add(id);
					
					Date data = new Date();
					br.write(sdf.format(data)+"\nnome: "+nome+"\nemail: "+email+"\nsenha: "+senha+"\nnumero: "+numero);
					
				}//try			
				catch(java.util.InputMismatchException e) {
					System.out.println("use somente numeros");
					file.delete();
				}//catch
				
				catch(IOException e) {
					System.out.println("Erro: "+e.getMessage());
					file.delete();
				}//catch
				break;
				//case 1
				
			case "list()":
				System.out.println("Lista de contas criada na abertura do sistema");
				for(Acount x: conta) {
					System.out.println(x);
				}//for
				break;
				//case2
			
			case "chat()":
				System.out.println("Mini chat com o programaaaaa :)");
				System.out.println("");
				System.out.println("Ola, tudo bem? ");
				String fala = sc.nextLine().toLowerCase();
				if(fala.contains("si")|| fala.contains("bem")||fala.contains("uhu")||fala.contains("cla")||fala.contains("ss")||fala.contains("oti")) {
				  if(fala.contains("?")||fala.contains("vc")||fala.contains("voc")||fala.contains("tu")) {
					 System.out.println("que bom!!!, vou bem tambem rs");
				  }
				  else {
					 System.out.println("que bom :)");
				  }
				}
				else if(fala.contains("nn")||fala.contains("nop")||fala.contains("não")||fala.contains("no")) {
					System.out.println("ouu por que? ");
					fala = sc.nextLine();
					System.out.println("entendi, te desejo melhoras");
				}
				else {
					System.out.println("ah tendi tendi");
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
