package Vectores;

import java.util.Scanner;

public class MainD1Vectores {
	
	public static void main(String[]arg) {
		
		//Declara un vector X(8)
		
		int X[]= new int[8];
		
		//Declarar un vector Y(3) de tipo char y asignar a la posición 2 el valor de A
		
		char Y[]= new char[3];
		Y[2]='A';
		
		//Declarar un vector A(5) asignar a la posición 0 el valor 25, posición 3 el 
		//valor 49 y a la posición 2 el valor de la posición 0
		
		int A[]= new int[5];
		A[0]=25;
		A[3]=49;
		A[2]=A[0];
		
		//Declarar un vector B(10), a la posición B[0] asignele el valor del vecto A[3] 
		//del ejercicio anterior
		
		int B[]= new int[10];
		B[0]=A[3];
		
		//Declara un vector Z(12) y asignar a todas sus posiciones valores que inician 
		//desde 1 y son secuenciales
		
		int Z[]= new int[12];
		
		for (int i=0; i<12; i++){
			Z[i]=i+1;
		}
		
		//Declara un vector Y(10) y asignar a todas sus posiciones valores impares que 
		//inician desde 1 y son secuenciales
		
		int C[]= new int[10];
		
		for (int i=1; i<10; i++){
			Z[0]=1;
			Z[i]=i+2;
		}
		
		//Declara un vector H(10) y asignar solo a las posiciones impares letras que 
		//inician desde la A secuencialmente
		
		char H[]= new char[10];
		
		for (char i=1; i<10; i++){
			
			if (i%2==0){
				H[i]=0;
			}else{
			for (char Le='A'; Le<='Z'; Le++){
				H[i]=Le;
			}
					
			}
			
		}
		
		//Declarar un vector F(10) y en base al ejercicio anterior asignar los valores 
		//de la siguiente manera:
		//F[0]=H[3]
		//F[3]=H[2]
		//F[4]=H[6]
		//F[7]=H[0]
		//F[8]=H[1]
		//F[9]=H[9]
		
		char F[]= new char[10];
		
		F[0]=H[3];
		F[3]=H[2];
		F[4]=H[6];
		F[7]=H[0];
		F[8]=H[1];
		F[9]=H[9];
		
		//Declara un vector L(15) y asignar valores en base a los siguiente:
		//L[0]= (promedio de 3,5,7 y 9)
		//L[4]= (la suma de 5, 7, 8 y 15)
		//L[7]= (la multiplicación de 6, 7 y 3)
		//L[10]= (la división de 10/2)
		
		int L[]= new int[15];
		
		L[0]=((3+5+7+9)/4);
		L[4]=(5+7+8+15);
		L[7]=(6*7)*3;
		L[10]=10/2;
		
		//Declarar un vector N(12) y realizar las siguientes asignaciones:
		//N[0]= (promedio de 3,10 y 9)
		//N[4]= (la suma de 7, 8 y 10)
		//N[12]= (la multiplicación de 5, 7 y 3)
		//N[20]= (la suma de 7, -3 y 8)
		//en la última posición el valor de 20/4
		
		int N[]= new int[12];
		
		N[0]= (3+10+9)/3;
		N[4]= (7+8+10);
		N[12]= (5*7)*3;
		N[20]= (7+3+8);
		
		System.out.println("Error; la posicion N[20] no existe");
		
		N[12]=20/4;

	}
}
