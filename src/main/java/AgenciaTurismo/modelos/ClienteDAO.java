//ALEJANDRA RUEDA ENCALADA
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
 * @author USER
 */
public class ClienteDAO {

    public static final String RUTAARCHIVO = "src/main/java/archivos/clientes.txt";
    public ArrayList<ClienteDTO> listaEncontrados = new ArrayList<>();
    helpers utilidades = new helpers();
    ClienteDTO paqueteEncontrado = null;

    public ClienteDTO buscarXcedula(String cedula) {
        ArrayList<ClienteDTO> listaPersonas = leer();
        for (ClienteDTO persona : listaPersonas) {
            if (persona.getCedula().equalsIgnoreCase(cedula)) {
                return persona;
            }
        }
        return null;
    }

    public ArrayList<ClienteDTO> leer() {
        // clases para lectura de archivo de texto
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<ClienteDTO> lista = null;
        try {
            file = new File(RUTAARCHIVO);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            lista = new ArrayList<>();
            // 2. leer 
            while (br.ready()) {

                String linea = br.readLine();
                String[] datos = linea.split(";");
                ClienteDTO Persona = new ClienteDTO();
                try {
                    Persona.setApellido(datos[6]);

                } catch (IllegalArgumentException e) {
                    System.out.println("Apellido" + e.getMessage());
                }
                try {
                    Persona.setCedula(datos[0]);

                } catch (IllegalArgumentException e) {
                    System.out.println("Cedula" + e.getMessage());
                }

                Persona.setEdad(Integer.parseInt(datos[1]));
                Persona.setTelefono(datos[2]);
                Persona.setCorreo(datos[3]);
                Persona.setDiscapacidad(datos[4]);
                Persona.setNombre(datos[5]);
                try {
                    Persona.setApellido(datos[6]);

                } catch (IllegalArgumentException e) {
                    System.out.println("Apellido" + e.getMessage());
                }

                lista.add(Persona);
                System.out.println("paquete: " + Persona.toArchivo());
            }
        } catch (FileNotFoundException fe) {
            System.out.println("Error de archivo no encontrado" + fe.getMessage());
        } catch (IOException io) {
            System.out.println("Error de escritura" + io.getMessage());
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException io) {
                System.out.println("Error en cerrar stream leer libro" + io.getMessage());
            }
        }
        return lista;
    }

    public ArrayList<ClienteDTO> buscarXnombre(String cedula) {
        ArrayList<ClienteDTO> listaTodos = leer();;
        ArrayList<ClienteDTO> listaEncontrados = new ArrayList<>();
        for (ClienteDTO cliente : listaTodos) {
            if (cliente.getNombre().equalsIgnoreCase(cedula)) {
                listaEncontrados.add(cliente);
            }
        }
        return listaEncontrados;
    }

    public String escribir(ClienteDTO cliente) {
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
            bw.write(cliente.toArchivo());
            bw.newLine();
            bw.flush();

        } catch (IOException io) {
            System.out.println("error " + io.getMessage());
            error = "Error en escribir Paquete Turistico " + io.getMessage();
        } finally {
            utilidades.CerrarWriters(fw, bw);
        }
        return error;
    }

}
