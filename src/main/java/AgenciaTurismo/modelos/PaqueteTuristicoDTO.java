//autor: COLOMA VERA JULIO 
package AgenciaTurismo.modelos;

import AgenciaTurismo.ClasesHerencia_Asociacion.ActividadPaqueteTuristico;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PaqueteTuristicoDTO {

    private String nombre;
    private int id;
    private String destino;
    private String duracion;
    private int precio;
    private boolean comidaIncluida;
    private String TipoViaje;
    public ActividadPaqueteTuristico actividad;

    public PaqueteTuristicoDTO(String nombre, String destino) {
        this.nombre = nombre;
        this.destino = destino;
    }

    public PaqueteTuristicoDTO() {
    }

    ;

     public void setId(int id) {
        if (id <= 0 || id > 1000) {
            throw new IllegalArgumentException("ID invalido.Debe ser mayor que 0 y menor o igual a 1000.");
        }
        this.id = id;
    }

    public void setPrecio(int precio) {
        if (precio <= 0 || precio > 10000) {
            throw new IllegalArgumentException("Precio invalido. Debe ser mayor que 0 y menor o igual a 10000.");
        }
        this.precio = precio;
    }

    private boolean validarDuracion(String duracion) {
        return duracion != null && (duracion.equals("7 dias") || duracion.equals("15 dias") || duracion.equals("30 dias"));
    }

    public void setName(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
            PaqueteTuristicoDAO.nombresExistentes.add(nombre);
        } else {

            throw new IllegalArgumentException("Nombre invalido no puede ser nulo");
        }
    }
    public void setDuracion(String duracion) {
        if (!validarDuracion(duracion)) {
            throw new IllegalArgumentException("Duracion inválida.");
        }
        this.duracion = duracion;
    }

    public ActividadPaqueteTuristico getActividades() {
        return actividad;
    }

    public void setActividad(ActividadPaqueteTuristico actividad) {
        this.actividad = actividad;
    }

    public String getTipoViaje() {
        return TipoViaje;
    }

    public void setTipoViaje(String TipoViaje) {
        this.TipoViaje = TipoViaje;
    }

    public String getNombrePaquete() {
        return nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public String getDestino() {
        return destino;
    }


    public void setNombre(String nombre) {
        try {
            ValidadorNombres(nombre);
        } catch (IllegalArgumentException E) {
            System.err.println("El NOMBRE NO SE PUEDE REPETIR: " + E.getMessage());
            return;
        }
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
            PaqueteTuristicoDAO.nombresExistentes.add(nombre);
        } else {

            throw new IllegalArgumentException("Nombre invalido no puede ser nulo");
        }
    }

    public void setDestino(String destino) {
        if (destino != null && !destino.trim().isEmpty()) {
            this.destino = destino;
        }
    }

    public boolean isComidaIncluida() {
        return comidaIncluida;
    }

    public void setComidaIncluida(boolean comidaIncluida) {
        if (comidaIncluida || !comidaIncluida) {
            this.comidaIncluida = comidaIncluida;
        }
    }
    private int precioFinal = 0;

    public int calcularPrecio() {
        int precioFinal = (int) getPrecio();
        if (comidaIncluida) {
            precioFinal += 50;
        }
        if (TipoViaje == " Intraprovincial") {
            precioFinal += 10;
        }
        if (TipoViaje == "Interprovincial") {
            precioFinal += 25;
        }

        switch (duracion) {
            case "7 dias":
                precioFinal += 50;
                break;
            case "15 dias":
                precioFinal += 100;

                break;
            case "30 dias":
                precioFinal += 150;

                break;
            default:
                throw new AssertionError();

        }
        return precioFinal;
    }

    public int getPrecioFinal() {
        return calcularPrecio();
    }

    public void setPrecioFinal(int precioFinal) {
        precioFinal = precioFinal;
    }

    public String MostrarDatos() {
        return "ID unico del Paquete Turistico: " + getId() + "\nNombre del Paquete Turistico: " + nombre
                + " \nDuración del viaje: " + duracion + "\nTipo de viaje: " + getTipoViaje()
                + " \nComida Incluida en el paquete : " + (comidaIncluida ? "Sí" : "No") + "\nPrecio base:" + precio + "\nDescripcion actividad: \n" + "Nombre de la actividad: "
                + "\n" + this.actividad.getNombre() + "\n" + "Precio final del viaje:" + calcularPrecio();

    }

    @Override
    public String toString() {
        return "ID unico del Paquete Turistico:" + getId() + "  Nombre del Paquete Turistico:" + nombre
                + "  Precio final del viaje:" + calcularPrecio();

    }

    public String toStringToFile() {
        return id + ";" + destino + ";" + duracion + ";" + precio + ";" + comidaIncluida + ";" + TipoViaje + ";" + getPrecioFinal() + ";"
                + actividad.getNombre() + ";" + actividad.getDescripcion() + ";" + nombre;
    }

    public void ValidadorNombres(String nombreInput) {
        String mensaje = "VALIDACION DEL NOMBRE DEL PAQUETE APROVADA";
        for (String nombrePa : PaqueteTuristicoDAO.nombresExistentes) {
            if (nombrePa.equalsIgnoreCase(nombreInput)) {
                mensaje = "VALIDACION DEL NOMBRE DEL PAQUETE REPROVADA";
                System.out.println(mensaje);
                throw new IllegalArgumentException(" Fallo detectado por el validador dentro del DTO");
            } else {
                System.out.println(mensaje);
            }
        }
    }
}
