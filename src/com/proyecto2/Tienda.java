package com.proyecto2;

public class Tienda {

    private Producto[] inventario;
    private int cantidadProductos;

    public Tienda(){
        inventario = new Producto[15];
        cantidadProductos = 0;
    }

    public void imprimiInventario(){
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println(inventario[i].getNombre() + " - $" + inventario[i].getPrecio());
        }
    }

    public void agregarProducto(Producto producto){
        inventario[cantidadProductos] = producto;
        cantidadProductos++;
    }

    public void cantidadDisponible(){
        System.out.println("Productos totales: " + cantidadProductos);
    }
}
