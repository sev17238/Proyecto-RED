
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
    public static Usuario cuenta3;
    /**
     * Creates new form userFrame2
     */
    public userFrame2() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        registrouser2 = new Registro();
        menuuser2 =userFrame.menuuser;
        cuenta2 = new Usuario();
        cuenta3= new Usuario();
        llenarComboboxes();
        
    }
    public void llenarComboboxes(){
        String[] a=menuuser2.retornarListaBebidas();
        for (int i = 0; i < a.length; i++) {
            cboxbebidas.addItem(a[i]);
        }
        String[] b=menuuser2.retornarListaComidas();
        for (int i = 0; i < b.length; i++) {
            cboxcomidas.addItem(b[i]);
        }
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
        SpinnerMinuto = new javax.swing.JSpinner();
        SpinnerHora = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Comidas"));

        cboxcomidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxcomidasActionPerformed(evt);
            }
        });

        labelcomida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesComidas/Porcion mediana de pizza.png"))); // NOI18N
        labelcomida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        preciocomidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        preciocomidas.setText("Q.12.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cboxcomidas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelcomida, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(preciocomidas))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cboxcomidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelcomida, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(preciocomidas))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Bebidas"));

        cboxbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxbebidasActionPerformed(evt);
            }
        });

        labelbebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBebidas/Seven Up.png"))); // NOI18N

        preciobebidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        preciobebidas.setText("Q.6.0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cboxbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelbebida, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(preciobebidas))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cboxbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelbebida, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(preciobebidas))
        );

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

        jLabel1.setText("Elija la hora y los minutos a los que desea su orden");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonregreso)
                        .addGap(125, 125, 125)
                        .addComponent(bordenarmenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonverordenes))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(SpinnerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(SpinnerMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel1)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonregreso)
                    .addComponent(botonverordenes)
                    .addComponent(bordenarmenu))
                .addContainerGap(12, Short.MAX_VALUE))
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
    private javax.swing.JSpinner SpinnerHora;
    private javax.swing.JSpinner SpinnerMinuto;
    private javax.swing.JButton bordenarmenu;
    private javax.swing.JButton botonregreso;
    private javax.swing.JButton botonverordenes;
    public static javax.swing.JComboBox<String> cboxbebidas;
    public static javax.swing.JComboBox<String> cboxcomidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelbebida;
    private javax.swing.JLabel labelcomida;
    private javax.swing.JLabel preciobebidas;
    private javax.swing.JLabel preciocomidas;
    // End of variables declaration//GEN-END:variables
}
