/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import model.Employee.Employee;
import model.Employee.EmployeeRecord;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author: Aashay Pawar
 * @NUID: 002134382
 * @NUEMAIL: pawar.aa@northeastern.edu
 */
public class ProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfileJPanel
     */
    
    EmployeeRecord record;
    
    public ProfileJPanel(EmployeeRecord record) {
        initComponents();
        
        this.record = record;
        
        PopulateTable();
        
        String[] attributes = {"Id", "Name", "Age", "Gender", "Start Date", "Level", "Team", "Position", "Email", "Phone" };
        chAttribute.add("");
        for(int i=0;i<10;i++){
            chAttribute.add(attributes[i]);  
        }
        
        txtId.setEnabled(false);
        txtName.setEnabled(false);
        txtAge.setEnabled(false);
        txtGender.setEnabled(false);
        txtStartDate.setEnabled(false);
        txtLevel.setEnabled(false);
        txtTeam.setEnabled(false);
        txtPosition.setEnabled(false);
        txtEmail.setEnabled(false);
        txtPhone.setEnabled(false);
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
        tblRecords = new javax.swing.JTable();
        btnShowProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeam = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chAttribute = new java.awt.Choice();
        txtQuery = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();

        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Start", "Level", "Team Info", "Position", "Email", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRecords);

        btnShowProfile.setText("Show Profile");
        btnShowProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowProfileActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Employee Id:");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamActionPerformed(evt);
            }
        });

        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel4.setText("Age:");

        jLabel5.setText("Gender:");

        jLabel6.setText("Start Date:");

        jLabel7.setText("Level:");

        jLabel8.setText("Team:");

        jLabel9.setText("Position:");

        jLabel10.setText("Email:");

        jLabel11.setText("Phone:");

        txtQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueryActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnShowProfile)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtId)
                                            .addComponent(txtName)
                                            .addComponent(txtAge)
                                            .addComponent(txtGender)
                                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel11))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel10))
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtLevel)
                                            .addComponent(txtTeam)
                                            .addComponent(txtPosition)
                                            .addComponent(txtEmail)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewAll)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)
                        .addComponent(btnViewAll)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnShowProfile)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowProfileActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblRecords.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Select a row to update");
            return;
        }
        
        String employeeId = record.getRecord().get(selectedRowIndex).getEmployeeId();
        String employeeName = record.getRecord().get(selectedRowIndex).getName();
        String age = record.getRecord().get(selectedRowIndex).getAge();
        String gender = record.getRecord().get(selectedRowIndex).getGender();
        String startDate = record.getRecord().get(selectedRowIndex).getStartDate();
        String level = record.getRecord().get(selectedRowIndex).getLevel();
        String team = record.getRecord().get(selectedRowIndex).getTeam();
        String position = record.getRecord().get(selectedRowIndex).getPosition();
        String email = record.getRecord().get(selectedRowIndex).getEmail();
        String phone = record.getRecord().get(selectedRowIndex).getPhone();
        String photo = record.getRecord().get(selectedRowIndex).getPhotoFilePath();
        
        txtId.setText(employeeId);
        txtName.setText(employeeName);
        txtAge.setText(age);
        txtGender.setText(gender);
        txtStartDate.setText(startDate);     
        txtLevel.setText(level);
        txtTeam.setText(team);
        txtPosition.setText(position);
        txtEmail.setText(email);
        txtPhone.setText(phone);

        
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File(photo));
        } catch (IOException e){
        }
        
        jLabel1.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_btnShowProfileActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        int attribute = chAttribute.getSelectedIndex();
        String query = txtQuery.getText();
        int numberOfRecords = record.getRecord().size();
        
        EmployeeRecord er = new EmployeeRecord();
        
        switch(attribute){
            case 1: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getEmployeeId())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
            
            case 2: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getName())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
            
            case 3: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getAge())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
            
            case 4: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getGender())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
            
            case 5: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getStartDate())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
            
            case 6: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getLevel())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
            
            case 7: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getTeam())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
            
            case 8: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getPosition())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
            
            case 9: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getEmail())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
            
            case 10: for(int i=0;i<numberOfRecords;i++){
                if(query.matches(record.getRecord().get(i).getPhone())){
                    Employee ek = er.addNewRecord();
                    ek.setEmployeeId(record.getRecord().get(i).getEmployeeId());
                    ek.setName(record.getRecord().get(i).getName());
                    ek.setAge(record.getRecord().get(i).getAge());
                    ek.setGender(record.getRecord().get(i).getGender());
                    ek.setStartDate(record.getRecord().get(i).getStartDate());
                    ek.setLevel(record.getRecord().get(i).getLevel());
                    ek.setTeam(record.getRecord().get(i).getTeam());
                    ek.setPosition(record.getRecord().get(i).getPosition());
                    ek.setEmail(record.getRecord().get(i).getEmail());
                    ek.setPhone(record.getRecord().get(i).getPhone());  
                    
                }
            }
        }

        DefaultTableModel model = (DefaultTableModel) tblRecords.getModel();
        model.setRowCount(0);
        
        for(Employee e: er.getRecord()){
            Object[] row = new Object[10];
            row[0] = e.getEmployeeId();
            row[1] = e.getName();
            row[2] = e.getAge();
            row[3] = e.getGender();
            row[4] = e.getStartDate();
            row[5] = e.getLevel();
            row[6] = e.getTeam();
            row[7] = e.getPosition();
            row[8] = e.getEmail();
            row[9] = e.getPhone();
            
            model.addRow(row);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQueryActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamActionPerformed

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        PopulateTable();
        txtQuery.setText("");
        chAttribute.select(0);
        
        txtId.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");     
        txtLevel.setText("");
        txtTeam.setText("");
        txtPosition.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        
        jLabel1.setIcon(null);
    }//GEN-LAST:event_btnViewAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowProfile;
    private javax.swing.JButton btnViewAll;
    private java.awt.Choice chAttribute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtQuery;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables

    private void PopulateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel model = (DefaultTableModel) tblRecords.getModel();
        model.setRowCount(0);
        
        for(Employee e: record.getRecord()){
            Object[] row = new Object[10];
            row[0] = e.getEmployeeId();
            row[1] = e.getName();
            row[2] = e.getAge();
            row[3] = e.getGender();
            row[4] = e.getStartDate();
            row[5] = e.getLevel();
            row[6] = e.getTeam();
            row[7] = e.getPosition();
            row[8] = e.getEmail();
            row[9] = e.getPhone();
            
            model.addRow(row);
        }
        
    }
}
