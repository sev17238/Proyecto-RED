
package COMIDA_RED;

import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author SDiego
 */
public class userFrame2 extends javax.swing.JFrame {
    public static Registro registrouser2;
    public static Menus menuuser2;
    public static Usuario cuenta2;
    /**
     * Creates new form userFrame2
     */
    public userFrame2() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        registrouser2 = new Registro();
        menuuser2 = new Menus();
        cuenta2 = new Usuario();
    }
    /**
     * Metodo para colocar la imagen correspondiente de la comida 
     * @param comida el nombre de la comida de la que se quiere obtener el precio y la imagen.
     */
    public void imagenesLabelComida(String comida){        
        labelcomida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesComidas/"+comida+".png")));
        double preciocomida = menuuser2.buscarComida(comida).getPrecio();
        preciocomidas.setText("Q."+preciocomida);
    }
    public void agregarBebidaNueva(String bebida, double precio){
        cboxbebidas.addItem(bebida);
        
    }
    /**
     * Metodo para colocar la imagen correspondiente de la bebida 
     * @param bebida el nombre de la bebida de la que se quiere obtener el precio y la imagen.
     */
    public void imagenesLabelBebida(String bebida){        
        labelbebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBebidas/"+bebida+".png")));
        double preciobebida = menuuser2.buscarBebida(bebida).getPrecio();
        preciobebidas.setText("Q."+preciobebida);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        cboxcomidas = new javax.swing.JComboBox<>();
        labelcomida = new javax.swing.JLabel();
        preciocomidas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cboxbebidas = new javax.swing.JComboBox<>();
        labelbebida = new javax.swing.JLabel();
        preciobebidas = new javax.swing.JLabel();
        botonverordenes = new javax.swing.JButton();
        botonregreso = new javax.swing.JButton();
        bordenarmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Comidas"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxcomidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Porcion mediana de pizza", "Quesoburguesa", "Pie de queso", "Papas con queso y tocino" }));
        cboxcomidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxcomidasActionPerformed(evt);
            }
        });
        jPanel3.add(cboxcomidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 27, 155, -1));

        labelcomida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesComidas/Porcion mediana de pizza.png"))); // NOI18N
        labelcomida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(labelcomida, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 65, 210, 158));

        preciocomidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        preciocomidas.setText("Q.12.0");
        jPanel3.add(preciocomidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 229, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Bebidas"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxbebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seven Up", "Coca Cola", "Rosa de jamaica", "Horchata con canela" }));
        cboxbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxbebidasActionPerformed(evt);
            }
        });
        jPanel4.add(cboxbebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 27, 165, -1));

        labelbebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBebidas/Seven Up.png"))); // NOI18N
        jPanel4.add(labelbebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 65, 208, 158));

        preciobebidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        preciobebidas.setText("Q.6.0");
        jPanel4.add(preciobebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 229, -1, -1));

        botonverordenes.setText("Ver ordenes");
        botonverordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonverordenesActionPerformed(evt);
            }
        });

        botonregreso.setText("Regresar");
        botonregreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregresoActionPerformed(evt);
            }
        });

        bordenarmenu.setText("Ordenar");
        bordenarmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bordenarmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(bordenarmenu))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(botonregreso)
                .addGap(322, 322, 322)
                .addComponent(botonverordenes))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(bordenarmenu)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonregreso)
                    .addComponent(botonverordenes)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxcomidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxcomidasActionPerformed
        // TODO add your handling code here:
        String comida = cboxcomidas.getSelectedItem().toString();
        imagenesLabelComida(comida);
    }//GEN-LAST:event_cboxcomidasActionPerformed

    private void bordenarmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bordenarmenuActionPerformed
        // TODO add your handling code here:
        String comida = cboxcomidas.getSelectedItem().toString();
        String bebida = cboxbebidas.getSelectedItem().toString();
        Comidas pedido = menuuser2.buscarComida(comida);
        Bebidas pedido2 = menuuser2.buscarBebida(bebida);
        registrouser2.meterOrden(cuenta2, pedido,pedido2); //Se le agrega el usuario de la cuenta actual y la comida
                                                   //y bebida que se escogio a una nueva orden que es creada y agregada
                                                   //a la lista de oredenes del registro.
        JOptionPane.showMessageDialog(null, "Usted a ordenado: "+comida+" y "+bebida);
    }//GEN-LAST:event_bordenarmenuActionPerformed

    private void botonverordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonverordenesActionPerformed
        // TODO add your handling code here:
        ordenesFrame ordenes = new ordenesFrame();
        ordenes.jTextArea1.append("Sus ordenes son: ");
        int i = -1;
        Ordenes orden = new Ordenes();
        for(int e = 0; e<registrouser2.getOrdenes().size();e++){
            orden = registrouser2.getOrdenes().get(e);
            if(orden.getUsuario().getContrasena().equals(cuenta2.getContrasena())){
                i = i+1;
                String comida = orden.getComida().getNombreComida();double precioc = orden.getComida().getPrecio();
                String bebida = orden.getBebida().getNombreBebida();double preciob = orden.getBebida().getPrecio();
                double sumaprecios = precioc + preciob;
                ordenes.jTextArea1.append(System.getProperty("line.separator"));
                ordenes.jTextArea1.append(i+".Menu: "+comida+" y "+bebida+", debe pagar: Q."+sumaprecios);
            }
        }
        ordenes.setVisible(true);
        
    }//GEN-LAST:event_botonverordenesActionPerformed

    private void botonregresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregresoActionPerformed
        // TODO add your handling code here:
        userFrame user = new userFrame();
        user.setVisible(true);
        this.setVisible(false);
        user.registrouser = registrouser2;
        user.menuuser = menuuser2;
        user.cuenta = cuenta2;
        user.comboboxuserc = cboxcomidas;
        user.comboboxuserb = cboxbebidas;
    }//GEN-LAST:event_botonregresoActionPerformed

    private void cboxbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxbebidasActionPerformed
        // TODO add your handling code here:
        String bebida = cboxbebidas.getSelectedItem().toString();
        imagenesLabelBebida(bebida);
        
    }//GEN-LAST:event_cboxbebidasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bordenarmenu;
    private javax.swing.JButton botonregreso;
    private javax.swing.JButton botonverordenes;
    public static javax.swing.JComboBox<String> cboxbebidas;
    public static javax.swing.JComboBox<String> cboxcomidas;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelbebida;
    private javax.swing.JLabel labelcomida;
    private javax.swing.JLabel preciobebidas;
    private javax.swing.JLabel preciocomidas;
    // End of variables declaration//GEN-END:variables
}
