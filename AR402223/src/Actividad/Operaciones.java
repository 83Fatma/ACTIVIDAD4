package Actividad;

import java.util.Scanner;

//-----------
//programa que realiza las operaciones matimaticas
//
//@Fatma
//31/3/2023
//-------------

public class Operaciones {
	

	//constructor
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
		
		//mostrar al usuario mensaje 
		System.out.println("Inrudocca un nombero entero positivo: ");
		
	    //leer numero entero por el teclado
		numero1 = teclado.nextInt() ;
		
		//mostrar al usuario mensaje 
		System.out.println("Inrudocca un nombero entero positivo: ");
		
		//leer numero entero por el teclado
		numero2 = teclado.nextInt() ;
		
		//comprobar si el numero positivo o no
		if((numero1 > 0)  && (numero2 > 0)) {
			
			//Sumar los dos numeros
			suma = extractedSuma(numero1, numero2);
			
			//Restar los dos numeros
			resta = extractedResta(numero1, numero2);
			
			//Multiplicar los dos numeros
			resMultiplicar = extractedMutiplicar(numero1, numero2);
			
			//Devidir los dos numeros
			resDivision = extractedDividir(numero1, numero2);
		}

		extracted(suma, resta, resMultiplicar, resDivision);
		
		
		
	}



	private static float extractedDividir(int numero1, int numero2) {
		float resDivision;
		resDivision = (float) numero1 / numero2;
		return resDivision;
	}



	private static int extractedMutiplicar(int numero1, int numero2) {
		int resMultiplicar;
		resMultiplicar =  numero1 * numero2;
		return resMultiplicar;
	}



	private static int extractedResta(int numero1, int numero2) {
		int resta;
		resta = numero1 - numero2;
		return resta;
	}



	private static int extractedSuma(int numero1, int numero2) {
		int suma;
		//Sumar los dos numeros
		suma = numero1 + numero2;
		return suma;
	}



	private static void extracted(int suma, int resta, int resMultiplicar, float resDivision) {
		//mostrar los resultados en pantalla
		System.out.println("la suma es :  " + suma);
		System.out.println("la resta es :  " + resta);
		System.out.println("la multiplicar es :  " + resMultiplicar);
		System.out.println("la devecion es :  " + resDivision);
	}

}
