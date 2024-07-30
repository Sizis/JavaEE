package oop;

public record ProductoRecord(String nombre, double precio) {
	public ProductoRecord() {
		this("Default", 0);
	}

	public ProductoRecord(String nombre) {
		this(nombre, 0);
	}

	public ProductoRecord(double precio) {
		this("Default", precio);
	}

	public double sumarIVA(double iva) {
		return this.precio() + (iva * this.precio());
	}
}