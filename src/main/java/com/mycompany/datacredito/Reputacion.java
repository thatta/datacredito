/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datacredito;

import java.io.Serializable;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class Reputacion implements Serializable{
    
    private int codigo;
    private String empresa;
    private boolean estado;
    private String descripcion;
    private double valor;

    /**
     *constructor de la clase
     * @param codigo
     * @param nombre
     * @param estado
     * @param descripcion
     * @param valor
     */
    public Reputacion(int codigo, String nombre, boolean estado, String descripcion, double valor) {
        this.codigo = codigo;
        this.empresa = nombre;
        this.estado = estado;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     *
     * @param empresa
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     *
     * @return
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     */
    public double getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
