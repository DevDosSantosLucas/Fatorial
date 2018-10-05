/*
 * ESSE PROGRAMA RESULTA O FATORIAL DESEJADO USANDO RECURSÃO
 */

public class Fatorial {
	
	protected int Fatoriall(int fat) {
		if(fat==0)
			return 1;
		else return fat = fat*Fatoriall(fat-1);
		
	}
	

}
