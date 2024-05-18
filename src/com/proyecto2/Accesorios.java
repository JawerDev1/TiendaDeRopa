package com.proyecto2;

public class Accesorios extends Producto {

    private String tipo;

    public Accesorios(String nombre, double precio, int cantidad, String tipo){
        super(nombre, precio, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}