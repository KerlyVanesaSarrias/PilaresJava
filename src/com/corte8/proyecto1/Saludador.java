package com.corte8.proyecto1;

public class Saludador {
    // Mensajes con diferentes modificadores de acceso

    public String mensajePublico = "Mesaje publico";

    protected String mensajeProtejido = "Mesaje protejido";

    String mensajePaquete = "Mesaje privado por desault";

    private String mensajeprivado = "Mensaje privado";

    // se crea un constructoe vacio

    public Saludador() {}
    public Saludador(String mensajePublico, String mensajeProtejido, String mensajeprivado) {
        this.mensajePublico = mensajePublico;
        this.mensajeProtejido = mensajeProtejido;
        this.mensajeprivado = mensajeprivado;
    }

    //Getter y setter


    // metodos
    public void saludar() {
        System.out.println("Hola Mundo");
    }

    public void mostrarMensaje() {
        System.out.println(mensajePublico);
        System.out.println(mensajeProtejido);
        System.out.println(mensajeprivado);

    }
}
