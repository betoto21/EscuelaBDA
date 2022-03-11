package Views.Alumnos;

import Controller.AlumnoJpaController;
import Controller.GrupoJpaController;
import Models.Alumno;
import Models.Grupo;
import java.util.List;
import javax.persistence.EntityManagerFactory;

public class Editar extends javax.swing.JDialog {

    EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("EscuelaBDAPU");
    private int id;
    private String Nombre;
    private String Aula;
    private int Estatus;
    
    public Editar(java.awt.Frame parent, boolean modal){}
    public Editar(java.awt.Frame parent, boolean modal,int id,String Nombre,String Aula,int Estatus) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        llenarCombos();
        this.id = id;
        this.Nombre = Nombre;
        this.Aula = Aula;
        this.Estatus = Estatus;
        llenarCampos();
    }
    
    private int getStatus(){
        String estatus = (String) boxEstatus.getSelectedItem();
        int Estado = 1;
        if (estatus.equals(estatus)){}
        else{Estado = 0;}
        return Estado;
    }
    private int getGrupo(){
        GrupoJpaController control = new GrupoJpaController(emf);
        List<Grupo> grupos = control.findGrupoEntities();
        String texto = (String) boxGrupo.getSelectedItem();
        long Grupo = 0;
        int contador = 0;
        Grupo x ;
        do{
            x = grupos.get(contador);
            if(texto.equals(x.getNombre())){
                Grupo = x.getId();
            }
        }while(texto.compareTo(texto) != 0);
        return (int)Grupo;
    }
    private void llenarCombos(){
         String[] arr = new String[2];
         arr[0] = "Activo";
         arr[1] = "Inactivo"; 
         boxEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(arr));
         
         GrupoJpaController control = new GrupoJpaController(emf);
         List<Grupo> grupos = control.findGrupoEntities();
         String[] arr2 = new String[grupos.size()];
         for (int i = 0; i < grupos.size(); i++){
             Grupo x = grupos.get(i);
             arr2[i] = x.getNombre();
         }
         boxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(arr2));
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        boxEstatus = new javax.swing.JComboBox<>();
        boxGrupo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre del Alumno:");

        jLabel2.setText("Grupo:");

        jLabel3.setText("Estatus:");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        boxEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(boxGrupo, javax.swing.GroupLayout.Alignment.LEADING, 0, 204, Short.MAX_VALUE)
                        .addComponent(boxEstatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(boxEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarCampos(){
        txtNombre.setText(String.valueOf(Nombre));
        if(getStatus() != 1){boxEstatus.setSelectedItem(0);}
        boxGrupo.setSelectedItem(Aula);
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       String Nombre = txtNombre.getText();
       int IdAula = getGrupo();
       int Estatus = getStatus();
       Alumno alumno = new Alumno(Nombre,IdAula,Estatus);
       AlumnoJpaController objController = new AlumnoJpaController(emf);
       objController.create(alumno);
       this.dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void boxEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEstatusActionPerformed

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
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Editar dialog = new Editar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstatus;
    private javax.swing.JComboBox<String> boxGrupo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
