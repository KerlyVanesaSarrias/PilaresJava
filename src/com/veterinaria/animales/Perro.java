package com.veterinaria.animales;

import java.util.ArrayList;
import java.util.List;

public class Perro {
    //definir atributos
    public  String nombre;
    private int edad;
    private String raza;
    private int peso;
    private String historialMedico;
    private List<String> perros;

    public Perro() {
        this.perros = new ArrayList<>();
    }

    public Perro(String nombre, int edad, int peso, String raza, String historialMedico) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.historialMedico = historialMedico;
        this.perros = new ArrayList<>();
    }

    //crear getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public List<String> getPerros() {
        return perros;
    }
    public void setPerros(List<String> perros) {
        this.perros = perros;
    }

    //Metodos


    public void addPerro(String nombre, int edad, int peso,  String raza, String historialMedico) {
        perros.add("nombre: " +  nombre + " , " + " edad: " + edad + " , " + " peso: " + peso + " , " + " raza: " + raza + " , " + "historial: " + historialMedico);
        System.out.println("Perro agregado exitosamente");
    }
    public  void mostrarRegistro () {
        System.out.println("FICHA DE REGISTRO");
        for (String perro : perros) {
            System.out.println("-" + perro);
        }
    }


}
