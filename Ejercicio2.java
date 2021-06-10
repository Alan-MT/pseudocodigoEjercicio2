import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int n;
		System.out.print("ingresar un numero:  6");
		n = sca.nextInt();
		while (n>0) {
			System.out.println(n);
			n = n-1;
		}
	}


}

