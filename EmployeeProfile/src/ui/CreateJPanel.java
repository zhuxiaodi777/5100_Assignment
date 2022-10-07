/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.EmployeeProfileHistory;
import model.EmployeeProfile;

/**
 *
 * @author judy
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeProfileHistory history;
    
    public CreateJPanel(EmployeeProfileHistory history) {
        initComponents();
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        lblEmployeeId = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtPositionTitle = new javax.swing.JTextField();
        lblPositionTitle = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        txtCellPhoneNumber = new javax.swing.JTextField();
        lblCellPhoneNumber = new javax.swing.JLabel();
        txtPhoto = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        btnPhoto = new javax.swing.JButton();

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Employee Profile");
        lblTitle.setToolTipText("");

        lblName.setText("Name:");

        lblEmployeeId.setText("Employee ID");

        lblAge.setText("Age:");

        lblStartDate.setText("Start date:");

        lblLevel.setText("Level:");

        lblGender.setText("Gender:");

        lblPositionTitle.setText("Position title:");

        lblCellPhoneNumber.setText("Cell phone number:");

        lblTeamInfo.setText("Team info:");

        lblEmailAddress.setText("Email Address:");

        btnPhoto.setText("Photo");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(53, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtName)
                                    .addComponent(txtEmployeeId)
                                    .addComponent(txtAge)
                                    .addComponent(txtStartDate)
                                    .addComponent(txtGender)
                                    .addComponent(txtLevel)
                                    .addComponent(txtPositionTitle)
                                    .addComponent(txtTeamInfo)
                                    .addComponent(txtCellPhoneNumber)
                                    .addComponent(txtEmailAddress))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmployeeId)
                                    .addComponent(lblGender)
                                    .addComponent(lblAge)
                                    .addComponent(lblStartDate)
                                    .addComponent(lblLevel)
                                    .addComponent(lblTeamInfo)
                                    .addComponent(lblPositionTitle)
                                    .addComponent(lblEmailAddress)
                                    .addComponent(lblCellPhoneNumber)
                                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeId)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPositionTitle)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellPhoneNumber)
                    .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnPhoto)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(167, 167, 167))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAge, lblCellPhoneNumber, lblEmailAddress, lblEmployeeId, lblGender, lblLevel, lblName, lblPositionTitle, lblStartDate, lblTeamInfo, txtAge, txtCellPhoneNumber, txtEmailAddress, txtEmployeeId, txtGender, txtLevel, txtName, txtPhoto, txtPositionTitle, txtStartDate, txtTeamInfo});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
//        double temperature = Double.parseDouble(txtName.getText());

        if (
                txtEmployeeId.getText().length() == 0
                || txtName.getText().length() == 0 
//                || txtAge.getText().length() == 0 
                || txtAge.getText().matches("^\\d{1,}$") == false 
                || txtGender.getText().length() == 0
                || txtStartDate.getText().length() == 0
                || txtLevel.getText().length() == 0
                || txtTeamInfo.getText().length() == 0 
                || txtPositionTitle.getText().length() == 0
                || txtCellPhoneNumber.getText().matches("^\\d{2,}$") == false 
                || txtEmailAddress.getText().length() == 0
                || txtPhoto.getText().length() == 0
                ) {
                    JOptionPane.showMessageDialog(this, "Please enter the correct format");
                    return;
                }
        String name = txtName.getText();
        String employeeId = txtEmployeeId.getText();
        String age = txtAge.getText();
        String gender = txtGender.getText();
        String startDate = txtStartDate.getText();
        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String positionTitle = txtPositionTitle.getText();
        String cellPhoneNumber = txtCellPhoneNumber.getText();
        String emailAddress = txtEmailAddress.getText();
        String photo = txtPhoto.getText();
        

        EmployeeProfile ep = history.addNewEmployee();
        
        ep.setName(name);
        ep.setEmployeeId(employeeId);
        ep.setAge(age);
        ep.setGender(gender);
        ep.setStartDate(startDate);
        ep.setLevel(level);
        ep.setTeamInfo(teamInfo);
        ep.setPositionTitle(positionTitle);
        ep.setCellPhoneNumber(cellPhoneNumber);
        ep.setEmailAddress(emailAddress);
        ep.setPhoto(photo);
        

        JOptionPane.showMessageDialog(this,"New Employee Profile added.");

        txtName.setText("");
        txtEmployeeId.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPositionTitle.setText("");
        txtCellPhoneNumber.setText("");
        txtEmailAddress.setText("");
        txtPhoto.setText("");
        
        
            
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txtPhoto.setText(filename);
        
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
//        Image image = icon.getImage().getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_SMOOTH);
        lblPhoto.setIcon(icon);
//        history.setFname(filename);
//        txtPhoto.setText("");;
    }//GEN-LAST:event_btnPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhoneNumber;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
