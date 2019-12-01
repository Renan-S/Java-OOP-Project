package ui;

import java.util.Scanner;

public abstract class UI {
	
	protected static void print(String msg) {
		System.out.print(msg);
	}

	protected static void println(String msg) {
		System.out.println(msg);
	}
	protected static Scanner sc = new Scanner(System.in);
	
	protected static String scanTxt() {
		
		String resultado = sc.nextLine();
		
		return resultado;
	}
	protected static int scanInt() {
		int resultado = sc.nextInt();
		sc.nextLine();
		return resultado;
	}
	protected static double scanDouble() {
		double resultado = sc.nextDouble();
		sc.nextLine();
		return resultado;
	}
	
	public abstract void menu();


}