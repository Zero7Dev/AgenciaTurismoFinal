//ALEJANDRA RUEDA ENCALADA
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AgenciaTurismo.vistas;

import AgenciaTurismo.modelos.ClienteDTO;
import AgenciaTurismo.modelos.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author ALEJANDRA
 */
public class VentanaConsultaCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaConsultaCliente
     */
    public VentanaConsultaCliente() {
        initComponents();
        this.lblNombre.setVisible(false);
        this.lblCedula.setVisible(false);
        this.TxtBusquedaComun.setVisible(false);
        this.TxtBusquedaUnIco.setVisible(false);
        this.jPanelComun1.setVisible(false);
        this.jPanelUnico.setVisible(false);
        this.BtnUnico.setVisible(false);
        this.btnComun.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmbBusquedad = new javax.swing.JComboBox<>();
        BusquedaClientes = new javax.swing.JButton();
        criterioBusqueda = new javax.swing.JLabel();
        TxtBusquedaComun = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        TxtBusquedaUnIco = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnComun = new javax.swing.JButton();
        BtnUnico = new javax.swing.JButton();
        JPanelComun = new javax.swing.JPanel();
        jPanelUnico = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformacionClienteUnixo = new javax.swing.JTextArea();
        jPanelComun1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Búsqueda por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cmbBusquedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nombre", "Cédula", " " }));
        cmbBusquedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBusquedadActionPerformed(evt);
            }
        });

        BusquedaClientes.setText("Buscar");
        BusquedaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaClientesActionPerformed(evt);
            }
        });

        TxtBusquedaComun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBusquedaComunActionPerformed(evt);
            }
        });

        lblCedula.setText("INGRESE LA CEDULA");

        TxtBusquedaUnIco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBusquedaUnIcoKeyTyped(evt);
            }
        });

        lblNombre.setText("INGRESE EL NOMBRE");

        btnComun.setText("Buscar");
        btnComun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComunActionPerformed(evt);
            }
        });

        BtnUnico.setText("Buscar");
        BtnUnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblCedula))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBusquedad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BusquedaClientes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtBusquedaUnIco, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnUnico))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtBusquedaComun, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(criterioBusqueda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnComun)))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBusquedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusquedaClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(criterioBusqueda)
                    .addComponent(TxtBusquedaComun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(btnComun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBusquedaUnIco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula)
                    .addComponent(BtnUnico))
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout JPanelComunLayout = new javax.swing.GroupLayout(JPanelComun);
        JPanelComun.setLayout(JPanelComunLayout);
        JPanelComunLayout.setHorizontalGroup(
            JPanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1225, Short.MAX_VALUE)
        );
        JPanelComunLayout.setVerticalGroup(
            JPanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        txtInformacionClienteUnixo.setColumns(20);
        txtInformacionClienteUnixo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtInformacionClienteUnixo.setRows(5);
        jScrollPane1.setViewportView(txtInformacionClienteUnixo);

        javax.swing.GroupLayout jPanelUnicoLayout = new javax.swing.GroupLayout(jPanelUnico);
        jPanelUnico.setLayout(jPanelUnicoLayout);
        jPanelUnicoLayout.setHorizontalGroup(
            jPanelUnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUnicoLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        jPanelUnicoLayout.setVerticalGroup(
            jPanelUnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaDatos);

        javax.swing.GroupLayout jPanelComun1Layout = new javax.swing.GroupLayout(jPanelComun1);
        jPanelComun1.setLayout(jPanelComun1Layout);
        jPanelComun1Layout.setHorizontalGroup(
            jPanelComun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComun1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanelComun1Layout.setVerticalGroup(
            jPanelComun1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComun1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelUnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelComun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPanelComun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 178, Short.MAX_VALUE)
                        .addComponent(JPanelComun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelUnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelComun1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 203, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnUnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnicoActionPerformed
        // TODO add your handling code here:
        this.jPanelComun1.setVisible(false);
        this.jPanelUnico.setVisible(true);
        cargarInfoDatoUnico(this.TxtBusquedaUnIco.getText());
    }//GEN-LAST:event_BtnUnicoActionPerformed

    private void btnComunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComunActionPerformed
        // TODO add your handling code here:
        this.jPanelComun1.setVisible(true);
        this.jPanelUnico.setVisible(false);
        cargarTabla(this.TxtBusquedaComun.getText());
    }//GEN-LAST:event_btnComunActionPerformed

    private void TxtBusquedaUnIcoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBusquedaUnIcoKeyTyped
        // TODO add your handling code here:

        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtBusquedaUnIcoKeyTyped

    private void TxtBusquedaComunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBusquedaComunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBusquedaComunActionPerformed

    private void BusquedaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaClientesActionPerformed

        switch ((String) this.cmbBusquedad.getSelectedItem()) {
            case "Seleccionar":
            this.lblNombre.setVisible(false);
            this.lblCedula.setVisible(false);
            this.TxtBusquedaComun.setVisible(false);
            this.TxtBusquedaUnIco.setVisible(false);
            this.jPanelComun1.setVisible(false);
            this.jPanelComun1.setVisible(false);

            this.jPanelUnico.setVisible(false);
            this.btnComun.setVisible(false);
            this.BtnUnico.setVisible(false);
            break;
            case "Nombre":
            this.lblNombre.setVisible(true);
            this.lblCedula.setVisible(false);
            this.btnComun.setVisible(true);
            this.BtnUnico.setVisible(false);
            this.TxtBusquedaComun.setVisible(true);
            this.TxtBusquedaUnIco.setVisible(false);
            //                this.JPanelComun.setVisible(true);
            //                        this.jPanelComun1.setVisible(true);
            //
            //                this.jPanelUnico.setVisible(false);
            ArrayList<ClienteDTO> lista = AccesoAdatosCliente.buscarXnombre(this.criterioBusqueda.getText());
            break;
            case "Cédula":
            this.lblNombre.setVisible(false);
            this.lblCedula.setVisible(true);
            this.BtnUnico.setVisible(true);
            this.btnComun.setVisible(false);
            //                this.s.setVisible(true);
            this.TxtBusquedaComun.setVisible(false);
            this.TxtBusquedaUnIco.setVisible(true);
            //                this.jPanelUnico.setVisible(true);
            //                this.JPanelComun.setVisible(false);
            this.jPanelComun1.setVisible(false);

            AccesoAdatosCliente.buscarXcedula(this.criterioBusqueda.getText());
            break;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaClientesActionPerformed

    private void cmbBusquedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBusquedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBusquedadActionPerformed
    ClienteDAO AccesoAdatosCliente = new ClienteDAO();

      public void cargarInfoDatoUnico(String cedula) {
        ClienteDTO cliente = AccesoAdatosCliente.buscarXcedula(cedula);
        if (cliente == null) {
            this.txtInformacionClienteUnixo.setText("No hay ningun cliente registrado con esa cedula");
            return;
        }
        txtInformacionClienteUnixo.setText(cliente.toString());
    }

    public void cargarTabla(String datoComun) {
        ArrayList<ClienteDTO> listaComun = AccesoAdatosCliente.buscarXnombre(datoComun);
        System.out.println(listaComun.toString());
        if (listaComun.isEmpty()) {
            txtInformacionClienteUnixo.setText("no hay clientes reguistrados con ese nombre");
            txtInformacionClienteUnixo.setVisible(true);
            jPanelComun1.setVisible(false);
            jPanelUnico.setVisible(true);
            return;
        }
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        String[] columnas = {"CEDULA", "NOMBRE", "APELLIDO"};
        modelo.setColumnIdentifiers(columnas);
        for (ClienteDTO cliente : listaComun) {
            Object[] Cliente = new Object[]{cliente.getCedula(), cliente.getNombre(),
                cliente.getApellido()};
            modelo.addRow(Cliente);
        }
        tablaDatos.setModel(modelo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUnico;
    private javax.swing.JButton BusquedaClientes;
    private javax.swing.JPanel JPanelComun;
    private javax.swing.JTextField TxtBusquedaComun;
    private javax.swing.JTextField TxtBusquedaUnIco;
    private javax.swing.JButton btnComun;
    private javax.swing.JComboBox<String> cmbBusquedad;
    private javax.swing.JLabel criterioBusqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelComun1;
    private javax.swing.JPanel jPanelUnico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextArea txtInformacionClienteUnixo;
    // End of variables declaration//GEN-END:variables
}
