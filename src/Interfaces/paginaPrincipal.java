/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.BorderLayout;
import javax.swing.JPanel;



public class paginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form paginaPrincipal
     */
    
    
    public paginaPrincipal() {
        initComponents();
        
        verBDPanel p1 = new verBDPanel();
        p1.setSize(503,634);
        p1.setLocation(0,0);
        
        contentPanel.removeAll();
        contentPanel.add(p1, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenuSeleccionar = new javax.swing.JMenu();
        btnSeleccionarBDMenu = new javax.swing.JMenuItem();
        btnCrearBDMenu = new javax.swing.JMenuItem();
        Tablas = new javax.swing.JMenu();
        editarTabla = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        registrosMenu = new javax.swing.JMenu();
        editarRegistros = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(503, 387));
        setResizable(false);

        contentPanel.setLayout(new java.awt.CardLayout());

        btnMenuSeleccionar.setText("Base de Datos");

        btnSeleccionarBDMenu.setText("Seleccionar BD");
        btnSeleccionarBDMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarBDMenuActionPerformed(evt);
            }
        });
        btnMenuSeleccionar.add(btnSeleccionarBDMenu);

        btnCrearBDMenu.setText("Crear BD");
        btnCrearBDMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearBDMenuActionPerformed(evt);
            }
        });
        btnMenuSeleccionar.add(btnCrearBDMenu);

        jMenuBar1.add(btnMenuSeleccionar);

        Tablas.setText("Tablas");

        editarTabla.setText("Ver Tablas");
        editarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTablaActionPerformed(evt);
            }
        });
        Tablas.add(editarTabla);

        jMenuItem1.setText("Crear Tabla");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Tablas.add(jMenuItem1);

        jMenuBar1.add(Tablas);

        registrosMenu.setText("Registros");

        editarRegistros.setText("Ver Registros");
        editarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarRegistrosActionPerformed(evt);
            }
        });
        registrosMenu.add(editarRegistros);

        jMenuItem2.setText("Crear Registro");
        registrosMenu.add(jMenuItem2);

        jMenuBar1.add(registrosMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTablaActionPerformed
        // TODO add your handling code here:
       verTablasPanel t1 = new verTablasPanel();
        t1.setSize(503,634);
        t1.setLocation(0,0);
        
        contentPanel.removeAll();
        contentPanel.add(t1, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint(); 
        
        
    }//GEN-LAST:event_editarTablaActionPerformed

    private void editarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarRegistrosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_editarRegistrosActionPerformed

    private void btnSeleccionarBDMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarBDMenuActionPerformed
        // TODO add your handling code here:
        verBDPanel s1 = new verBDPanel();
        s1.setSize(503,634);
        s1.setLocation(0,0);
        
        contentPanel.removeAll();
        contentPanel.add(s1, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnSeleccionarBDMenuActionPerformed

    private void btnCrearBDMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearBDMenuActionPerformed
        // TODO add your handling code here:
        crearBaseDPanel s1 = new crearBaseDPanel();
        s1.setSize(503,634);
        s1.setLocation(0,0);
        
        contentPanel.removeAll();
        contentPanel.add(s1, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_btnCrearBDMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         crearTablaPanel s1 = new crearTablaPanel();
        s1.setSize(503,634);
        s1.setLocation(0,0);
        
        contentPanel.removeAll();
        contentPanel.add(s1, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(paginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginaPrincipal().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Tablas;
    private javax.swing.JMenuItem btnCrearBDMenu;
    private javax.swing.JMenu btnMenuSeleccionar;
    private javax.swing.JMenuItem btnSeleccionarBDMenu;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JMenuItem editarRegistros;
    private javax.swing.JMenuItem editarTabla;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu registrosMenu;
    // End of variables declaration//GEN-END:variables
}
