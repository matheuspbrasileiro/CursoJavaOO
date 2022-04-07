import java.util.Scanner;

public class EstruturaCondiciona2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("quantas horas");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("BOM DIA");
		} else {
			if (hora < 18) {
				System.out.println("BOA TARDE");
			} else {
				System.out.println("BOA Noite");
			}

		}

		sc.close();

	}
}
