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
public class Mapa implements Serializable{
    
    private HashMap<Integer, Persona> data_credito = new HashMap<>();

    /**
     *
     * @return
     */
    public HashMap<Integer, Persona> getData_credito() {
        return data_credito;
    }

    /**
     *
     * @param data_credito
     */
    public void setData_credito(HashMap<Integer, Persona> data_credito) {
        this.data_credito = data_credito;
    }
    
    
    
}
