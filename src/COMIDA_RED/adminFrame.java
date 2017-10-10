
package COMIDA_RED;

import javax.swing.JOptionPane;

/**
 *
 * @author SDiego
 */
public class adminFrame extends javax.swing.JFrame {
    public static Registro registroadmin;
    public static Menus menuadmin;
    
    /**
     * Creates new form adminFrame
     */
    public adminFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        registroadmin = new Registro();
        menuadmin = entFrame.menuent;
        
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tnombre = new javax.swing.JTextField();
        botoningreso = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        botonregreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" ADMINISTRADOR - Restaurante RED, Pedidos Digitales");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Contraseña:");

        tnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnombreActionPerformed(evt);
            }
        });

        botoningreso.setText("Ingresar");
        botoningreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoningresoActionPerformed(evt);
            }
        });

        botonregreso.setText("Regresar");
        botonregreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonregreso)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(botoningreso)
                .addGap(146, 146, 146))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botoningreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonregreso)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tnombreActionPerformed

    private void botoningresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoningresoActionPerformed
        // TODO add your handling code here:
        String nombre = tnombre.getText();
        String contr = contra.getText();
        if(nombre.length()==0||contr.length()==0){
            JOptionPane.showMessageDialog(null, "No deje campos vacios.", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int verif = registroadmin.buscarAdministrador(nombre, contr);
            if(verif == 0){
                JOptionPane.showMessageDialog(null, "El administrador ingresado no existe.", "", JOptionPane.INFORMATION_MESSAGE);
            }else{
                adminFrame2 admin2 = new adminFrame2();
                admin2.setVisible(true);
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido!", "", JOptionPane.PLAIN_MESSAGE);
                adminFrame2.registroadmin2 = registroadmin;
                adminFrame2.menuadmin2 = menuadmin;
                
            }
        }
    }//GEN-LAST:event_botoningresoActionPerformed

    private void botonregresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregresoActionPerformed
        // TODO add your handling code here:
        entFrame ent = new entFrame();
        ent.setVisible(true);
        this.setVisible(false);
        entFrame.registroent = registroadmin;
        entFrame.menuent = menuadmin;
        
    }//GEN-LAST:event_botonregresoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoningreso;
    private javax.swing.JButton botonregreso;
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tnombre;
    // End of variables declaration//GEN-END:variables
}
