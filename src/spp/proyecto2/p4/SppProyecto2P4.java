/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.proyecto2.p4;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SppProyecto2P4 {

//Mariela Ramones Balvoa
//Catalina Guadalupe Domínguez Garza
//Kevin Gerardo Hinojosa Castellanos
//Alejandro García Monroy
//Lisdy Rohmann
static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[][] matriz = new int[4][4];
		int suma = 0, mayor = 0, menor = 0, suma_diagonal = 0, suma_arriba_diagonal = 0, suma_debajo_diagonal = 0;
		boolean primer_valor = true;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				System.out.println("Numero en posicion [" + (i+1) + "] [" + (j+1) + "]:");
				matriz[i][j] = entrada.nextInt();
				
				if (matriz[i][j]<1) {
					j--;
					System.out.println("Debe ser un valor entero");
				} else {
					
					suma+=matriz[i][j];
					
					if (i==j)
						suma_diagonal+=matriz[i][j];
					
					if (i<j)
						suma_arriba_diagonal+=matriz[i][j];
					
					if (i>j)
						suma_debajo_diagonal+=matriz[i][j];
					
					if (matriz[i][j]>mayor)
						mayor = matriz[i][j];
					
					if (primer_valor)
						menor = matriz[i][j];
					else
						if (matriz[i][j]<menor)
							menor = matriz[i][j];
					
					primer_valor = false;
				}
				
			}
		}
		
		System.out.println("Promedio: " + (suma/16));
		System.out.println("Valor minimo: " + menor);
		System.out.println("Valor maximo: " + mayor);
		System.out.println("Suma de la diagonal descendente: " + suma_diagonal);
		System.out.println("Suma valores por debajo de la diagonal: " + suma_debajo_diagonal);
		System.out.println("Suma valores por encima de la diagonal: " + suma_arriba_diagonal);
	}

}
