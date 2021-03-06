package Views;

import Controller.AlumnoJpaController;
import Controller.GrupoJpaController;
import Models.Alumno;
import static Models.Alumno_.id;
import Models.Grupo;
import Views.Alumnos.AgregarAlumno;
import Views.Alumnos.EditarAlumno;
import Views.Alumnos.EliminarAlumno;
import Views.Grupos.AgregarGrupo;
import Views.Grupos.EditarGrupo;
import Views.Grupos.EliminarGrupo;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DANIEL FELIX
 */
public class TablaVista extends javax.swing.JFrame {
   EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("EscuelaBDAPU");
   int aula = 0;
    public TablaVista() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        GrupoDeTablas = new javax.swing.ButtonGroup();
        GrupoDeVisibles = new javax.swing.ButtonGroup();
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
        verActivos = new javax.swing.JRadioButtonMenuItem();
        verInactivos = new javax.swing.JRadioButtonMenuItem();
        verAmbos = new javax.swing.JRadioButtonMenuItem();

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPrincipal);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        GrupoDeVisibles.add(verActivos);
        verActivos.setSelected(true);
        verActivos.setText("Ver solo Activos");
        verActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActivosActionPerformed(evt);
            }
        });
        jMenu3.add(verActivos);

        GrupoDeVisibles.add(verInactivos);
        verInactivos.setText("Ver Solo Inactivos");
        verInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verInactivosActionPerformed(evt);
            }
        });
        jMenu3.add(verInactivos);

        GrupoDeVisibles.add(verAmbos);
        verAmbos.setText("Ver Ambos");
        verAmbos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAmbosActionPerformed(evt);
            }
        });
        jMenu3.add(verAmbos);

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
    private long getGrupo(int fila){
        long id = 0;
        List<Alumno> alumnos;
        AlumnoJpaController objController = new AlumnoJpaController(emf);
        alumnos = objController.findAlumnoEntities();
        for (int i = 0; i < alumnos.size(); i++) {
             if (alumnos.get(i).getNombre().equals(String.valueOf(this.tblPrincipal.getValueAt(fila, 2)))) {
                id = alumnos.get(i).getIdAula();
            }
        }
        return id;
    }
    private int getStatus(int fila){
        String estatus = String.valueOf(this.tblPrincipal.getValueAt(fila, 3));
        int Estado = 1;
        if (estatus.equals(estatus)){}
        else{Estado = 0;}
        return Estado;
    }
    public void mostrarTablas(){
        restablecerTabla();
        DefaultTableModel modelo = (DefaultTableModel) tblPrincipal.getModel();
        modelo.setRowCount(0);
        if (verAlumnos.isSelected()) {
            this.setTitle("Mostrando tabla de Alumnos");
            modelo.addColumn("ID del Alumno");
            modelo.addColumn("Nombre");
            modelo.addColumn("Grupo");
            modelo.addColumn("Estatus");
            List<Alumno> alumnos;
            AlumnoJpaController objController = new AlumnoJpaController(emf);
            alumnos = objController.findAlumnoEntities();
            List<Grupo> grupos;
            GrupoJpaController control = new GrupoJpaController(emf);
            grupos = control.findGrupoEntities();
            String salon = "";
            for (int i = 0; i < alumnos.size(); i++) {
                Alumno alumno = alumnos.get(i);
                for (int j = 0; j < grupos.size(); j++) {
                    Grupo x = grupos.get(j);
                    if (alumno.getIdAula() == x.getId()) {
                        salon = x.getNombre();
                    }
                }
                if (verActivos.isSelected() && alumno.getActivo() == 1) {
                    modelo.addRow(new Object[]{alumno.getId(), alumno.getNombre(), salon,
                    alumno.isActivo() ? "Activo" : "Baja"});
                }else if(verInactivos.isSelected() && alumno.getActivo() == 0){
                    modelo.addRow(new Object[]{alumno.getId(), alumno.getNombre(), salon,
                    alumno.isActivo() ? "Activo" : "Baja"});
                }else if(verAmbos.isSelected()){
                    modelo.addRow(new Object[]{alumno.getId(), alumno.getNombre(), salon,
                    alumno.isActivo() ? "Activo" : "Baja"});
                }
            }
        } else{
            this.setTitle("Mostrando tabla de Grupos");
            modelo.addColumn("ID del Aula");
            modelo.addColumn("Nombre del Aula");
            modelo.addColumn("Capacidad");
            modelo.addColumn("Disponibilidad");
            List<Grupo> grupos;
            GrupoJpaController control = new GrupoJpaController(emf);
            grupos = control.findGrupoEntities();
            for (int i = 0; i < grupos.size(); i++) {
                Grupo grupo = grupos.get(i);
                if(verActivos.isSelected() && grupo.getDisponibilidad() == 1){
                    modelo.addRow(new Object[]{grupo.getId(), grupo.getNombre(), grupo.getCapacidad(),
                    grupo.isDisponible() ? "Disponible" : "No Disponible"});
                }else if(verInactivos.isSelected() && grupo.getDisponibilidad() == 0){
                    modelo.addRow(new Object[]{grupo.getId(), grupo.getNombre(), grupo.getCapacidad(),
                    grupo.isDisponible() ? "Disponible" : "No Disponible"});
                } else if(verAmbos.isSelected()){
                    modelo.addRow(new Object[]{grupo.getId(), grupo.getNombre(), grupo.getCapacidad(),
                    grupo.isDisponible() ? "Disponible" : "No Disponible"});
                }
            }
        }
    }
   
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    private void verAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAlumnosActionPerformed
        mostrarTablas();
    }//GEN-LAST:event_verAlumnosActionPerformed
    private void verAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAulasActionPerformed
        mostrarTablas();
    }//GEN-LAST:event_verAulasActionPerformed
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (verAlumnos.isSelected()) {
            long id = tblPrincipal.getRowCount() + 3;
            AgregarAlumno x = new AgregarAlumno(this, true,id);
            x.setVisible(true);
        }else{
            AgregarGrupo x = new AgregarGrupo(this,true);
            x.setVisible(true);
        }
        mostrarTablas();
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String texto = txtBuscar.getText();
        DefaultTableModel modelo = (DefaultTableModel) tblPrincipal.getModel();
        modelo.setRowCount(0);
        if (verAlumnos.isSelected()) {
            AlumnoJpaController controlador = new AlumnoJpaController(emf);
            List<Alumno> alumnosfiltrados = controlador.buscarAlumno(texto);
            for (int i = 0; i < alumnosfiltrados.size(); i++) {
                Alumno alumno = alumnosfiltrados.get(i);
                modelo.addRow(new Object[]{alumno.getId(), alumno.getNombre(), alumno.getIdAula(),
                    alumno.isActivo() ? "Activo" : "Baja"});
            }
        }else{
            List<Grupo> gruposfiltrados;
            GrupoJpaController control = new GrupoJpaController(emf);
            gruposfiltrados = control.buscarGrupo(texto);
            for (int i = 0; i < gruposfiltrados.size(); i++) {
                Grupo grupo = gruposfiltrados.get(i);
                modelo.addRow(new Object[]{grupo.getId(),grupo.getNombre(),grupo.getCapacidad(),
                    grupo.isDisponible()?"Disponible":"No Disponible"});
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
    }//GEN-LAST:event_txtBuscarActionPerformed
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            if (verAlumnos.isSelected()) {
            int fila = tblPrincipal.getSelectedRow();
            String idtextp = String.valueOf(this.tblPrincipal.getValueAt(fila, 0));
            String Nombre = String.valueOf(this.tblPrincipal.getValueAt(fila, 1));
            String Aula = String.valueOf(this.tblPrincipal.getValueAt(fila, 2));
            int Estatustexto = getStatus(fila);
            int id = Integer.valueOf(idtextp);
            EditarAlumno x = new EditarAlumno(this,true,id,Nombre,Aula,Estatustexto);
            x.setVisible(true);
        } else if(verAulas.isSelected()){
            int fila = tblPrincipal.getSelectedRow();
            int dispo = 1;
            String idtextp = String.valueOf(this.tblPrincipal.getValueAt(fila, 0));
            String Nombre = String.valueOf(this.tblPrincipal.getValueAt(fila, 1));
            String Capacidadtexto = String.valueOf(this.tblPrincipal.getValueAt(fila, 2));
            String Disponibilidad = String.valueOf(tblPrincipal.getValueAt(fila, 3));
            long Id = Long.valueOf(idtextp);
            int Capa = Integer.valueOf(Capacidadtexto);
            if (Disponibilidad.equals("Disponible")) {}else{dispo = 0;}
            EditarGrupo x = new EditarGrupo(this,true,Id,Nombre,Capa,dispo);
            x.setVisible(true);
        }
        }catch(Exception ex){
            JOptionPane pan = new JOptionPane();
            pan.showMessageDialog(null,"Selecciona una fila primero");
        }
        mostrarTablas();
    }//GEN-LAST:event_btnModificarActionPerformed
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            if (verAlumnos.isSelected()) {
            int fila = tblPrincipal.getSelectedRow();
            String idtextp = String.valueOf(this.tblPrincipal.getValueAt(fila, 0));
            String Nombre = String.valueOf(this.tblPrincipal.getValueAt(fila, 1));
            String Aula = String.valueOf(this.tblPrincipal.getValueAt(fila, 2));
            int Estatustexto = getStatus(fila);
            int id = Integer.valueOf(idtextp);
            EliminarAlumno x = new EliminarAlumno(this,true,id,Nombre,Aula,Estatustexto);
            x.setVisible(true);
        } else if(verAulas.isSelected()){
            int fila = tblPrincipal.getSelectedRow();
            int dispo = 1;
            String idtextp = String.valueOf(this.tblPrincipal.getValueAt(fila, 0));
            String Nombre = String.valueOf(this.tblPrincipal.getValueAt(fila, 1));
            String Capacidadtexto = String.valueOf(this.tblPrincipal.getValueAt(fila, 2));
            String Disponibilidad = String.valueOf(tblPrincipal.getValueAt(fila, 3));
            long Id = Long.valueOf(idtextp);
            int Capa = Integer.valueOf(Capacidadtexto);
            if (Disponibilidad.equals("Disponible")) {}else{dispo = 0;}
            EliminarGrupo x = new EliminarGrupo(this,true,Id,Nombre,Capa,dispo);
            x.setVisible(true);
        }
        }catch(Exception ex){
            JOptionPane pan = new JOptionPane();
            pan.showMessageDialog(null,"Selecciona una fila primero");
        }
        mostrarTablas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void verActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActivosActionPerformed
        mostrarTablas();
    }//GEN-LAST:event_verActivosActionPerformed

    private void verInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verInactivosActionPerformed
        mostrarTablas();
    }//GEN-LAST:event_verInactivosActionPerformed

    private void verAmbosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAmbosActionPerformed
        mostrarTablas();
    }//GEN-LAST:event_verAmbosActionPerformed


    
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
    private javax.swing.ButtonGroup GrupoDeVisibles;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrincipal;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JRadioButtonMenuItem verActivos;
    private javax.swing.JRadioButtonMenuItem verAlumnos;
    private javax.swing.JRadioButtonMenuItem verAmbos;
    private javax.swing.JRadioButtonMenuItem verAulas;
    private javax.swing.JRadioButtonMenuItem verInactivos;
    // End of variables declaration//GEN-END:variables
}
