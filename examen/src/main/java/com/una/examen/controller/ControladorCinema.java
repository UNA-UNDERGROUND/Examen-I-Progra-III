package com.una.examen.controller;

import java.util.List;
import java.util.ArrayList;
import com.una.examen.model.*;

public class ControladorCinema {

    private Cinema cinema;
    private static ControladorCinema instancia = null;

    ControladorCinema(){
        cargar();
    }
    public void cargar(){
        cinema = new Cinema();
    }

    public static ControladorCinema getInstancia(){
        if(instancia == null){
            instancia = new ControladorCinema();
        }
        return instancia;
    }

    public Actor recuperarActor(Integer id){
        for(Actor actual : cinema.getActores()){
            if(actual.getId() == id){

                return actual;
            }
        }
        return null;
    }

    public boolean agregarActor(Actor actor){
        if(recuperarActor(actor.getId()) != null){
            cinema.getActores().add(actor);
            return true;
        }
        return false;
    }

    public boolean actualizarActor(Actor actor){
        Actor aux = recuperarActor(actor.getId());
        if(aux != null){
            aux.setName(actor.getName());
            aux.setPremios(actor.getPremios());
            return true;
        }
        return false;
    }

    public List<Actor> buscarActores(Actor actor){

        List<Actor> res = new ArrayList<>();

        for(Actor actual : cinema.getActores()){
            if(actual.getId().toString().startsWith(actor.getId().toString())){

                res.add(actual);
            }

        }
        return res;
    }
    
    
}
