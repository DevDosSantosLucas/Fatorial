/*
 * ESSE PROGRAMA RESULTA O FATORIAL DESEJADO USANDO RECURS�O
 */

public class Fatorial {
	
	protected int Fatoriall(int fat) {
		if(fat==0)
			return 1;
		else return fat = fat*Fatoriall(fat-1);
		
	}
	

}
