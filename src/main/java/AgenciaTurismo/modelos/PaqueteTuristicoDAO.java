//autor: COLOMA VERA JULIO 
package AgenciaTurismo.modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Clasrses/Class.java to edit this template
 */
import AgenciaTurismo.ClasesHerencia_Asociacion.ActividadPaqueteTuristico;
import AgenciaTurismo.modelos.PaqueteTuristicoDTO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class PaqueteTuristicoDAO {

    public static Set<String> nombresExistentes = new HashSet<>();
    public static final String RUTAARCHIVO = "src/main/java/archivos/paquetes.txt";
    ArrayList<PaqueteTuristicoDTO> listaEncontrados = new ArrayList<>();
    public ArrayList<PaqueteTuristicoDTO> listaPaquetes = null;
    PaqueteTuristicoDTO paqueteEncontrado = null;
    helpers utilidades = new helpers();

    public PaqueteTuristicoDTO buscarXnombre(String nombrePaquete) {
        if (listaPaquetes != null) {
            listaPaquetes.clear();
        }
        CargarDatos();
        for (PaqueteTuristicoDTO paquete : listaPaquetes) {
            if (paquete.getNombrePaquete().equalsIgnoreCase(nombrePaquete)) {
                return paquete;
            }
        }
        return null;
    }

    public ArrayList<PaqueteTuristicoDTO> BusquedaTipoViaje(String tipoDeViaje) {
        if (listaPaquetes != null) {
            listaPaquetes.clear();
        }
        if (listaEncontrados != null) {
            listaEncontrados.clear();
        }
        CargarDatos();
        for (PaqueteTuristicoDTO paqueteTuristico : listaPaquetes) {
            if (paqueteTuristico.getTipoViaje().equalsIgnoreCase(tipoDeViaje)) {
                listaEncontrados.add(paqueteTuristico);
            }
        }
        return listaEncontrados;
    }

    public ArrayList<PaqueteTuristicoDTO> leer() {
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<PaqueteTuristicoDTO> lista = null;
        try {
            file = new File(RUTAARCHIVO);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            lista = new ArrayList<>();
            while (br.ready()) {
                String linea = br.readLine();
                String[] datos = linea.split(";");
                PaqueteTuristicoDTO paquete = new PaqueteTuristicoDTO();
                nombresExistentes.add(datos[9]);
                    System.out.println(nombresExistentes.toString());
                try {
                    paquete.setId(Integer.parseInt(datos[0]));
                } catch (IllegalArgumentException e) {
                    System.err.println("ERROR al establecer el ID: " + e.getMessage());
                }

                paquete.setDestino(datos[1]);

                try {
                    paquete.setDuracion(datos[2]);
                } catch (IllegalArgumentException e) {
                    System.err.println("ERROR al establecer la duración: " + e.getMessage());
                }

                paquete.setComidaIncluida(Boolean.parseBoolean(datos[4]));

                try {
                    paquete.setPrecio(Integer.parseInt(datos[3]));
                } catch (IllegalArgumentException e) {
                    System.err.println("ERROR al establecer el precio: " + e.getMessage());
                }

                paquete.setTipoViaje(datos[5]);

                try {
                    paquete.setPrecioFinal(Integer.parseInt(datos[6]));
                } catch (IllegalArgumentException e) {
                    System.err.println("ERROR al establecer el precio final: " + e.getMessage());
                }

                ActividadPaqueteTuristico actividad = new ActividadPaqueteTuristico();
                try {
                    actividad.setNombre(datos[7]);
                } catch (IllegalArgumentException e) {
                    System.err.println("ERROR al establecer el nombre de la actividad: " + e.getMessage());
                }
                actividad.setDescripcion(datos[8]);

                paquete.setActividad(actividad);

                try {
                    paquete.setName(datos[9]);
                } catch (IllegalArgumentException e) {
                    System.err.println("ERROR al establecer el nombre: " + e.getMessage());
                }

                lista.add(paquete);
                System.out.println("paquete: " + paquete.toStringToFile());
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

    public void CargarDatos() {
        PaqueteTuristicoDAO.nombresExistentes.clear();
        listaPaquetes = leer();
    }

    public String escribir(PaqueteTuristicoDTO paquete) {
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
            if (paquete.getNombrePaquete() != null) {
                bw.write(paquete.toStringToFile());
                bw.newLine();
                bw.flush();
            } else {
                error = "Ese nombre de paquete ya se encuentra reguistrado.";
            }
        } catch (IOException io) {
            System.out.println("error " + io.getMessage());
            error = "Error al tratar de guardar el Paquete Turistico " + io.getMessage();
        } finally {
            utilidades.CerrarWriters(fw, bw);
        }
        return error;
    }
}