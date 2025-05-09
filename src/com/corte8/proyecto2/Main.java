package com.corte8.proyecto2;

import com.corte8.proyecto1.Saludador;

public class Main {
    public static void main(String[] args) {
        Saludador saludar = new Saludador();
        saludar.saludar();

        System.out.println();

        saludar.mostrarMensaje();
    }
}
