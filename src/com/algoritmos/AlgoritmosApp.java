package com.algoritmos;

import java.util.Random;
import java.util.Scanner;

public class AlgoritmosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		//variables del primer proceso.
		int base = 0;
		int exp = 0;
		//variables del segundo proceso.
		int calificacion =0;
		int asistencia = 0;
		//variables del tercer proceso.
		double horas = 0;
		double precio = 0;
		//variables del cuarto proceso.
		int n1 = 0;
		int n2 = 0;
		//variables del quinto proceso.
		int numero = 0;
		//variables del sexto proceso.
		String respuesta = "";
		
		//instancia Ciclos 
		Ciclos c = new Ciclos();
		
		//instancia Condicionales
		Condicionales condicion = new Condicionales();
		/*
		//Pedir base y exponente, calcular resultado.
		System.out.println("Dame la base");
		base = sc.nextInt();
		System.out.println("Dame la altura");
		exp= sc.nextInt();
		System.out.println("El resultado es: "+c.potencia(base, exp));
		
		//Decir si un alumno paso o no paso de acuerdo a su calificacion y asistencia.
		System.out.println("Cual es tu calificacion");
		calificacion = sc.nextInt();
		System.out.println("Cuantas aisstencias tienes");
		asistencia = sc.nextInt();
		System.out.println("Pasaste: "+condicion.acreditar(asistencia, calificacion));
		
		//Sacar el sueldo de un trabajador, a partir de la hora 41 se paga a 1.5
		System.out.println("Ingresa el numero de horas laboradas");
		horas = sc.nextInt();
		System.out.println("Ingresa el precio normal por hora");
		precio = sc.nextInt();
		System.out.println("Pasaste: "+condicion.salario(horas, precio));
		
		//Ingresar dos numeros y decir cuantos digitos suman entre ambos.
		System.out.println("Ingresa el primer numero");
		n1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero");
		n2 = sc.nextInt();
		System.out.println("La suma de la cantidad de digitos de ambos numeros ingresados es: "+condicion.cantidad(n1, n2));
		
		//Igresar un numero de cuatro cifras e invertirlo.
		System.out.println("Ingresa un numero de cuatro cifras");
		numero = sc.nextInt();
		System.out.println("El numero "+numero+" invertido es: "+c.invertir(numero));
		
		//Adivinar numero
		Random rnd = new Random(System.nanoTime());
		n1 = rnd.nextInt(100);
		do {
			System.out.println("Adivina el numero");
			n2 =sc.nextInt();
			respuesta = c.adivinar(n1, n2);
			System.out.println(respuesta);
		}while(!respuesta.equals("Lo adivinaste!"));	
		*/
		
		
		
		
	}

}
