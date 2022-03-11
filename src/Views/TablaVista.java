package Views;

import Controller.AlumnoJpaController;
import Controller.GrupoJpaController;
import Models.Alumno;
import Models.Grupo;
import Views.Alumnos.Agregar;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DANIEL FELIX
 */
public class TablaVista extends javax.swing.JFrame {
   EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("EscuelaBDAPU");
    public TablaVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarTblAlumnos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        GrupoDeTablas = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrincipal = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        verAlumnos = new javax.swing.JRadioButtonMenuItem();
        verAulas = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mostrando Tabla");
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        tblPrincipal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPrincipal);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jMenu2.setText("Cambiar de Tabla");

        GrupoDeTablas.add(verAlumnos);
        verAlumnos.setSelected(true);
        verAlumnos.setText("Ver Tabla de Alumnos");
        verAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAlumnosActionPerformed(evt);
            }
        });
        jMenu2.add(verAlumnos);

        GrupoDeTablas.add(verAulas);
        verAulas.setText("Ver Tabla de las Aulas");
        verAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAulasActionPerformed(evt);
            }
        });
        jMenu2.add(verAulas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ver");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Ver solo Activos");
        jMenu3.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Ver Solo Inactivos");
        jMenu3.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Ver Ambos");
        jMenu3.add(jRadioButtonMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void restablecerTabla(){
        tblPrincipal.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{{},{},{}},
                new String[]{}
        ));
    }
    
    public void mostrarTblAlumnos(){
        restablecerTabla();
        DefaultTableModel modelo = (DefaultTableModel) tblPrincipal.getModel();
        modelo.setRowCount(0);
        modelo.addColumn("ID del Alumno");
        modelo.addColumn("Nombre");
        modelo.addColumn("Grupo");
        modelo.addColumn("Estatus");
        List<Alumno> alumnos;
        AlumnoJpaController objController = new AlumnoJpaController(emf);
        alumnos = objController.findAlumnoEntities();
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            modelo.addRow(new Object[]{alumno.getId(),alumno.getNombre(), alumno.getIdAula(),
            alumno.isActivo()?"Activo":"Baja"});
        }
    }
    
    public void mostrarTblAulas(){
        restablecerTabla();
        DefaultTableModel modelo = (DefaultTableModel) tblPrincipal.getModel();
        modelo.setRowCount(0);
        modelo.addColumn("ID del Aula");
        modelo.addColumn("Nombre del Aula");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Disponibilidad");
        List<Grupo> grupos;
        GrupoJpaController control = new GrupoJpaController(emf);
        grupos = control.findGrupoEntities();
        for (int i = 0; i < grupos.size(); i++) {
            Grupo grupo = grupos.get(i);
            modelo.addRow(new Object[]{grupo.getId(), grupo.getNombre(), grupo.getCapacidad(),
            grupo.isDisponible()?"Disponible":"No Disponible" });
        }
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void verAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAlumnosActionPerformed
        mostrarTblAlumnos();
    }//GEN-LAST:event_verAlumnosActionPerformed

    private void verAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAulasActionPerformed
        mostrarTblAulas();
    }//GEN-LAST:event_verAulasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Agregar x= new Agregar(this, true);
        x.setVisible(true);
        mostrarTblAlumnos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String texto = txtBuscar.getText();
        DefaultTableModel modelo = (DefaultTableModel) tblPrincipal.getModel();
        AlumnoJpaController controlador = new AlumnoJpaController(emf);
        List<Alumno> alumnosfiltrados = controlador.buscarAlumno(texto);
        modelo.setRowCount(0);
        for (int i = 0; i < alumnosfiltrados.size(); i++) {
            Alumno alumno = alumnosfiltrados.get(i);
            modelo.addRow(new Object[]{alumno.getId(),alumno.getNombre(), alumno.getIdAula(),
            alumno.isActivo()?"Activo":"Baja"});
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
    }//GEN-LAST:event_txtBuscarActionPerformed


    
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
            java.util.logging.Logger.getLogger(TablaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoDeTablas;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrincipal;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JRadioButtonMenuItem verAlumnos;
    private javax.swing.JRadioButtonMenuItem verAulas;
    // End of variables declaration//GEN-END:variables
}
