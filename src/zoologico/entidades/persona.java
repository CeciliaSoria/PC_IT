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
public abstract class persona {
   private String nombre;
   private Date fechaDeNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
       
    public persona (String nombre, Date fechaDeNacimiento) {
     //Super()
     this.nombre=nombre;
     this.fechaDeNacimiento=fechaDeNacimiento;
     
    
    
    
    }
}
