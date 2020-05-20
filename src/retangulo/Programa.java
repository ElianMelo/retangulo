package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, altura;
		int menu;
		
		System.out.print("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		
		while(largura <= 0.0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		
		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		
		while(altura <= 0.0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}
		
		System.out.println();
		
		System.out.println("MENU:");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		System.out.print("Digite uma opcao: ");
		menu = sc.nextInt();
		
		System.out.println();
		
		if (menu == 1) {
			System.out.printf("AREA = %.1f%n", altura * largura);
			System.out.println();
		} else if (menu == 2) {
			System.out.printf("PERIMETRO = %.1f%n", (2 * altura) + (2 * largura));
			System.out.println();
		} else if (menu == 3) {
			System.out.println("FIM DO PROGRAMA!");
		} else {
			System.out.println("OPÇÃO INVALIDA");
			System.out.println();
		}
		
		while(menu != 3) {
			System.out.println("MENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite uma opcao: ");
			menu = sc.nextInt();
			
			System.out.println();
			
			if (menu == 1) {
				System.out.printf("AREA = %.1f%n", altura * largura);
				System.out.println();
			} else if (menu == 2) {
				System.out.printf("PERIMETRO = %.1f%n", (2 * altura) + (2 * largura));
				System.out.println();
			} else if (menu == 3) {
				System.out.println("FIM DO PROGRAMA!");
			} else {
				System.out.println("OPÇÃO INVALIDA");
				System.out.println();
			}
		}
		
		sc.close();
	}

}
