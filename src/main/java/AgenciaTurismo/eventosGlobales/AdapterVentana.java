/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AgenciaTurismo.eventosGlobales;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class AdapterVentana extends WindowAdapter{
    JFrame frame=new JFrame();
    @Override
    public void windowClosing(WindowEvent we){
        int respuesta=JOptionPane.showConfirmDialog(null, "SALIR DEL SISTEMA ", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
     if (respuesta == JOptionPane.YES_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.exit(0);
                } else {
         
                    frame.setDefaultCloseOperation(WindowEvent.WINDOW_ACTIVATED);
                }

    }
       
}
