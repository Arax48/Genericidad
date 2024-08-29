/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasegenerica.Model;

import java.time.LocalDate;


class Persona {
    
    private String nombre;
    private int edad;
    private String eps;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, int edad, String eps, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.eps = eps;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Integer getEdad(){
        return edad;
    }
    
    public String getEps(){
        return eps;
    }
    
    public LocalDate getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    
    
    
    
    
}
