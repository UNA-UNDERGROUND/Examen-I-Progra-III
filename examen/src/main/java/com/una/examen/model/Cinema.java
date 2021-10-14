package com.una.examen.model;

import java.util.List;
import java.util.ArrayList;

public class Cinema {
    List<Actor> actores;
    List<Director> directores;
    List<Peliculas> peliculas;
    
    public Cinema() {
        this.actores = new ArrayList<Actor>();
        this.directores = new ArrayList<>();
        this.peliculas = new ArrayList<>();
    }
    public List<Actor> getActores() {
        return actores;
    }
    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }
    public List<Director> getDirectores() {
        return directores;
    }
    public void setDirectores(ArrayList<Director> directores) {
        this.directores = directores;
    }
    public List<Peliculas> getPeliculas() {
        return peliculas;
    }
    public void setPeliculas(List<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }

    

    
}
