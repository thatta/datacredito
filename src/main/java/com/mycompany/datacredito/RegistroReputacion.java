/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacredito;

import Archivo.Archivo;
import java.util.Scanner;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class RegistroReputacion {

    Scanner scan = new Scanner(System.in);
    Mapa mapa = new Mapa();
    Archivo archivo = new Archivo();

    /**
     *constructor de la clase
     */
    public RegistroReputacion() {

        mapa = archivo.obtenerListasActuales();

    }

    /**
     *metodo para guardar la reputacion del cliente en el mapa
     */
    public void guardar() {
        archivo.guardarRegistro(mapa);
    }

    /**
     *menú principál
     * @param documento
     */
    public void MenuReputacion(int documento) {
        int opcion = 0;
       
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("¿QUE DESEAS HACER?:  1.Agregar Record 2.Eliminar Record 3.Ver Record  4.Salir "); 
            System.out.print("Digite la Opcion : ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    AgregarReputacion(documento);
                    break;
                case 2:
                     int codigo = scan.nextInt();
                    eliminarReputacion(documento, codigo);
                    
                    break;
                case 3:
                    verReputacion(documento);
                    break;
                case 4:
                    RegistroPersona persona = new RegistroPersona();
                    persona.MenuPersona();
                    break;
                default:
                    System.out.print("Opcion no valida");
                    break;
            }

        } while (opcion != 5);
    }

    /**
     *agrega el reporte tomando como parametro el documento del cliente
     * @param documento
     */
    public void AgregarReputacion(int documento) {

        System.out.print("Ingrese el codigo: ");
        int cod = scan.nextInt();

        System.out.print("Ingrese Nombre empresa: ");
        String nombre = scan.next();

        System.out.print("Ingrese el estado: ");
        boolean estado = scan.nextBoolean();

        System.out.print("Ingrese la descripcion: ");
        String descripcion = scan.next();

        System.out.print("Ingrese el valor: ");
        double valor = scan.nextDouble();

        Reputacion nuevoReputacion = new Reputacion(cod, nombre, estado, descripcion, valor);

        mapa.getData_credito().get(documento).getMapaPersonas().put(cod, nuevoReputacion);
        guardar();

    }

    /**
     *metodo para eliminar el reporte negativo del cliente
     * @param documento
     * @param cod
     */
    public void eliminarReputacion(int documento, int cod) {
        System.out.print("Ingrese codigo : ");
        if (mapa.getData_credito().get(documento).getMapaPersonas().containsKey(cod)) {
            mapa.getData_credito().get(documento).getMapaPersonas().remove(cod);
            System.out.println("Record eliminado");
            guardar();
        } else {
            System.out.println("No se encontro el Record");
        }

    }

    /**
     *metodo que muestra la reputacion del cliente
     * @param documento
     */
    public void verReputacion(int documento) {

        for (Integer iterador : mapa.getData_credito().get(documento).getMapaPersonas().keySet()) {
            Reputacion record = mapa.getData_credito().get(documento).getMapaPersonas().get(iterador);
            if (record.getEmpresa().isEmpty() || record.getDescripcion().isEmpty()) {
                System.out.println("No hay records");
            }else{
                System.out.println("Codigo : " + record.getCodigo());
                System.out.println("Nombre Empresa : " + record.getEmpresa());
                System.out.println("Estado : " + record.isEstado());
                System.out.println("Descripcion : " + record.getDescripcion());
                System.out.println("Valor : " + record.getValor());
            }
        }
    }
}

