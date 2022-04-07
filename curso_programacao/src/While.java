import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		
		//regra de exec   Regra = v  = executa e volta f = cai fora
//		while(condicao) {
//			comando 1
//			comando 2
//		}
		
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		int soma = 0;	
		while (x!=0) {
			soma = soma +x ;
			//ou  assim soma += x ;
			x= sc.nextInt();
		}
		sc.close();
		System.out.println(soma);
	}
	
}
