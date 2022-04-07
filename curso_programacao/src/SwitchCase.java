import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// switchCase
		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "não existe este dia";
			break;
		}
		System.out.println("dia da semana" + dia);

		// if e else

//	int x = sc.nextInt();
//	String dia ;
//	
//	if(x == 1) {
//		dia = "domingo";
//	}else {
//		if(x == 2) {
//			dia= "segunda";
//		}else {
//			if(x ==3) {
//			dia="terça";
//			}else {
//				if( x == 4) {
//					dia = "quarta";
//			}else {
//				if(x == 5) {
//					dia = "quinta";
//				}
//				else {
//					if(x==6) {
//						dia = "sexta";
//					}else {
//						if(x == 7) {
//							dia = "sabado";
//						}
//					}
//				}
//			}
//		}
//	}

		sc.close();

	}

}
