package com.algoritmos;

public class Ciclos {
	public int potencia(int base, int exponente) {
		int res = 1;
		for (int i=0; i<exponente; i++)
			res*= base;
		
		return res;
	}
	
	public String invertir(int num) {
		int c0 = 0, c1 = 0, c2 = 0;
		String cadena = "";
		while(num>=1000) {
			num = num -1000;
			c0 = c0+1;
		}
		while (num>=100) {
			num = num-100;
			c1 = c1+1;			
		}
		while (num>=10) {
			num=num-10;
			c2=c2+1;
		}	
		cadena = Integer.toString(num)+Integer.toString(c2)+Integer.toString(c1)+Integer.toString(c0);
		return cadena;
	}	
	//este aun no queda, es el de adivina numero.
	public String adivinar(int n1, int n2) {
		String respuesta = "";
		return respuesta;
	}
}
