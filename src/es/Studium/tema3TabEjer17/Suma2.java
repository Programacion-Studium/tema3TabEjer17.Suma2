package es.Studium.tema3TabEjer17;
/**
Suma2 - Realizar un programa en JAVA que lea por teclado los elementos de un vector numérico y que visualice la suma de todos los elementos, utilizando una función que calcule y devuelva dicho valor.
 */
import java.util.Scanner;
import java.util.Vector; //importamos la herramienta para poder trabajar con vectores
public class Suma2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		Vector <Integer> vector1 = new Vector <Integer> (1, 1);
		introducirDatosVector(teclado, vector1);
		System.out.print("La suma de los Vectores es "+ sumar(vector1)); //mostramos por pantalla y llamamos a la funcion
	}
	//metodo para leer por teclado
	private static void introducirDatosVector(Scanner teclado, Vector<Integer> vector1) {
		int numero;
		do //Hacer y repetir
		{
			System.out.print("Introduzca un numero entero. (0 para salir)");
			numero= teclado.nextInt();
			if(numero!=0) //si numero no es 0 rellenamos el vector con el numero introducido
			{
				vector1.addElement(numero);
			}
		}while(numero!=0); //mientras no introduzcamos 0
	}
	//funcion para sumar vectores
	public static int sumar(Vector<Integer> vector1)
	{
		int i;
		int suma=0;
		for (i=0;i<vector1.size();i++) //Recorremos el vector para calcular la suma
		{
			suma=suma+vector1.elementAt(i);
		}
		return suma;
	}
}