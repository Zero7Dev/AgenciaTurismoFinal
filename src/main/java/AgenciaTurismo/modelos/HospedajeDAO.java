//AUTOR:JOSE LUIS LEON TUBAY
package AgenciaTurismo.modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class HospedajeDAO {
    public static final String RUTAARCHIVO = "src/main/java/archivos/hospedaje.txt";
    
    public String escribir(HospedajeDTO hosp){
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
            bw.write(hosp.toArchivo());
            bw.newLine();
            bw.flush();

        } catch (IOException io) {
            System.out.println("error " + io.getMessage());
            error = "Error en reservar " + io.getMessage();
        } finally {
            try {
                fw.close();
                bw.close();
            } catch (IOException io) {
                System.out.println("error " + io.getMessage());
                error = "Error en reservar, cerrar stream " + io.getMessage();
            }
        }

        return error;
    }
     public ArrayList<HospedajeDTO> leer() {
    // clases para lectura de archivo de texto
    File file = null;
    FileReader fr = null;
    BufferedReader br = null;
    ArrayList<HospedajeDTO> lista = null;
    try {
        file = new File(RUTAARCHIVO);
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        lista = new ArrayList<>();
        // 2. leer 
        while (br.ready()) {
            String linea = br.readLine();
            String[] datos = linea.split(";");
            if (datos.length < 4) {
                System.out.println("Error: linea invalida - " + linea);
                continue;
            }
            HospedajeDTO Persona = new HospedajeDTO();
            Persona.setNombre(datos[0]);
            Persona.setapellido(datos[1]);
            Persona.setHoteles(datos[2]);
            Persona.setNumeroHabitaciones(datos[3]);
            Persona.setNumeroPersonas(Integer.parseInt(datos[4]));
            lista.add(Persona);
            System.out.println("paquete: " + Persona.toArchivo());
        }
    } catch (FileNotFoundException fe) {
        System.out.println("Error de archivo no encontrado" + fe.getMessage());
    } catch (IOException io) {
        System.out.println("Error de escritura" + io.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: linea invalida - " + lista);
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
  
   
  

public ArrayList<HospedajeDTO> buscarXHabitacion(int nhabitacion) {
    ArrayList<HospedajeDTO> listaTodos = leer();
    ArrayList<HospedajeDTO> listaEncontrados = new ArrayList<>();
    for (HospedajeDTO hosp : listaTodos) {
        if (Integer.parseInt(hosp.getNumeroHabitaciones()) == nhabitacion) {
            listaEncontrados.add(hosp);
        }
    }
    return listaEncontrados;
}
     public HospedajeDTO buscarXNombre(String nombre) {
        ArrayList<HospedajeDTO> listaPersonas = leer();
        for (HospedajeDTO persona : listaPersonas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }           
        }
        return null;
    }
}

