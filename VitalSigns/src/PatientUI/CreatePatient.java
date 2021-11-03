/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package PatientUI;

import business.StringCheck;
import business.Patient;
import business.Person;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nickk
 */
public class CreatePatient extends javax.swing.JPanel {
    
    /**
     * Creates new form CreatePatient
     */
    private Person person;
    private JPanel userProcess;
    
    public CreatePatient(JPanel upc, Person person) {
        initComponents();
        this.userProcess = upc;
        this.person=person;
        addVerifiers();
    }
    
    private void addVerifiers() {
        InputVerifier stringVerifier = new StringCheck();
        patientIDJTextField.setInputVerifier(stringVerifier);
        primaryDocNameJTextField.setInputVerifier(stringVerifier);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        primaryDocNameJTextField = new javax.swing.JTextField();
        addPatientJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientIDJLabel = new javax.swing.JLabel();
        primaryDocNameJLabel = new javax.swing.JLabel();
        patientIDJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        primaryDocNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        primaryDocNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primaryDocNameJTextFieldActionPerformed(evt);
            }
        });

        addPatientJButton.setText("Add Patient");
        addPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Details");

        patientIDJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patientIDJLabel.setText("Patient ID");

        primaryDocNameJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        primaryDocNameJLabel.setText("Consulting Doctor's Name");

        patientIDJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patientIDJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDJTextFieldActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(addPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(primaryDocNameJLabel)
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(primaryDocNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(patientIDJLabel))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDJLabel)
                    .addComponent(patientIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primaryDocNameJLabel)
                    .addComponent(primaryDocNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(402, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientJButtonActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput())
        {
            Patient patient = new Patient();
            patient.setPatientID(patientIDJTextField.getText());
            patient.setPrimaryDoctorName(primaryDocNameJTextField.getText());
            
            //Adding Patient to Person
            person.setPatient(patient);
            JOptionPane.showMessageDialog(this, "Patient added!!", "Update", 
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPatientJButtonActionPerformed
    private void clearFields()
    {
        patientIDJTextField.setText("");
        primaryDocNameJTextField.setText("");
        
    }
    private Boolean checkBlankInput()
    {
        if(patientIDJTextField.getText().length()==0
                ||primaryDocNameJTextField.getText().length()==0)
        {
            return false;
        }
        else{
            return true;
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcess.remove(this);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.previous(userProcess);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void patientIDJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDJTextFieldActionPerformed

    private void primaryDocNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primaryDocNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primaryDocNameJTextFieldActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientIDJLabel;
    private javax.swing.JTextField patientIDJTextField;
    private javax.swing.JLabel primaryDocNameJLabel;
    private javax.swing.JTextField primaryDocNameJTextField;
    // End of variables declaration//GEN-END:variables
}
