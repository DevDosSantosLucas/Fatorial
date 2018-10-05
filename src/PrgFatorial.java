import java.util.Scanner;

public class PrgFatorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Fatorial f1 = new Fatorial();
		System.out.println("== FATORIAL ==");
		System.out.println("ESCOLHA UM NÚMERO: ");
		int fat = scn.nextInt();
		f1.Fatoriall(fat);
		System.out.println("o Fatorial de "+fat+" é: "+f1.Fatoriall(fat) );

	}

}
