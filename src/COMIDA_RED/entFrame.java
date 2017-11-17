
package COMIDA_RED;

import javax.swing.JOptionPane;

/**
 *
 * @author SDiego
 */
public final class entFrame extends javax.swing.JFrame {
    //public static Registro registroent; //La variable se declara "publica" y "de clase" para poder ser compartida
    //public static Menus menuent;        //entre los diferentes JFrames creados.
    public static BaseDatosRED DBRED;
    /**
     * Creates new form entFrame
     */
    public entFrame() {
        initComponents();
        this.setLocationRelativeTo(null); //El frame de entrada se localiza justamente en el centro de la pantalla. 
        
        //registroent = new Registro();
        //menuent = new Menus();
        DBRED = new BaseDatosRED();
                
        //menusIniciales();
        DBRED.recuperarProductos();
        DBRED.recuperarUsersOrdenes();
    }
    /**
     * Metodo que inicializa cuatro comidas en el menu del restaurante.
     */
    public void menusIniciales(){
        DBRED.getMenuRED().agregarProducto("Comida","Porcion mediana de pizza", 12.00);
        DBRED.getMenuRED().agregarProducto("Comida","Quesoburguesa", 11.00);
        DBRED.getMenuRED().agregarProducto("Comida","Hut Dog", 8.00);
        DBRED.getMenuRED().agregarProducto("Comida","Papas con queso y tocino", 15.00);
        
        DBRED.getMenuRED().agregarProducto("Bebida","Seven Up", 6.00);
        DBRED.getMenuRED().agregarProducto("Bebida","Rosa de jamaica", 9.00);
        DBRED.getMenuRED().agregarProducto("Bebida","Horchata con canela", 8.00);
        DBRED.getMenuRED().agregarProducto("Bebida","Coca Cola", 7.00);  
        
        DBRED.getMenuRED().agregarProducto("Postre","Dona de chocolate", 5.00);  
        DBRED.getMenuRED().agregarProducto("Postre","Pie de queso", 7.50);  
        
    }
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbotonuser = new javax.swing.JRadioButton();
        rbotonadmin = new javax.swing.JRadioButton();
        botoningreso = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante RED, Pedidos Digitales");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Bienvenido!!");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Elija una opcion porfavor:");

        buttonGroup1.add(rbotonuser);
        rbotonuser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbotonuser.setForeground(new java.awt.Color(0, 0, 204));
        rbotonuser.setText("Ingresar como Usuario");
        rbotonuser.setOpaque(false);
        rbotonuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbotonuserActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbotonadmin);
        rbotonadmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbotonadmin.setForeground(new java.awt.Color(0, 0, 255));
        rbotonadmin.setText("Ingresar como Administrador");
        rbotonadmin.setOpaque(false);

        botoningreso.setBackground(new java.awt.Color(255, 204, 51));
        botoningreso.setText("Ingresar");
        botoningreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoningresoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botoningreso)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbotonuser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbotonadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbotonuser)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addComponent(rbotonadmin)
                .addGap(7, 7, 7)
                .addComponent(botoningreso))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 380, 151));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFondos/comida-chatarra.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 410, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbotonuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbotonuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbotonuserActionPerformed

    private void botoningresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoningresoActionPerformed
        // TODO add your handling code here:
        if (rbotonuser.isSelected()||rbotonadmin.isSelected()){
            if(rbotonuser.isSelected()){
                userFrame user = new userFrame(); //Se crea un objeto tipo userFrame "frame del usuario" 
                user.setVisible(true);            //y se vuelve visible.
                this.setVisible(false);           //Se oculta el frame en el que estamos actualmente.
                userFrame.DBREDuser = DBRED;
                
            }else if(rbotonadmin.isSelected()){
                adminFrame admin = new adminFrame();
                admin.setVisible(true);
                this.setVisible(false);               
                adminFrame.DBREDadmin = DBRED;
               
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe de eligir al menos una opcion!", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botoningresoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DBRED.cerrarDB();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(entFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new entFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoningreso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbotonadmin;
    private javax.swing.JRadioButton rbotonuser;
    // End of variables declaration//GEN-END:variables
}
