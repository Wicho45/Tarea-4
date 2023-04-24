package tarea4;

import javax.swing.JOptionPane;

public class ventana extends javax.swing.JFrame {

    private int datos[] = new int[10];
    private int indice = 0;
    
    public ventana() {
        initComponents();
        
        this.setTitle("Tarea 4");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenida = new javax.swing.JLabel();
        ingreso = new javax.swing.JTextField();
        ingresar_btn = new javax.swing.JButton();
        ordenamiento_btn = new javax.swing.JButton();
        texto2 = new javax.swing.JLabel();
        OrdenamientoMenor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bienvenida.setText("Bienvenido");

        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });

        ingresar_btn.setText("Ingresar");
        ingresar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_btnActionPerformed(evt);
            }
        });

        ordenamiento_btn.setText("Mayor a menor");
        ordenamiento_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenamiento_btnActionPerformed(evt);
            }
        });

        texto2.setText("Ingrese diez numeros aleatorios de 1-100");

        OrdenamientoMenor.setText("Menor a Mayor");
        OrdenamientoMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenamientoMenorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(bienvenida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(ingresar_btn)
                        .addGap(37, 232, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OrdenamientoMenor, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(ordenamiento_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(bienvenida)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto2)
                    .addComponent(ordenamiento_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresar_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrdenamientoMenor)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_btnActionPerformed
        System.out.println(ingreso.getText());
        if (indice < datos.length) {
            String texto = ingreso.getText();
            int numero = Integer.parseInt(texto);
            datos[indice] = numero;
            indice++;
        } else {
            JOptionPane.showMessageDialog(ingresar_btn, "Cantidad maxima de numeros alcanzada");
        }
        ingreso.setText("");
    }//GEN-LAST:event_ingresar_btnActionPerformed

    private void ordenamiento_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenamiento_btnActionPerformed
            if (indice == datos.length) {
        for (int i = 0; i < datos.length - 1; i++) {
            for (int j = 0; j < datos.length - i - 1; j++) {
                if (datos[j] < datos[j+1]) {
                    int temp = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = temp;
                }
            }
        }

        String mensaje = "El ordenamiento es ";
        for (int i = 0; i < datos.length; i++) {
            mensaje += datos[i] + " ";
        }
        JOptionPane.showMessageDialog(ordenamiento_btn, mensaje);  
    } else {
        JOptionPane.showMessageDialog(ordenamiento_btn, "Debe ingresar " + (datos.length - indice) + " numeros mas.");
    }
    }//GEN-LAST:event_ordenamiento_btnActionPerformed

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoActionPerformed
        
    }//GEN-LAST:event_ingresoActionPerformed

    private void OrdenamientoMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenamientoMenorActionPerformed
            if (indice == datos.length) {
        for (int i = 0; i < datos.length - 1; i++) {
            for (int j = 0; j < datos.length - i - 1; j++) {
                if (datos[j] > datos[j+1]) {
                    int temp = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = temp;
                }
            }
        }

        String mensaje = "El ordenamiento es ";
        for (int i = 0; i < datos.length; i++) {
            mensaje += datos[i] + " ";
        }
        JOptionPane.showMessageDialog(ordenamiento_btn, mensaje);  
    } else {
        JOptionPane.showMessageDialog(ordenamiento_btn, "Debe ingresar " + (datos.length - indice) + " numeros mas.");
    } 
    }//GEN-LAST:event_OrdenamientoMenorActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OrdenamientoMenor;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JButton ingresar_btn;
    private javax.swing.JTextField ingreso;
    private javax.swing.JButton ordenamiento_btn;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
