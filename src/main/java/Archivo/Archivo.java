/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import com.mycompany.datacredito.Mapa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class Archivo {
   
    /**
     *mapa para ubicar los datos
     */
    public Mapa mapaDatos;
    private static final String ruta = "Archivo.txt";
    
    /**
     *Validar existencia archivo desde el constructor
     */
    public Archivo() {
       validarArchivo();
    }
    
    
    private void validarArchivo(){
     try {
            
            File file = new File(ruta);
           
            if (!file.exists()) {
                file.createNewFile();
                mapaDatos=new Mapa();
                guardarRegistro(mapaDatos);
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    
    }
 
    /**
     *obtiene lo que está dentro del archivo
     * @return
     */
    public Mapa obtenerListasActuales() {
        mapaDatos=new Mapa();
       
        try {
            ObjectInputStream entrada =  new ObjectInputStream(new FileInputStream(ruta));
            mapaDatos = (Mapa) entrada.readObject();
  
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } 
        
        return mapaDatos;
    }

    /**
     *Guarda registro en la linea indicada
     * @param listaDatos
     */
    public void guardarRegistro(Mapa listaDatos) {
           
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
            salida.writeObject(listaDatos);
            salida.close();
        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}
       
    
