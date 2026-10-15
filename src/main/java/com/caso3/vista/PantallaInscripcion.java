package com.caso3.vista;

import com.caso3.modelo.gestorInscripcion;
import com.caso3.modelo.Observer;
import com.caso3.modelo.Taller;
import com.caso3.modelo.Ticket;
import com.caso3.controlador.ControladorInscripcion;
import com.caso3.modelo.Alumno;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author erika
 */
public class PantallaInscripcion extends javax.swing.JFrame implements Observer {

    private gestorInscripcion gestor;
    private ControladorInscripcion controlador;

    /**
     * Creates new form pantallaInscripcion
     */
    public PantallaInscripcion(gestorInscripcion gestor) {
        this.gestor = gestor;
        this.gestor.addObserver(this);

        initComponents();

        CmbTalleres.removeAllItems();
        for (Taller t : gestor.obtenerTalleres()) {
            CmbTalleres.addItem(t.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CmbTalleres = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtIdAlumno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaDescTaller = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaTicket = new javax.swing.JTextArea();
        btnInscribirse = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Inscripcion a taller de ISW");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona el taller:");

        jLabel3.setFont(new java.awt.Font("Sans Serif Collection", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID Alumno:");

        CmbTalleres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CmbTalleres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbTalleresActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtIdAlumno.setBackground(new java.awt.Color(204, 204, 204));
        txtIdAlumno.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtIdAlumno.setForeground(new java.awt.Color(0, 0, 0));
        txtIdAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdAlumno.setCaretColor(new java.awt.Color(0, 0, 0));
        txtIdAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtIdAlumno.setSelectionColor(new java.awt.Color(102, 153, 255));
        txtIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlumnoActionPerformed(evt);
            }
        });
        txtIdAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdAlumnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdAlumnoKeyTyped(evt);
            }
        });

        txtareaDescTaller.setColumns(20);
        txtareaDescTaller.setRows(5);
        jScrollPane1.setViewportView(txtareaDescTaller);

        txtareaTicket.setColumns(20);
        txtareaTicket.setRows(5);
        jScrollPane2.setViewportView(txtareaTicket);

        btnInscribirse.setText("Inscribirse");
        btnInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(115, 115, 115))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CmbTalleres, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtIdAlumno)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator1)
                                .addGap(18, 18, 18)))
                        .addGap(172, 172, 172))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(btnInscribirse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(513, 513, 513))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtIdAlumno)
                                        .addGap(10, 10, 10))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)))
                                .addGap(37, 37, 37))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmbTalleres)
                                .addGap(31, 31, 31)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnInscribirse, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlumnoActionPerformed

    private void txtIdAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAlumnoKeyTyped

    }//GEN-LAST:event_txtIdAlumnoKeyTyped

    private void btnInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirseActionPerformed
        String IdAlumno = txtIdAlumno.getText();
        int indexTaller = CmbTalleres.getSelectedIndex();
        Taller tallerSeleccionado = gestor.obtenerTalleres().get(indexTaller);

        controlador.procesarInscripcion(IdAlumno, tallerSeleccionado);
    }//GEN-LAST:event_btnInscribirseActionPerformed

    private void CmbTalleresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbTalleresActionPerformed
        int index = CmbTalleres.getSelectedIndex();

        if (index >= 0 && index < gestor.obtenerTalleres().size()) {
            Taller TallerSeleccionado = gestor.obtenerTalleres().get(index);
            String desc =TallerSeleccionado.toString() ;
            txtareaDescTaller.setText(desc);
        }
    }//GEN-LAST:event_CmbTalleresActionPerformed

    private void txtIdAlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAlumnoKeyReleased
        String idBuscado = txtIdAlumno.getText().trim();
        gestor.buscarAlumno(idBuscado);
        Alumno alumnoEncontrado = gestor.getAlumnoActual();

        if (alumnoEncontrado != null) {
            String infoAlumno = "=== ALUMNO ENCONTRADO ===\n"
                    + "Nombre: " + alumnoEncontrado.getNombre() + "\n"
                    + "Carrera: " + alumnoEncontrado.getCarrera() + "\n"
                    + "ID: " + alumnoEncontrado.getIdAlumno() + "\n\n"
                    + "(Listo para inscribir)";
            txtareaTicket.setText(infoAlumno);
        } else {
            txtareaTicket.setText("Buscando alumno o ID no registrado...");
        }
    }//GEN-LAST:event_txtIdAlumnoKeyReleased

    public void setControlador(ControladorInscripcion controlador) {
        this.controlador = controlador;
    }

   
    @Override
    public void update() {
        Ticket ticket = gestor.getUltimoTicket();

        if (ticket != null) {
            String mensaje = "¡INSCRIPCIÓN EXITOSA!\n";
            mensaje += "-------------------------\n";
            mensaje += "Folio del Ticket: " + ticket.getNumFolio() + "\n";
            mensaje += "Alumno: " + ticket.getAlumno().getNombre() + "\n";
            mensaje += "Taller: " + ticket.getTaller().getNombre() + "\n";

            txtareaTicket.setText(mensaje);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbTalleres;
    private javax.swing.JToggleButton btnInscribirse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextArea txtareaDescTaller;
    private javax.swing.JTextArea txtareaTicket;
    // End of variables declaration//GEN-END:variables

}
