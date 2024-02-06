/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenciaTurismo.ClasesHerencia_Asociacion;

import AgenciaTurismo.modelos.ClienteDAO;

/**
 *
 * @author ALEJANDRA
 */
public class Persona {
    private String nombre;
    private String apellido;

    public Persona(){};
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() > 2) {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && apellido.length() > 2) {
            this.apellido = apellido;
        }
    }

    @Override
    public String toString() {
         return "\nDatos del cliente " + "\nNombre: " + nombre+ " "+apellido+" " ;
    }
       public String Mostrar() {
         return "\nDatos del cliente " + "\nNombre: " + nombre + "\nApellido: " + apellido ;
    }
    public String toFile() {
         return nombre + ";"  +apellido ;
    }    
    
}
