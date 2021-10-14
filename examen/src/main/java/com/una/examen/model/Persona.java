package com.una.examen.model;

public class Persona{
    Persona(){
        id = -1;
        name = " ";
        premios = 0;
    }

    public Persona(Integer _id, String _name, Integer _premios){
        this.id = _id;
        this.name = _name;
        this.premios = _premios;

    }

    
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPremios() {
        return premios;
    }

    public void setPremios(Integer premios) {
        this.premios = premios;
    }
    final Integer id;
    String name;
    Integer premios;
}
