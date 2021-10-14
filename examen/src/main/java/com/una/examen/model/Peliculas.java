package com.una.examen.model;

public class Peliculas {
    Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Float getDuracion() {
        return duracion;
    }
    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }
    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    private String nombre;
    private Float duracion;
    private Actor actor;
    private Director director;   
}
