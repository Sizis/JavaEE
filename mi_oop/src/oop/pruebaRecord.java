package oop;

//import oop.ProductoRecord; si esta en el mismo package no hace falta

public class pruebaRecord {
	public static void main(String[] args) {
		ProductoRecord p1 = new ProductoRecord();
		var p2 = new ProductoRecord("producto2");
		var p3 = new ProductoRecord(5.12);
		
		System.out.printf("nombre: %s\nprecio: %.3f\n\n", p1.nombre(), p1.precio());
		System.out.printf("nombre: %s\nprecio: %.3f\n\n", p2.nombre(), p2.precio());
		System.out.printf("nombre: %s\nprecio: %.3f\n\n", p3.nombre(), p3.precio());
		
		System.out.printf("precio con 10%% de IVA: %.3f\n", p3.sumarIVA(0.1));
	}
}
