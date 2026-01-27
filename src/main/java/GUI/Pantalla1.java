/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.mycompany.systembank.CuentaBancaria;


public class Pantalla1 extends javax.swing.JFrame {

    CuentaBancaria miCuenta;
    
    public Pantalla1() {
        initComponents();
    miCuenta = new CuentaBancaria("001", "MARIA LOPEZ");
    jLabel2.setText("saldo: "+miCuenta.getSaldo());
    jLabel1.setText("HOLA:  "+miCuenta.getNombreTitular());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtondepo = new javax.swing.JButton();
        texthistorial = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        jButtontransferir = new javax.swing.JButton();
        jButtonretirar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("jLabel2");

        jLabel1.setText("jLabel1");

        jButtondepo.setText("DEPOSITAR");
        jButtondepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondepoActionPerformed(evt);
            }
        });

        texthistorial.setEditable(false);

        jLabel3.setText("Historial Transacciones");

        jButtontransferir.setText("TRANSFERIR");
        jButtontransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontransferirActionPerformed(evt);
            }
        });

        jButtonretirar.setText("RETIRAR");
        jButtonretirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonretirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonretirar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButtontransferir, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(jButtondepo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(texthistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texthistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButtondepo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtontransferir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonretirar)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtondepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondepoActionPerformed
     
    String entrada = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el monto a depositar: ");

    //  Verifica que el usuario no haya cerrado la ventana o dejado el campo vacío
    if (entrada != null && !entrada.isEmpty()) {
        try {
            // Convierte el texto a número
            double monto = Double.parseDouble(entrada);
            
            
            miCuenta.depositar(monto);
            
            
            jLabel2.setText("saldo: " + miCuenta.getSaldo());
            
            
            javax.swing.JOptionPane.showMessageDialog(this, "¡Depósito acreditado correctamente!");
            actualizarHistorialVisual();
            
        } 
        catch (NumberFormatException e) {
            
            javax.swing.JOptionPane.showMessageDialog(this, "Error: Ingrese un monto numérico válido.");
        }
    }
    }//GEN-LAST:event_jButtondepoActionPerformed

    private void jButtontransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontransferirActionPerformed
        
    String nombreDestino = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el nombre del destinatario:");
    String numerodeCuenta= javax.swing.JOptionPane.showInputDialog(this, "Ingrese el numero de cuenta:");
    
    if (nombreDestino != null && !nombreDestino.isEmpty()) {
    
   
        String entrada = javax.swing.JOptionPane.showInputDialog(this, "Transferir a "+nombreDestino);
       
        if (entrada != null && !entrada.isEmpty()) {
        try {
            double Cantidad = Double.parseDouble(entrada);
            if (Cantidad > miCuenta.getSaldo()){
            javax.swing.JOptionPane.showMessageDialog(this, "ERROR: Saldo insuficiente.\nTu saldo actual es: $" + miCuenta.getSaldo(), "Error de Retiro", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            else{
              CuentaBancaria c2 = new CuentaBancaria(numerodeCuenta, nombreDestino); 
                
                
                miCuenta.Transferir(Cantidad, c2); 
                
                //  Actualiza el saldo en la pantalla
                jLabel2.setText("saldo: " + miCuenta.getSaldo());
                
                
                actualizarHistorialVisual(); 
                
                javax.swing.JOptionPane.showMessageDialog(this, "¡Transferencia enviada con éxito!");
            }
         }
         
         
        catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: Monto inválido.");
        }
      }}
    }//GEN-LAST:event_jButtontransferirActionPerformed

    private void jButtonretirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonretirarActionPerformed
        String entrada = javax.swing.JOptionPane.showInputDialog(this, "Ingrese el monto a retirar:");

    //  Verifica que no sea nulo o esté vacío
    if (entrada != null && !entrada.isEmpty()) {
        try {
            // Convierte el texto a número
            double Cantidad = Double.parseDouble(entrada);
            if (Cantidad > miCuenta.getSaldo()) {
                javax.swing.JOptionPane.showMessageDialog(this, "ERROR: Saldo insuficiente.\nTu saldo actual es: $" + miCuenta.getSaldo(), "Error de Retiro", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                miCuenta.retirar(Cantidad);
                jLabel2.setText("saldo: " + miCuenta.getSaldo());
                javax.swing.JOptionPane.showMessageDialog(this, "Retiro exitoso.");
                javax.swing.JOptionPane.showMessageDialog(this, "Operación procesada.");
                actualizarHistorialVisual();
            }
            
            //Actualiza el saldo visual en la etiqueta
            jLabel2.setText("saldo: " + miCuenta.getSaldo());
            
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: Ingrese un monto válido.");
        }
    }
    
  
    }//GEN-LAST:event_jButtonretirarActionPerformed

 private void actualizarHistorialVisual() {
    //  Limpia el texto que haya en el cuadro de la pantalla
    texthistorial.setText(""); 
    
    //  Pide la lista a la cuenta y la recorremos
    for (Object t : miCuenta.getListaTransacciones()) {
        // 3. Vamos agregando cada transacción al cuadro de texto
        texthistorial.append(t.toString() + "\n");
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtondepo;
    private javax.swing.JButton jButtonretirar;
    private javax.swing.JButton jButtontransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextArea texthistorial;
    // End of variables declaration//GEN-END:variables
}
