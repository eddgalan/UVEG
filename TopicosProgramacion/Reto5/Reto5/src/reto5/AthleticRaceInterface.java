/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reto5;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author eddga
 */
public class AthleticRaceInterface extends javax.swing.JFrame implements Messenger{
    ArrayList<Runner> runners;
    
    /**
     * Creates new form AthleticRaceInterface
     */
    public AthleticRaceInterface() {
        this.runners = new ArrayList<Runner>();
        initComponents();
    }
    
    @Override
    public void getMessage(String mensaje){
        txt_results.append(mensaje);
    }
    
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void showRegistered() {
        txt_registered.setText("");
        for (int i = 0; i < this.runners.size(); i++) {
            String line = (i +1) + ".- " + this.runners.get(i).getName() + "\n";
            txt_registered.setText(txt_registered.getText() + line);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_register_name = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_registered = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_results = new javax.swing.JTextArea();
        btn_start = new javax.swing.JButton();
        btn_restart = new javax.swing.JButton();
        btn_finish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrar corredor");

        txt_register_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btn_register.setText("Registar");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        jLabel2.setText("Corredores registrados");

        txt_registered.setEditable(false);
        txt_registered.setColumns(20);
        txt_registered.setRows(5);
        txt_registered.setEnabled(false);
        jScrollPane1.setViewportView(txt_registered);

        jLabel3.setText("Resultados");

        txt_results.setColumns(20);
        txt_results.setRows(5);
        txt_results.setEnabled(false);
        jScrollPane2.setViewportView(txt_results);

        btn_start.setText("Iniciar");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        btn_restart.setText("Reiniciar");

        btn_finish.setText("Terminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_register_name, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_start)
                            .addComponent(btn_restart)
                            .addComponent(btn_finish))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_register_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_start)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_restart)
                        .addGap(8, 8, 8)
                        .addComponent(btn_finish)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        String name = txt_register_name.getText();
        txt_register_name.setText("");
        if( name != "" ) {
            if( this.runners.size() < 5 ) {
                Runner newRunner = new Runner(name);
                this.runners.add(newRunner);
                this.showRegistered();
            } else {
                JOptionPane.showMessageDialog(null, "No es posible agregar más corredores");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Inserte el nombre del corredor");
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        txt_results.setText("");
        if( this.runners.size() == 5 ) {
            ThreadRunner runner1 = new ThreadRunner(this.runners.get(0), this);
            ThreadRunner runner2 = new ThreadRunner(this.runners.get(1), this);
            ThreadRunner runner3 = new ThreadRunner(this.runners.get(2), this);
            ThreadRunner runner4 = new ThreadRunner(this.runners.get(3), this);
            ThreadRunner runner5 = new ThreadRunner(this.runners.get(4), this);
            
            runner1.start();
            runner2.start();
            runner3.start();
            runner4.start();
            runner5.start();
            
            txt_results.append(runner1.toString());
            txt_results.append(runner2.toString());
            txt_results.append(runner3.toString());
            txt_results.append(runner4.toString());
            txt_results.append(runner5.toString());
            
        } else {
            JOptionPane.showMessageDialog(null, "No se han registrado los 5 corredores");
        }
    }//GEN-LAST:event_btn_startActionPerformed

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
            java.util.logging.Logger.getLogger(AthleticRaceInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AthleticRaceInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AthleticRaceInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AthleticRaceInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AthleticRaceInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_finish;
    private javax.swing.JButton btn_register;
    private javax.swing.JButton btn_restart;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_register_name;
    private javax.swing.JTextArea txt_registered;
    private javax.swing.JTextArea txt_results;
    // End of variables declaration//GEN-END:variables
}