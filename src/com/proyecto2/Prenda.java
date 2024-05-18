package com.proyecto2;

public class Prenda extends Producto {

    private String prenda;

    public Prenda(String nombre, double precio, int cantidad, String prenda){
        super(nombre, precio, cantidad);
        this.prenda = prenda;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }
}