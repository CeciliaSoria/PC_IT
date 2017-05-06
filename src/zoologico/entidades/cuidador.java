/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.entidades;

import java.util.Date;

/**
 *
 * @author CeciliaSoria
 */
public class cuidador extends persona {
     private int cantidadDeRaciones;

    public cuidador(String nombre, Date fechaDeNacimiento, int cantidadDeRaciones) {
        super(nombre, fechaDeNacimiento);
        this.cantidadDeRaciones=cantidadDeRaciones;
        
    }
    public void alimentarAnimales (){
        if((zoologico.CANTIDAD_ANIMALES*zoologico.RACIONES_POR_ANIMAL<=cantidadDeRaciones)){
        System.out.println ("ok");
        
        
    } else {
    System.out.println("no ok");
    
}
   
       
    }
}

    
    
    

