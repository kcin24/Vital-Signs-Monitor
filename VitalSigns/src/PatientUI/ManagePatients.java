/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package PatientUI;

import business.StringCheck;
import business.Patient;
import business.Person;
import business.PersonDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nickk
 */
public class ManagePatients extends javax.swing.JPanel {
    
    /**
     * Creates new form managePatientsJJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcess;
    
    public ManagePatients(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        this.userProcess = userProcessContainer;
        this.personDirectory= personDirectory;
        ArrayList<Person> personList = personDirectory.getPersonHistory();
        populatePatientsTable(personList);
        InputVerifier stringVerifier = new StringCheck();
        searchBoxJTextField.setInputVerifier(stringVerifier);
    }
    
    private void populatePatientsTable(ArrayList<Person> personList) {
        DefaultTableModel model = (DefaultTableModel) viewPersonsJTable.getModel();
        model.setRowCount(0);
        if(personList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Persons found. Please add Persons",
                    "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personList) {
            Object[] row = new Object[3];
            row[0] = person;
            row[1]= person.getAge();
            if(person.getPatient()!=null)
            {
                row[2] = person.getPatient().getPatientID();
            }
            else
            {
                row[2] = "Patient Not Created";
            }
            
            model.addRow(row);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editPatientJButton = new javax.swing.JButton();
        viewPatientJButton = new javax.swing.JButton();
        deletePatientJButton = new javax.swing.JButton();
        searchBoxJTextField = new javax.swing.JTextField();
        searchPatientJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        createPatientJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        viewPersonsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Patient ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewPersonsJTable);
        if (viewPersonsJTable.getColumnModel().getColumnCount() > 0) {
            viewPersonsJTable.getColumnModel().getColumn(0).setResizable(false);
            viewPersonsJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Patients");

        editPatientJButton.setText("Edit");
        editPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientJButtonActionPerformed(evt);
            }
        });

        viewPatientJButton.setText("View");
        viewPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientJButtonActionPerformed(evt);
            }
        });

        deletePatientJButton.setText("Delete");
        deletePatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientJButtonActionPerformed(evt);
            }
        });

        searchBoxJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxJTextFieldActionPerformed(evt);
            }
        });

        searchPatientJButton.setText("Search Patient");
        searchPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        createPatientJButton.setText("Create");
        createPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(createPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletePatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchPatientJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchPatientJButton)
                            .addComponent(searchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(refreshJButton)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(364, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*pass userProcess and Patient*/
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            ModifyPatient vupdJPanel=
                    new ModifyPatient(userProcess, patient,Boolean.FALSE);
            userProcess.add("vupdJPanel", vupdJPanel);
            CardLayout layout=(CardLayout) userProcess.getLayout();
            layout.next(userProcess);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, "
                    + "Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_viewPatientJButtonActionPerformed

    private void editPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*pass userProcess and Patient*/
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            ModifyPatient vupdJPanel=
                    new ModifyPatient(userProcess, patient,Boolean.TRUE);
            userProcess.add("vupdJPanel", vupdJPanel);
            CardLayout layout=(CardLayout) userProcess.getLayout();
            layout.next(userProcess);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, "
                    + "Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editPatientJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcess.remove(this);
        CardLayout layout = (CardLayout) userProcess.getLayout();
        layout.previous(userProcess);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deletePatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        Patient patient=person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created. Cannot delete",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*Ask confirmation*/
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            person.setPatient(null);
            populatePatientsTable(personDirectory.getPersonHistory());
        }
    }//GEN-LAST:event_deletePatientJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        searchBoxJTextField.setText("");
        populatePatientsTable(personDirectory.getPersonHistory());
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void searchPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientJButtonActionPerformed
        // TODO add your handling code here:
        String key= searchBoxJTextField.getText().trim();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPatients;
        searchPatients=personDirectory.searchPatient(key);
        populatePatientsTable(searchPatients);
    }//GEN-LAST:event_searchPatientJButtonActionPerformed

    private void createPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        if(person.getPatient()!=null)
        {
            JOptionPane.showMessageDialog(this, "Paient already exists.","Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        CreatePatient cpJPanel= new CreatePatient(userProcess, person);
        userProcess.add("cpJPanel", cpJPanel);
        CardLayout layout=(CardLayout) userProcess.getLayout();
        layout.next(userProcess);
    }//GEN-LAST:event_createPatientJButtonActionPerformed

    private void searchBoxJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxJTextFieldActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createPatientJButton;
    private javax.swing.JButton deletePatientJButton;
    private javax.swing.JButton editPatientJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField searchBoxJTextField;
    private javax.swing.JButton searchPatientJButton;
    private javax.swing.JButton viewPatientJButton;
    private javax.swing.JTable viewPersonsJTable;
    // End of variables declaration//GEN-END:variables
}
