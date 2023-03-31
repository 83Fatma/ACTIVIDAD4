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
			suma = numero1 + numero2;
			
			//Restar los dos numeros
			resta = numero1 - numero2;
			
			//Multiplicar los dos numeros
			resMultiplicar =  numero1 * numero2;
			
			//Devidir los dos numeros
			resDivision =  numero1 / numero2;
		}

		//mostrar los resultados en pantalla
		System.out.println("la suma es :  " + suma);
		System.out.println("la resta es :  " + resta);
		System.out.println("la multiplicar es :  " + resMultiplicar);
		System.out.println("la devecion es :  " + resDivision);
		
		
		
	}

}
