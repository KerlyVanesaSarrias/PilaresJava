package com.veterinaria.recepcion;

import com.veterinaria.animales.Perro;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ContinuarRegistro;
        Perro perro = new Perro();
        do {
            System.out.println("Ingrese el nombre de su perro: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la edad de su perro: ");
            int edad = sc.nextInt();
            System.out.println("Ingrese el peso de su perro: ");
            int peso = sc.nextInt();
            System.out.println("Ingrese la raza de su perro: ");
            String raza = sc.nextLine();
            sc.nextLine();
            System.out.println("Ingrese el historial de su perro: ");
            String historial = sc.nextLine();
            sc.nextLine();
            perro.setNombre(nombre);
            perro.setEdad(edad);
            perro.setPeso(peso);
            perro.setRaza(raza);
            perro.setHistorialMedico(historial);
            perro.addPerro(perro.getNombre(), perro.getEdad(), perro.getPeso(), perro.getRaza(), perro.getHistorialMedico());

            System.out.println("¿ Desea registrar otro perro  si/no? ");
             ContinuarRegistro = sc.nextLine();

        } while (ContinuarRegistro.equals("si"));

        perro.addPerro(perro.nombre, perro.getEdad(), perro.getPeso(), perro.getRaza(), perro.getHistorialMedico());
        perro.mostrarRegistro();

    }
}
