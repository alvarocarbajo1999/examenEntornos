package com.mycompany.examenalvarocarbajo;

public interface doc {

    /**
     * Devuelve el contenido del archivo tras insertar la linea line en la linea numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
     * 
     * @author Alvaro
     * @version 2
     * 
     * @param x entero que representa el número de la linea.
     * @param line String que representa la linea que se desea insertar.
     * @param file Archivo en el que se insertará esa linea.
     * @return String que es el contenido del archivo.
     * 
     * @pre x >= 0 
     * @pos el contenido que habia en la linea x (si lo hubiese) pasa a la linea x]1
     */
    public abstract String escribirLinea(int x, String line, String file);

}
