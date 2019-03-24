/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacredito;

import Archivo.Archivo;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class RegistroPersona {

    Mapa mapa = new Mapa();
    Scanner sc = new Scanner(System.in);
    static Scanner op = new Scanner(System.in);
    Archivo archivo = new Archivo();
    /**
     *constructor de la clase
     */
    public RegistroPersona() {
        mapa = archivo.obtenerListasActuales();
        
    }

    /**
     *metodo para guardar el registro en el archivo
     */
    public void guardar() {
        archivo.guardarRegistro(mapa);
    }

    /**
     *metodo para agregar una persona al mapa
     */
    public void llenarMapa() {
        Persona persona1 = new Persona(1076669666,"Tatiana", "almansa",  "fgk@gmail.com");
        mapa.getData_credito().put(persona1.getDocumento(), persona1);
        guardar();
    }

    /**
     *menú principal
     */
    public void MenuPersona() {
        int opcion = 0;
        do {
            System.out.println("------------------BIENVENIDO----------------");
            System.out.println("¿QUE DESEAS HACER?: 1. Agregar Persona  2. Reportes 3. Ver Personas Registradas 4. Salir ");
            System.out.print("Digite la Opcion : ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    System.out.print("Ingrese documento(identificacion): ");
                    int identificacion = sc.nextInt();
                    seleccionarPersona(identificacion);
                    break;
                case 3:
                    verPersonas();
                    break;
                  default:
                            break;

            }

        } while (opcion != 4);
    }
 
    /**
     *metodo para agregar persona desde consola
     */
    public void agregarPersona() {
        System.out.print("Digite el numero de documento(identificacion) : ");
        Integer documento = sc.nextInt();
        System.out.print("Digite el nombre : ");
        String nombre = sc.next();
        System.out.print("Digite el apellido : ");
        String apellido = sc.next();
        System.out.print("Digite el correo : ");
        String correo = sc.next();
       
        try {
            Date testDate = null;
            System.out.println("Persona Agregada Correctamente");
        } catch (Exception e) {
            System.out.println("formato invalido");
        }
        Persona persona = new Persona(documento,nombre, apellido,  correo);

        mapa.getData_credito().put(documento, persona);
        guardar();

    }

    /**
     *metodo para seleccionar persona a hacer el reporte tomando como parametro el documento
     * @param documento
     */
    public void seleccionarPersona(int documento) {

        if (mapa.getData_credito().containsKey(documento)) {
            RegistroReputacion record = new RegistroReputacion();
            record.MenuReputacion(documento);
        } else {
            System.out.println("No se encontro Persona");
        }

    }

    /**
     *metodo para visualizar las personas dentro del archivo
     */
    public void verPersonas() {
        for (Integer iterador : mapa.getData_credito().keySet()) {
            System.out.println("Numero de Documento :" + mapa.getData_credito().get(iterador).getDocumento());
            System.out.println("Nombre :" + mapa.getData_credito().get(iterador).getNombre());
            System.out.println("Apellido:" + mapa.getData_credito().get(iterador).getApellido());
            System.out.println("Corre:" + mapa.getData_credito().get(iterador).getCorreo());
           

        }
    }

    /**
     *
     * @param campo
     * @return
     */
    public boolean validacionString(String campo) {

        boolean valida = true;

        for (int i = 0; i < campo.length(); i++) {
            char caracter = campo.charAt(i);
            if (caracter >= 65 || caracter <= 90 || caracter >= 97 || caracter <= 122 || caracter == 32) {
                valida = true;
            } else {
                valida = false;
            }
        }
        return valida;
    }
}
