package com.una.examen.model;

//import javax.xml.bind.annotation.adapters.XmlAdapter;

public class IntegerAdapter  {

    public static boolean isNumeric(String cadena){

        boolean resultado;

        try{
            Integer.parseInt(cadena);
            resultado = true;
        }catch(NumberFormatException exception){
            resultado = false;
        }
        return resultado;
    }
    
}
