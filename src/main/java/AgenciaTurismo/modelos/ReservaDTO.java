package AgenciaTurismo.modelos;

import java.util.ArrayList;

public class ReservaDTO {

    private String idReserva;
    private String cedula;
    private String correo;
    private String pasajero;
    private int dia;
    private int mes;
    private int año;
    private String equipaje;
    public PaqueteTuristicoDTO paqueteTuristico;
    private ClienteDTO cliente;

    /**
     *
     * @author CESAR
     */

    public ReservaDTO() {
    }

    public PaqueteTuristicoDTO getPaqueteTuristico() {
        return paqueteTuristico;
    }

    public void setPaqueteTuristico(PaqueteTuristicoDTO paqueteTuristico) {
        this.paqueteTuristico = paqueteTuristico;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public ReservaDTO(int dia, int mes, int año, String correo) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.correo = correo;

    }

    public String getIdReserva() {
        return idReserva;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPasajero() {
        return pasajero;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public String getEquipaje() {
        return equipaje;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public void setCedula(String cedula) {
        if (cedula.length() > 10) {
            throw new IllegalArgumentException("la cedula tiene mas de 10 de longitud");
        }
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public void setDia(int dia) {
        if (dia > 31) {
            throw new IllegalArgumentException("El set de dia dio el fallo");
        }
        System.out.println("Nose ejecuta");
        this.dia = dia;
    }

    public void setMes(int mes) {
        if (mes < 12 || mes > 1) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException(" mes inválida.");

        }
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setEquipaje(String equipaje) {
        this.equipaje = equipaje;
    }

    @Override
    public String toString() {
        return "Reserva: " + "\nIdReserva: " + idReserva + "\nCedula cliente: " + cliente.getCedula() + "\nNombre del Paquete Turistico: " + this.paqueteTuristico.getNombrePaquete()
                + "\nEl lugar de viaje sera : "+ this.paqueteTuristico.getDestino() + "\nCorreo: " + cliente.getCorreo() + "\nPasajero: " + pasajero + "\nDia: " + dia + 
                "\nEquipaje: " + equipaje;
    }

    public String toArchivo() {
        return idReserva + "-" + pasajero + "-" + dia + "-" + equipaje + "-" + cliente.getCedula() + "-" + paqueteTuristico.getNombrePaquete();
    }

}
