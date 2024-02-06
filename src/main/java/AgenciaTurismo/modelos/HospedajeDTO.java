//AUTOR:JOSE LUIS LEON TUBAY
package AgenciaTurismo.modelos;

import java.util.Date;


public class HospedajeDTO {
    private String nombre,apellido;
    private String hoteles;
    private String NumeroHabitaciones;
    private int NumeroPersonas;
    private int precioFinal = 0;
    private Date FechaInicio;
    private Date FechaFinal;
    
    public HospedajeDTO(){
    }

    public HospedajeDTO(String nombre, String apellido, String hoteles, String NumeroHabitaciones, int NumeroPersonas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.hoteles = hoteles;
        this.NumeroHabitaciones = NumeroHabitaciones;
        this.NumeroPersonas = NumeroPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }
    
    public String getHoteles() {
        return hoteles;
    }

    public String getNumeroHabitaciones() {
        return NumeroHabitaciones;
    }
    public int getNumeroPersonas() {
        return NumeroPersonas;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
    

    public void setHoteles(String hoteles) {
        this.hoteles = hoteles;
    }
    
    public void setNumeroHabitaciones(String NumeroHabitaciones) {
             precioFinal=0;
       if (NumeroHabitaciones == "2") {
        precioFinal += 20;
    } else if (NumeroHabitaciones == "3") {
        precioFinal += 40;
    } else if (NumeroHabitaciones == "") {
        precioFinal += 50;
    }
       this.NumeroHabitaciones = NumeroHabitaciones;
    }
    public void setNumeroPersonas(int NumeroPersonas) {
        if(NumeroPersonas==2){
            precioFinal-=precioFinal*0.1;
        }else if(NumeroPersonas==3){
            precioFinal-=precioFinal*0.2;
        }else if(NumeroPersonas==4){
            precioFinal-=precioFinal*0.3;
        }
        this.NumeroPersonas = NumeroPersonas;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    
   public int Calcularprecio(){
   
    if (hoteles.equalsIgnoreCase("Boston Hotel")) {
        precioFinal += 100;
    } else if (hoteles.equalsIgnoreCase("Hotel Prices")) {
        precioFinal += 250;
    } else if (hoteles.equalsIgnoreCase("Wyndlam Garden")) {
        precioFinal += 300;
    }

         return precioFinal;
   }
    public int getprecioFinal() {
        return Calcularprecio();
    }
    public void setPrecioFinal(int precioFinal) {
        precioFinal=precioFinal;
    }   

   
    @Override
    public String toString() {
        return "\nDATOS DE LA RESERVACION DE HOSPEDAJE" + "\nnombre="+ getNombre() +"\nApellido=" 
                + getapellido()+ "\nhoteles=" + getHoteles() + "\nNumeroHabitaciones=" +
                getNumeroHabitaciones()+"\nNumeroPersonas=" + getNumeroPersonas() 
                +"\nFechaInicio" + getFechaInicio() +"\nFechaFin" + getFechaFinal() + "\nprecioFinal=" + Calcularprecio();
    }
    
    public String toArchivo(){
        return nombre + ";" + apellido + ";" + hoteles + ";" + NumeroHabitaciones + ";" + NumeroPersonas + ";" + FechaInicio + ";" + FechaFinal + ";" + precioFinal;
        
    }
}
