package com.ipartek.formacion.almacen.accesodatos;

import java.math.BigDecimal;
import java.util.TreeMap;

import com.ipartek.formacion.almacen.entidades.Producto;

public class DaoProductoTreeSet implements DaoProducto{
	private final TreeMap<Long, Producto> productos = new TreeMap<Long, Producto>((id1, id2) -> id1.compareTo(id2));

	@Override
	public Iterable<Producto> obtenerTodos() {
		return productos.values();
	}

	@Override
	public Producto obtenerPorId(Long id) {
		return productos.get(id);
	}

	@Override
	public Producto insertar(Producto p) {
		Long lastId = productos.lastKey();
		p.setId(lastId + 1L);
		return modificar(p);
	}

	@Override
	public Producto modificar(Producto p) {
		productos.put(p.getId(), p);
		return p;
	}

	@Override
	public void borrar(Long id) {
		productos.remove(id);
	}

	@Override
	public Iterable<Producto> productosPorPrecio(BigDecimal minimo, BigDecimal maximo) {
		return productos.values().stream()
				.filter(p -> 
						p.getPrecio().compareTo(minimo) >= 0 
						&& 
						p.getPrecio().compareTo(maximo) <= 0)
				.toList();
	}
}
