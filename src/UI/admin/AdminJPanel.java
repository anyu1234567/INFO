/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.admin;

import info5100.assignment4.model.Admin;
import info5100.assignment4.model.Person;
import info5100.assignment4.model.Residence;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author An
 */
public class AdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminJPanel
     */
    Admin admin;
    JPanel userJPanel;


    public AdminJPanel(JPanel UserJPanel, Admin admin) {
        initComponents();
        this.admin =admin;
        this.userJPanel =UserJPanel;
         reFreshPersonTable();
         reFreshPatientTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PersonTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        ViewEncounter = new javax.swing.JButton();
        AddPersonButton = new javax.swing.JButton();
        DeletePersonButton = new javax.swing.JButton();
        ViewPersonDetailButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        AddPatientButton = new javax.swing.JButton();

        jLabel1.setText("Person Directory");

        PersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Residence", "Blood Pressure", "id"
            }
        ));
        jScrollPane1.setViewportView(PersonTable);

        jLabel2.setText("Patient Directory");

        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Residence", "Blood Pressure"
            }
        ));
        jScrollPane3.setViewportView(PatientTable);

        ViewEncounter.setText("View Encounters");
        ViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEncounterActionPerformed(evt);
            }
        });

        AddPersonButton.setText("Add");
        AddPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonButtonActionPerformed(evt);
            }
        });

        DeletePersonButton.setText("Delete");
        DeletePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePersonButtonActionPerformed(evt);
            }
        });

        ViewPersonDetailButton.setText("view Detail");
        ViewPersonDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPersonDetailButtonActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        AddPatientButton.setText("Add");
        AddPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPatientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewEncounter)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddPersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeletePersonButton)
                        .addGap(18, 18, 18)
                        .addComponent(ViewPersonDetailButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddPersonButton)
                    .addComponent(DeletePersonButton)
                    .addComponent(ViewPersonDetailButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddPatientButton)
                        .addComponent(jButton6))
                    .addComponent(ViewEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEncounterActionPerformed
        // TODO add your handling code here:
        int row = PatientTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person person = (Person)PersonTable.getValueAt(row, 0);
        ViewEncounterJPanel viewEncounterJPanel = new ViewEncounterJPanel(userJPanel, person);
        userJPanel.add("AddPersonJPanel",viewEncounterJPanel);
        CardLayout layout = (CardLayout)userJPanel.getLayout();
        layout.next(userJPanel);
    }//GEN-LAST:event_ViewEncounterActionPerformed

    private void AddPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPersonButtonActionPerformed
        // TODO add your handling code here:
        AddPersonJPanel addPersonJPanel = new AddPersonJPanel(userJPanel, admin);
        userJPanel.add("AddPersonJPanel",addPersonJPanel);
        CardLayout layout = (CardLayout)userJPanel.getLayout();
        layout.next(userJPanel);
    }//GEN-LAST:event_AddPersonButtonActionPerformed

    private void DeletePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePersonButtonActionPerformed
        // TODO add your handling code here
        int row = PersonTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person p = (Person)PersonTable.getValueAt(row, 0);
        admin.DeletPerson(p);
        reFreshPersonTable();
    }//GEN-LAST:event_DeletePersonButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void AddPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPatientButtonActionPerformed
        // TODO add your handling code here:
        int row = PersonTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a Person to create Patient!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person p = (Person)PersonTable.getValueAt(row, 0);
        if(admin.isPatient(p)){
            JOptionPane.showMessageDialog(null, "The person is already a patient. Please select other Person", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        AddPatientJPanel addPatientJPanel = new AddPatientJPanel(userJPanel,p, admin);
        userJPanel.add("AddPersonJPanel",addPatientJPanel);
        CardLayout layout = (CardLayout)userJPanel.getLayout();
        layout.next(userJPanel);
        reFreshPatientTable();
    }//GEN-LAST:event_AddPatientButtonActionPerformed

    private void ViewPersonDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPersonDetailButtonActionPerformed
        // TODO add your handling code here:
        int row = PersonTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person p = (Person) PersonTable.getValueAt(row, 0);
        
        ViewPersonDetail vpd = new ViewPersonDetail(userJPanel, p);
        userJPanel.add("ViewProductDetailJPanel", vpd);
        CardLayout layout = (CardLayout) userJPanel.getLayout();
        layout.next(userJPanel);
    }//GEN-LAST:event_ViewPersonDetailButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPatientButton;
    private javax.swing.JButton AddPersonButton;
    private javax.swing.JButton DeletePersonButton;
    private javax.swing.JTable PatientTable;
    private javax.swing.JTable PersonTable;
    private javax.swing.JButton ViewEncounter;
    private javax.swing.JButton ViewPersonDetailButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public void reFreshPersonTable() {
        int rowCount = PersonTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) PersonTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Person p : admin.getPersonDirectory()) {
            Object row[] = new Object[5];
            row[0] = p;
            row[1] = p.getAge();
            Residence residence = p.getResidence();
            row[2] = residence.getHouse()+" "+residence.getCommunity()+", "+residence.getCity();
            row[3] =p.getBloodPressure()+" mmHg";
            row[4] = p.getId();
            model.addRow(row);
        }
        
    }

    public void reFreshPatientTable() {
        int rowCount = PatientTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Person p : admin.getPatientDirectory()) {
            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getAge();
            Residence residence = p.getResidence();
            row[2] = residence.getHouse()+" "+residence.getCommunity()+", "+residence.getCity();
             row[3] =p.getBloodPressure()+" mmHg";
            model.addRow(row);
        }
    }
}
