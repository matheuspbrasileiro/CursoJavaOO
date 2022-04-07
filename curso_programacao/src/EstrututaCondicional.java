import java.util.Scanner;

public class EstrututaCondicional {
	public static void main(String[] args) {
//simples
		int x = 5;

		System.out.println("bom dia");

		if (x < 0) {
			System.out.println("boa tarde");
		}

		System.out.println("boa noite");

	


	//composta
	//if e Else
	
	Scanner sc = new Scanner(System.in);
	int hora;

	System.out.println("quantas horas");
	hora = sc.nextInt();
	
	if(hora <12) {
		System.out.println("BOM DIA");
	}
	
	else {
		System.out.println("BOA TARDE");
	}

	
	sc.close();
	}
	
	
}
