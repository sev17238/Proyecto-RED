
package COMIDA_RED;

import javax.swing.JOptionPane;

/**
 *
 * @author SDiego
 */
public final class userFrame2 extends javax.swing.JFrame {
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
        menuuser2 =userFrame.menuuser;
        cuenta2 = new Usuario();
        llenarComboboxes();
        
    }
    public void llenarComboboxes(){
        String[] a=menuuser2.retornarListaBebidas();
        for (String a1 : a) {
            cboxbebidas.addItem(a1);
        }
        String[] b=menuuser2.retornarListaComidas();
        for (String b1 : b) {
            cboxcomidas.addItem(b1);
        }
    }
    /**
     * Metodo para colocar la imagen correspondiente de la comida 
     * @param comida el nombre de la comida de la que se quiere obtener el precio y la imagen.
     */
    public void imagenesLabelComida(String comida){        
        labelcomida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesComidas/"+comida+".png")));
        double preciocomida = menuuser2.buscarProducto(comida).getPrecio();
        lbcomidas.setText("Q."+preciocomida);
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
        double preciobebida = menuuser2.buscarProducto(bebida).getPrecio();
        lbbebidas.setText("Q."+preciobebida);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcomidas = new javax.swing.JPanel();
        cboxcomidas = new javax.swing.JComboBox<>();
        labelcomida = new javax.swing.JLabel();
        lbcomidas = new javax.swing.JLabel();
        chbcomidas = new javax.swing.JCheckBox();
        panelbebidas = new javax.swing.JPanel();
        cboxbebidas = new javax.swing.JComboBox<>();
        labelbebida = new javax.swing.JLabel();
        lbbebidas = new javax.swing.JLabel();
        chbbebidas = new javax.swing.JCheckBox();
        botonverordenes = new javax.swing.JButton();
        botonregreso = new javax.swing.JButton();
        bordenarmenu = new javax.swing.JButton();
        SpinnerMinuto = new javax.swing.JSpinner();
        SpinnerHora = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelpostres = new javax.swing.JPanel();
        cboxpostres = new javax.swing.JComboBox<>();
        labelbebida1 = new javax.swing.JLabel();
        lbpostres = new javax.swing.JLabel();
        chbpostres = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelcomidas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Comidas"));

        cboxcomidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxcomidasActionPerformed(evt);
            }
        });

        labelcomida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesComidas/Porcion mediana de pizza.png"))); // NOI18N
        labelcomida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbcomidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcomidas.setText("Q.12.0");

        chbcomidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbcomidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelcomidasLayout = new javax.swing.GroupLayout(panelcomidas);
        panelcomidas.setLayout(panelcomidasLayout);
        panelcomidasLayout.setHorizontalGroup(
            panelcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcomidasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cboxcomidas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(chbcomidas)
                    .addContainerGap())
                .addGroup(panelcomidasLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(lbcomidas)))
            .addGroup(panelcomidasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelcomida, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelcomidasLayout.setVerticalGroup(
            panelcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcomidasLayout.createSequentialGroup()
                .addGroup(panelcomidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbcomidas)
                    .addComponent(cboxcomidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelcomida, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbcomidas)
                .addContainerGap())
        );

        panelbebidas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Bebidas"));

        cboxbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxbebidasActionPerformed(evt);
            }
        });

        labelbebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesBebidas/Seven Up.png"))); // NOI18N

        lbbebidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbbebidas.setText("Q.6.0");

        chbbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbbebidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelbebidasLayout = new javax.swing.GroupLayout(panelbebidas);
        panelbebidas.setLayout(panelbebidasLayout);
        panelbebidasLayout.setHorizontalGroup(
            panelbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbebidasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cboxbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbbebidas))
            .addGroup(panelbebidasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelbebida, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelbebidasLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lbbebidas))
        );
        panelbebidasLayout.setVerticalGroup(
            panelbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbebidasLayout.createSequentialGroup()
                .addGroup(panelbebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbebidasLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(cboxbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chbbebidas))
                .addGap(18, 18, 18)
                .addComponent(labelbebida, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbbebidas))
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

        SpinnerMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        SpinnerHora.setModel(new javax.swing.SpinnerNumberModel(7, 7, 19, 1));

        jLabel1.setText("Elija la hora y los minutos a los que desea su orden");

        jLabel2.setText("Horas");

        jLabel3.setText("Minutos");

        panelpostres.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Postres"));

        cboxpostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxpostresActionPerformed(evt);
            }
        });

        lbpostres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbpostres.setText("Q.7.5");

        chbpostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbpostresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelpostresLayout = new javax.swing.GroupLayout(panelpostres);
        panelpostres.setLayout(panelpostresLayout);
        panelpostresLayout.setHorizontalGroup(
            panelpostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpostresLayout.createSequentialGroup()
                .addGroup(panelpostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelpostresLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cboxpostres, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbpostres))
                    .addGroup(panelpostresLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lbpostres)))
                .addGap(3, 3, 3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelpostresLayout.createSequentialGroup()
                .addComponent(labelbebida1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelpostresLayout.setVerticalGroup(
            panelpostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpostresLayout.createSequentialGroup()
                .addGroup(panelpostresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelpostresLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(cboxpostres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chbpostres))
                .addGap(18, 18, 18)
                .addComponent(labelbebida1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbpostres))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(botonregreso)
                            .addGap(125, 125, 125)
                            .addComponent(bordenarmenu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonverordenes))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(panelcomidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(panelbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelpostres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpinnerMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelcomidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelpostres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonregreso)
                    .addComponent(botonverordenes)
                    .addComponent(bordenarmenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String postre = cboxpostres.getSelectedItem().toString();
        if(chbcomidas.isSelected() && chbbebidas.isSelected() && chbpostres.isSelected()){
            Producto pedido = menuuser2.buscarProducto(comida);
            Producto pedido2 = menuuser2.buscarProducto(bebida);
            Producto pedido3 = menuuser2.buscarProducto(postre);
            String hora = SpinnerHora.getValue().toString();
            int horai = Integer.parseInt(hora);
            String minuto = SpinnerMinuto.getValue().toString();
            int minutoi = Integer.parseInt(minuto);
            if(horai<10){
                hora = "0"+hora;
            }
            if(minutoi<10){
                minuto = "0"+minuto;
            }
            registrouser2.meterOrden(cuenta2, pedido,hora,minuto); //Se le agrega el usuario de la cuenta actual y la comida
                                                   //y bebida que se escogio a una nueva orden que es creada y agregada
                                                   //a la lista de oredenes del registro. 
            registrouser2.meterOrden(cuenta2, pedido2,hora,minuto);
            registrouser2.meterOrden(cuenta2, pedido3,hora,minuto); 
            JOptionPane.showMessageDialog(null, "Usted a ordenado: "+comida+", "+postre+" y "+bebida);
        }else if(chbcomidas.isSelected() && chbbebidas.isSelected()  /**/&& chbpostres.isSelected()==false){
            
        }else if(chbbebidas.isSelected() && chbpostres.isSelected()  /**/&& chbcomidas.isSelected()==false){
        
        }else if(chbcomidas.isSelected() && chbpostres.isSelected()  /**/&& chbbebidas.isSelected()==false){
        
        }else if(chbcomidas.isSelected() /**/&& chbpostres.isSelected()==false && chbbebidas.isSelected()==false){
        
        }else if(chbpostres.isSelected() /**/&& chbcomidas.isSelected()==false && chbbebidas.isSelected()==false){
        
        }else if(chbbebidas.isSelected() /**/&& chbpostres.isSelected()==false && chbcomidas.isSelected()==false){
        
        }
        
        
    }//GEN-LAST:event_bordenarmenuActionPerformed

    private void botonverordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonverordenesActionPerformed
        // TODO add your handling code here:
        ordenesFrame ordenes = new ordenesFrame();
        ordenesFrame.jTextArea1.append("Sus ordenes son: ");
        int i = -1;
        Ordenes orden = new Ordenes();
        for(int e = 0; e<registrouser2.getOrdenes().size();e++){
            orden = registrouser2.getOrdenes().get(e);
            if(orden.getUsuario().getContrasena().equals(cuenta2.getContrasena())){
                i = i+1;
                String alimento = orden.getProducto().getNombreProducto();double precio = orden.getProducto().getPrecio();                
                String hora = orden.getHora(); String minuto = orden.getMinutos();    
                ordenesFrame.jTextArea1.append(System.getProperty("line.separator"));
                ordenesFrame.jTextArea1.append(i+".Menu: "+alimento+", debe pagar: Q."+precio+", para la siguiente hora: "+hora+":"+minuto);
            }
        }
        ordenes.setVisible(true);
        
    }//GEN-LAST:event_botonverordenesActionPerformed

    private void botonregresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregresoActionPerformed
        // TODO add your handling code here:
        userFrame user = new userFrame();
        user.setVisible(true);
        this.setVisible(false);
        userFrame.registrouser = registrouser2;
        userFrame.menuuser = menuuser2;
        userFrame.cuenta = cuenta2;
    }//GEN-LAST:event_botonregresoActionPerformed

    private void cboxbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxbebidasActionPerformed
        // TODO add your handling code here:
        String bebida = cboxbebidas.getSelectedItem().toString();
        imagenesLabelBebida(bebida);
        
    }//GEN-LAST:event_cboxbebidasActionPerformed

    private void cboxpostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxpostresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxpostresActionPerformed

    private void chbcomidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbcomidasActionPerformed
        // TODO add your handling code here:
        if(chbcomidas.isSelected()){
            cboxcomidas.setEnabled(true);panelcomidas.setEnabled(true);
        }else{
            cboxcomidas.setEnabled(false);panelcomidas.setEnabled(false);
        }
    }//GEN-LAST:event_chbcomidasActionPerformed

    private void chbbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbbebidasActionPerformed
        // TODO add your handling code here:
        if(chbcomidas.isSelected()){
            cboxbebidas.setEnabled(true);panelbebidas.setEnabled(true);
        }else{
            cboxbebidas.setEnabled(false);panelbebidas.setEnabled(false);
        }
    }//GEN-LAST:event_chbbebidasActionPerformed

    private void chbpostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbpostresActionPerformed
        // TODO add your handling code here:
        if(chbcomidas.isSelected()){
            cboxpostres.setEnabled(true);panelpostres.setEnabled(true);
        }else{
            cboxpostres.setEnabled(false);panelpostres.setEnabled(false);
        }
    }//GEN-LAST:event_chbpostresActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerHora;
    private javax.swing.JSpinner SpinnerMinuto;
    private javax.swing.JButton bordenarmenu;
    private javax.swing.JButton botonregreso;
    private javax.swing.JButton botonverordenes;
    public static javax.swing.JComboBox<String> cboxbebidas;
    public static javax.swing.JComboBox<String> cboxcomidas;
    public static javax.swing.JComboBox<String> cboxpostres;
    private javax.swing.JCheckBox chbbebidas;
    private javax.swing.JCheckBox chbcomidas;
    private javax.swing.JCheckBox chbpostres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelbebida;
    private javax.swing.JLabel labelbebida1;
    private javax.swing.JLabel labelcomida;
    private javax.swing.JLabel lbbebidas;
    private javax.swing.JLabel lbcomidas;
    private javax.swing.JLabel lbpostres;
    private javax.swing.JPanel panelbebidas;
    private javax.swing.JPanel panelcomidas;
    private javax.swing.JPanel panelpostres;
    // End of variables declaration//GEN-END:variables
}
