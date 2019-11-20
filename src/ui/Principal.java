package ui;

import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		
		int opcao=0;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("escolha uma das opcões\n1 MenuCliente...."); //continuar
			opcao = s.nextInt();
					switch(opcao) {
					case 1:
						UICliente uiCliente = new UICliente();
						uiCliente.showMenuCliente();
						break;
					case 0:
						System.out.println("Obrigado por utilizar o Sistema");
					default:
						System.out.println("Opção invalidade");
						break;
					}
		}while(opcao!=0);
		s.close();
	}
	
}
