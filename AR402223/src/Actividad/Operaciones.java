package Actividad;

import java.util.Scanner;

public class Operaciones {

	public Operaciones() {
		
		
	}
	
	

	public static void main(String[] args) {
		
		int numero1,numero2,suma,resta , resMultiplicar =0 ;
		float resDivision = 0;
		numero1 = 0;
		numero2 = 0;
		suma = 0;
		resta = 0;
		resMultiplicar =0 ;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inrudocca un nombero entero positivo: ");		
		numero1 = teclado.nextInt() ;
		
		System.out.println("Inrudocca un nombero entero positivo: ");		
		numero2 = teclado.nextInt() ;
		
		if((numero1 > 0)  && (numero2 > 0)) {
			suma = numero1 + numero2;
			
			resta = numero1 - numero2;
			
			resMultiplicar =  numero1 * numero2;
			
			resDivision =  numero1 / numero2;
		}

		
		System.out.println("la suma es :  " + suma);
		System.out.println("la resta es :  " + resta);
		System.out.println("la multiplicar es :  " + resMultiplicar);
		System.out.println("la devecion es :  " + resDivision);
		
		
		
	}

}
