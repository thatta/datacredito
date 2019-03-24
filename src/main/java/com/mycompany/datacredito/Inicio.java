/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacredito;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RegistroPersona menu = new RegistroPersona();
        menu.llenarMapa();
        menu.MenuPersona();
    }
    
}
