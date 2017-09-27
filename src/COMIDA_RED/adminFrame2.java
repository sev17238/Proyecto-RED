
package COMIDA_RED;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author SDiego
 */
public class adminFrame2 extends javax.swing.JFrame {
    public static Registro registroadmin2;
    public static Menus menuadmin2;
    public static JComboBox<String> comboboxadmin2c;
    public static JComboBox<String> comboboxadmin2b;
    public String bebidaNueva;
    public double precioNuevo;
    /**
     * Creates new form adminFrame2
     */
    public adminFrame2() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        registroadmin2 = new Registro();
        menuadmin2 = adminFrame.menuadmin;
        comboboxadmin2c = new JComboBox();
        comboboxadmin2b = new JComboBox();
        bebidaNueva="";
        precioNuevo=0;
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
        cboxcomida1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bnewcomida = new javax.swing.JButton();
        tpreciocomida = new javax.swing.JTextField();
        cboxbebida1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tpreciobebida = new javax.swing.JTextField();
        bnewbebida = new javax.swing.JButton();
        botonordenes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldOrdenABorrar = new javax.swing.JTextField();
        botonregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuenta de AdministradorRED - Restaurante RED, Pedidos Digitales");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Agregue una comida o bebida"));

        cboxcomida1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dona de chocolate", "Hut Dog", "Pollo empanizado", "Dobladas con carne", "Alitas con salsa barbacoa" }));
        cboxcomida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxcomida1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Precio de la comida:");

        bnewcomida.setText("Agregar comida");
        bnewcomida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnewcomidaActionPerformed(evt);
            }
        });

        cboxbebida1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sprite", "Fanta", "Jugo de naranja", "Jugo de tamarindo", " " }));
        cboxbebida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxbebida1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio de la bebida:");

        bnewbebida.setText("Agregar bebida");
        bnewbebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnewbebidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tpreciobebida, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bnewbebida)
                    .addComponent(cboxbebida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tpreciocomida, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboxcomida1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnewcomida, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxcomida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxbebida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpreciocomida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(tpreciobebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnewcomida)
                    .addComponent(bnewbebida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonordenes.setText("Revisar Ordenes");
        botonordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonordenesActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Borrar ordenes"));

        jLabel2.setText("Escriba el numero de orden que desea borrar: ");

        jButton3.setText("Borrar orden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("** Para ver el numero de orden, presione el boton para revisar ordenes.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldOrdenABorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldOrdenABorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        botonregresar.setText("Regresar");
        botonregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonregresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonordenes))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonordenes)
                    .addComponent(botonregresar))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregresarActionPerformed
        // TODO add your handling code here:
        adminFrame admin = new adminFrame();
        admin.setVisible(true);
        this.setVisible(false);
        admin.registroadmin = registroadmin2;
        admin.menuadmin = menuadmin2;
        admin.comboboxadminc = comboboxadmin2c;
        admin.comboboxadminb = comboboxadmin2b;
    }//GEN-LAST:event_botonregresarActionPerformed

    private void botonordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonordenesActionPerformed
        // TODO add your handling code here:
        ordenesFrame ordenes = new ordenesFrame();
        ordenes.jTextArea1.append("Las ordenes son: ");
        int i = -1;
        Ordenes orden = new Ordenes();
        for(int e = 0; e<registroadmin2.getOrdenes().size();e++){
            orden = registroadmin2.getOrdenes().get(e);
            i = i+1;
            String comida = orden.getComida().getNombreComida();double precioc = orden.getComida().getPrecio();
            String bebida = orden.getBebida().getNombreBebida();double preciob = orden.getBebida().getPrecio();
            String user = orden.getUsuario().getNombre();String carnet = orden.getUsuario().getCarnet();
            String hora = orden.getHora(); String minuto = orden.getMinutos();
            double sumaprecios = precioc + preciob;
            ordenes.jTextArea1.append(System.getProperty("line.separator"));
            ordenes.jTextArea1.append(i+".Usuario: "+user+" Carnet: "+carnet+", pidio el menu: "+comida+" (Q."+precioc+") y "+bebida+" (Q."+preciob+"), con precio total de: Q."+sumaprecios+", para la siguiente hora: "+hora+":"+minuto);
        }
        ordenes.setVisible(true);
    }//GEN-LAST:event_botonordenesActionPerformed

    private void cboxbebida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxbebida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxbebida1ActionPerformed

    private void cboxcomida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxcomida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxcomida1ActionPerformed

    private void bnewbebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnewbebidaActionPerformed
        // TODO add your handling code here:
        String precio = tpreciobebida.getText();
        if(precio.length()==0){
            JOptionPane.showMessageDialog(null, "No deje campos vacios.", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            double preciodb = Double.parseDouble(precio);
            String bebida = cboxbebida1.getSelectedItem().toString();
            menuadmin2.agregarBebidas(bebida, preciodb);
            comboboxadmin2b.addItem(bebida);
            menuadmin2.agregarBebidas(bebida, preciodb);
            tpreciobebida.setText("");
            JOptionPane.showMessageDialog(null, "Bebida agregada con exito");
        }
    }//GEN-LAST:event_bnewbebidaActionPerformed

    private void bnewcomidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnewcomidaActionPerformed
        // TODO add your handling code here:
        String precio = tpreciocomida.getText();
        if(precio.length()==0){
            JOptionPane.showMessageDialog(null, "No deje campos vacios.", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            double preciodb = Double.parseDouble(precio);
            String comida = cboxcomida1.getSelectedItem().toString();
            menuadmin2.agregarComidas(comida, preciodb);            
            comboboxadmin2c.addItem(comida);
            tpreciocomida.setText("");
            JOptionPane.showMessageDialog(null, "Comida agregada");
        }
    }//GEN-LAST:event_bnewcomidaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ordenesFrame ordenes = new ordenesFrame();
        int i = -1;
        int oab=0;
        Ordenes orden = new Ordenes();
        try {
            oab=Integer.parseInt(jTextFieldOrdenABorrar.getText());
            registroadmin2.borrarOrden(oab);
            JOptionPane.showMessageDialog(null, "Orden Borrada");
            jTextFieldOrdenABorrar.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero de orden valido.");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnewbebida;
    private javax.swing.JButton bnewcomida;
    private javax.swing.JButton botonordenes;
    private javax.swing.JButton botonregresar;
    private javax.swing.JComboBox<String> cboxbebida1;
    private javax.swing.JComboBox<String> cboxcomida1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldOrdenABorrar;
    private javax.swing.JTextField tpreciobebida;
    private javax.swing.JTextField tpreciocomida;
    // End of variables declaration//GEN-END:variables
}
