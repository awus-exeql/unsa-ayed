package taller03;

import taller01.Punto;

public class TestFiguras {

	public static void main(String[] args) {
		Punto p = new Punto();
		
		Circulo c = new Circulo(new Punto(), 1);
		Cuadrado cuadrado = new Cuadrado(new Punto(), 1);
		Rectangulo r = new Rectangulo(new Punto(), 2, 3);
		/*
		Figura[] figuritas = new Figura[4];
		figuritas[0] = r;
		figuritas[1] = c;
		figuritas[2] = cuadrado;
		figuritas[3] = r;
		
		for(int k = 0; k<figuritas.length; k++){
			System.out.println(figuritas[k].getArea());
			System.out.println(figuritas[k].getAreaPorK(10));
			System.out.println(figuritas[k].mostrar());
			System.out.println();
		}
		*/
		
		IMovible[] coleccion = new IMovible[3]; 
		coleccion[0] = p;
		coleccion[1] = r;
		coleccion[2] = cuadrado;
		for(int k=0;k<coleccion.length;k++){
			coleccion[k].moverDerecha();
			if(coleccion[k] instanceof Figura){
				System.out.println(((Figura)coleccion[k]).mostrar());
			}else{
				if(coleccion[k] instanceof Punto) {
					System.out.println(((Punto)coleccion[k]).mostrar());
				}
			}
		}

	}

}
