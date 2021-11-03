/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package userInteface;

import PatientUI.AdminArea;
import business.PersonDirectory;
import java.awt.CardLayout;
import PersonUI.ManagePerson;

/**
 *
 * @author akshay
 */
public class MainJFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form MainJFrame
     */
    private PersonDirectory personDirectory;
    public MainJFrame() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        personDirectory= new PersonDirectory();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        patientManagerJButton = new javax.swing.JButton();
        managePersonsJButton = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));

        jSplitPane1.setMinimumSize(new java.awt.Dimension(700, 700));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(700, 700));

        leftJPanel.setBackground(new java.awt.Color(255, 204, 204));
        leftJPanel.setMinimumSize(new java.awt.Dimension(200, 700));
        leftJPanel.setPreferredSize(new java.awt.Dimension(200, 700));

        patientManagerJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patientManagerJButton.setText("Manage Patients");
        patientManagerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientManagerJButtonActionPerformed(evt);
            }
        });

        managePersonsJButton.setBackground(new java.awt.Color(255, 255, 255));
        managePersonsJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managePersonsJButton.setText("Manage Person");
        managePersonsJButton.setPreferredSize(new java.awt.Dimension(911, 809));
        managePersonsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(managePersonsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(patientManagerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managePersonsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(patientManagerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(466, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftJPanel);

        userProcessContainer.setBackground(new java.awt.Color(255, 204, 204));
        userProcessContainer.setMinimumSize(new java.awt.Dimension(500, 700));
        userProcessContainer.setPreferredSize(new java.awt.Dimension(500, 700));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\nickk\\Downloads\\doct.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        userProcessContainer.add(jLabel2, "card2");

        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientManagerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientManagerJButtonActionPerformed
        // TODO add your handling code here:
        AdminArea pmwaJPanel=
                new AdminArea(userProcessContainer, personDirectory);
        userProcessContainer.add("pmwaJPanel", pmwaJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_patientManagerJButtonActionPerformed

    private void managePersonsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonsJButtonActionPerformed
        // TODO add your handling code here:
        ManagePerson mpJPanel= 
                new ManagePerson(userProcessContainer, personDirectory);
        userProcessContainer.add("mpJPanel", mpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePersonsJButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JButton managePersonsJButton;
    private javax.swing.JButton patientManagerJButton;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
