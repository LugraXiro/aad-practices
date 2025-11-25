package es.lugra;

public class JSON_e1 {
    Libro()
}

class Libro(){
    String titulo;
    String autor;
    int año;
    List[] generos;
    Boolean disponible;

    Libro(String titulo, String autor, int año, List[] generos, Boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.generos = generos;
        this.disponible = disponible;
    }
}

