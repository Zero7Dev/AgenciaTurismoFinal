//ALEJANDRA RUEDA ENCALADA
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenciaTurismo.modelos;

import AgenciaTurismo.ClasesHerencia_Asociacion.Persona;

/**
 *
 * @author ALEJANDRA
 */
public class ClienteDTO extends Persona {

    private String cedula;
    private int edad;
    private String telefono;
    private String correo;
    private String discapacidad;

    public ClienteDTO() {
    }

    ;
    public ClienteDTO(String cedula, int edad, String telefono, String correo, String discapacidad) {
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.discapacidad = discapacidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula != null && cedula.length() > 9) {
            this.cedula = cedula;
        } else {
            throw new IllegalArgumentException("La cedula que usted ingreso no existe");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("Edad invalida para el registro.Debe ser mayor de edad (18+ años).");
        } else {

            this.edad = edad;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.length() > 9) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El telefono que usted ingreso no existe");
        }

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {

        if (correo != null && correo.length() > 5) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("Correo invalido");
        }
    }

    public String isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    //calculo
    //
    //
    public String toArchivo() {
        return cedula + ";" + edad + ";" + telefono
                + ";" + correo + ";" + discapacidad + ";" + super.toFile();
    }

    public String Mostrar() {
        return super.Mostrar() + "\nCedula: " + cedula + "\nEdad: " + edad + "\nTelefono: " + telefono + "\nCorreo: " + correo + "\nDiscapacidad: " + discapacidad;

    }

    @Override
    public String toString() {
        return super.toString() + "\n Cedula: " + cedula + "\n Correo: " + correo;
    }

}
