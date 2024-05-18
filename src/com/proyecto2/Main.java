package com.proyecto2;

public class Main {
    public static void main(String[] args) {

        Accesorios manilla = new Accesorios("Manilla", 30, 60, "Esclava");
        Accesorios reloj = new Accesorios("Reloj", 80, 30, "Rolex");
        Prenda camiseta = new Prenda("Camiseta de Futbol retro", 120, 20, "Futbol");
        Prenda camisa = new Prenda("Camisa", 30, 15, "Elegante");

        Tienda tienda = new Tienda();
        tienda.agregarProducto(manilla);
        tienda.agregarProducto(reloj);
        tienda.agregarProducto(camiseta);
        tienda.agregarProducto(camisa);

        tienda.imprimiInventario();

        tienda.cantidadDisponible();

    }
}