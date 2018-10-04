package com.algoritmos;

public class Condicionales {
	public boolean acreditar (int asistencia, int calificacion) {
		final int totalAsist = 70;
		boolean paso = false;
		
		if(asistencia>=(totalAsist*.8)&&calificacion>=60)
			paso=true;
		return paso;
	}
	
	public double salario (double horas, double precio) {
		double sueldo = 0;
		if (horas<=40) {
			sueldo = horas*precio;
		}else {
			sueldo = (40*precio)+((horas-40)*(precio*1.5));
			}
		return sueldo;
	}
	
	public int cantidad (int n1, int n2) {
		int t1 = 0;
		int t2 = 0;
		
		if (n1<=9) {
			t1 = 1;
		}else {
			if(n1<=99) {
				t1 = 2;
			}else {
				if(n1<=999) {
					t1 = 3;
				}else {
					if(n1<=9999) {
						t1 = 4;
					}else {
						t1 = 5;
					}
				}
			}
		}
		if (n2<=9) {
			t2 = 1;
		}else {
			if(n2<=99) {
				t2 = 2;
			}else {
				if(n2<=999) {
					t2 = 3;
				}else {
					if(n2<=9999) {
						t2 = 4;
					}else {
						t2 = 5;
					}
				}
			}
		}
		return t1+t2;
	}
	
/*public String hora(int h, int m, int s, int incre) {
		int segundos = 0, minutos = 0, horas = 0;
		
		s = s+incre;
		if(incre>=60) {
			segundos = s/60;
			s+=(s%60);
		}
		m = m 
		
		return "";
	}*/
	
	public String adivinar(int n1) {
		return "";
	}

}
