package com.example.crudbook.modelos;

public class Libro {
    // Atributos de la clase libro

    private int id;
    private String titulo, subtitulo, isbn, autor;
    private int anioPublicacion;
    private double precio;

    // constructor con argumentos 
    public Libro(int id, String titulo, String subtitulo, String isbn, String autor,
                 int anioPublicacion, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }
}
