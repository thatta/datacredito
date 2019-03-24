/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacredito;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class Persona implements Serializable {
    private Integer documento;
    private String nombre;
    private String apellido;
    private String correo;
    

    private HashMap<Integer, Reputacion> mapaPersonas;

    /**
     *Constructor de la clase
     * @param documento
     * @param nombre
     * @param apellido
     * @param correo
     */
    public Persona( Integer documento,String nombre, String apellido, String correo) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        
        this.correo = correo;
    

        mapaPersonas = new HashMap<>();
    }
    /**
     *
     * @return
     */
    public Integer getDocumento() {
        return documento;
    }

    /**
     *
     * @param documento
     */
    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
   
    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    public HashMap<Integer, Reputacion> getMapaPersonas() {
        return mapaPersonas;
    }

    /**
     *
     * @param mapaPersonas
     */
    public void setMapaPersonas(HashMap<Integer, Reputacion> mapaPersonas) {
        this.mapaPersonas = mapaPersonas;
    }

    
    
}
