import java.util.Locale;

public class Exe1 {
public static void main(String[] args) {
		
		int y = 107;
		double x = 10.3555;
		
		System.out.println(y);
		System.out.println("ola mundo");
		System.out.printf("%.2f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n",x);
	}

}
