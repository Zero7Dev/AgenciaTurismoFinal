/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenciaTurismo.modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author CESAR
 */
public class ReservaDAO {
    public static final String RUTAARCHIVO = "src/main/java/archivos/reserva.txt";
    helpers utilidades = new helpers();
    public ArrayList<ReservaDTO> leer() {
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<ReservaDTO> lista = null;
        try {
            file = new File(RUTAARCHIVO);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            lista = new ArrayList<>();
            // 2. leer 
            while (br.ready()) {
//                reservaId-3-5-Sí-0000000000-SIERRA2
                PaqueteTuristicoDAO paqueteDAO=new PaqueteTuristicoDAO();
                ClienteDAO clienteDAO=new ClienteDAO();
                String linea = br.readLine();
                String[] datos = linea.split("-");
                ReservaDTO reserva = new ReservaDTO();
                reserva.setIdReserva(datos[0]);
                reserva.setPasajero(datos[1]);
                reserva.setDia(Integer.parseInt(datos[2]));
                reserva.setEquipaje(datos[3]);
                reserva.setCliente(clienteDAO.buscarXcedula(datos[4]));
                reserva.setPaqueteTuristico(paqueteDAO.buscarXnombre(datos[5])); 
                lista.add(reserva);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("Error de archivo no encontrado" + fe.getMessage());
        } catch (IOException io) {
            System.out.println("Error de escritura" + io.getMessage());
        } finally {
            utilidades.CerrarReaders(fr, br);
        }
        return lista;
    }

    public String escribir(ReservaDTO reserva) {
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        String error = "Todo bien";
        try {
            file = new File(RUTAARCHIVO);
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            //2. escribir
            bw.write(reserva.toArchivo());
            bw.newLine();
            bw.flush();

        } catch (IOException io) {
            System.out.println("error " + io.getMessage());
            error = "Error en escribir una reserva " + io.getMessage();
        } finally {
            utilidades.CerrarWriters(fw, bw);
        }
        return error;
    }

    public ReservaDTO BusquedaID(String id) {
        ArrayList<ReservaDTO> listaReservas = leer();
        ReservaDTO encontrado=null;
        for (ReservaDTO reserva : listaReservas) {
            if (reserva.getIdReserva().equalsIgnoreCase(id)) {
                 return reserva;
            }
        }
            System.out.println("No exite ese id ");
        return  null;
    }

    public ArrayList<ReservaDTO> BusquedaDia(int dia) {
        ArrayList<ReservaDTO> listaReservas = leer();
        ArrayList<ReservaDTO> listaEncontrados = new ArrayList<>();
        for (ReservaDTO reserva : listaReservas) {
            if (reserva.getDia() == dia) {
                listaEncontrados.add(reserva);
            }
        }
        return listaEncontrados;
    }
}