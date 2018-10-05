/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import DAO.dao;
import db.db;
import db.querys;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

/**
 *
 * @author axel
 */
public class menu extends javax.swing.JFrame {

    int i = 0;
    db DB;
    String SQL_QUERY  = querys.SQL_JOIN_ALL;
    boolean status[] = {false,false,false,false,false,false,false};
    ArrayList<DAO.dao>listdaos; 
    public menu(db DB) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        this.DB = DB;
        tf_subproyecto.setEnabled(false);
        tf_poligono.setEnabled(false);
        tf_ug.setEnabled(false);
        tf_especie.setEnabled(false);
        tf_nc.setEnabled(false);
        tf_zde.setEnabled(false);
        tf_ecr.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_1 = new javax.swing.JCheckBox();
        tf_subproyecto = new javax.swing.JTextField();
        cb_2 = new javax.swing.JCheckBox();
        tf_poligono = new javax.swing.JTextField();
        cb_3 = new javax.swing.JCheckBox();
        tf_ug = new javax.swing.JTextField();
        cb_4 = new javax.swing.JCheckBox();
        tf_zde = new javax.swing.JTextField();
        cb_5 = new javax.swing.JCheckBox();
        tf_especie = new javax.swing.JTextField();
        cb_6 = new javax.swing.JCheckBox();
        tf_nc = new javax.swing.JTextField();
        cb_7 = new javax.swing.JCheckBox();
        tf_ecr = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel1.setText("TIPO CONSULTA");

        btn_consultar.setBackground(new java.awt.Color(0, 0, 0));
        btn_consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar.setText("Consultar");
        btn_consultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("(*) Seleccione los campos que desea filtrar");

        cb_1.setText("Subproyecto");
        cb_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_1ActionPerformed(evt);
            }
        });

        cb_2.setText("Polígono");
        cb_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_2ActionPerformed(evt);
            }
        });

        cb_3.setText("Unidad geográfica");
        cb_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_3ActionPerformed(evt);
            }
        });

        cb_4.setText("Zona de estudio");
        cb_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_4ActionPerformed(evt);
            }
        });

        cb_5.setText("Especie");
        cb_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_5ActionPerformed(evt);
            }
        });

        cb_6.setText("Nombre común");
        cb_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_6ActionPerformed(evt);
            }
        });

        cb_7.setText("ECR");
        cb_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(305, 305, 305))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_5)
                            .addComponent(cb_3)
                            .addComponent(cb_1)
                            .addComponent(cb_7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_ug, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_especie)
                            .addComponent(tf_subproyecto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ecr))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_nc))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_4)
                                    .addComponent(cb_2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_poligono, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(tf_zde))))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_1)
                    .addComponent(tf_subproyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_2)
                    .addComponent(tf_poligono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_3)
                    .addComponent(tf_ug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_4)
                    .addComponent(tf_zde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_5)
                    .addComponent(tf_especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_6)
                    .addComponent(tf_nc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_7)
                    .addComponent(tf_ecr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        listdaos = new ArrayList<>();
        try {
            SwingWorker work = createWorker(this.SQL_QUERY);
            work.execute();
            while(!work.isDone()){
                
            }
            consulta c = new consulta(this.DB, listdaos);
            c.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexiondb c = new conexiondb();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_1ActionPerformed
       
        if(cb_1.isSelected()){
            tf_subproyecto.setEnabled(true);
            String query;
            if(i==0){
                query = querys.SQL_SUBPROYECTO;
            }
            else{
                query = querys.SQL_AND_SUBPROYECTO;
            }
            SQL_QUERY+=query;
            i++;
            status[0] = true;
        }
        else{
            i--;
            restart();
            status[0] = false;
        }      
    }//GEN-LAST:event_cb_1ActionPerformed

    private void cb_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_2ActionPerformed
        
        if(cb_2.isSelected()){
            tf_poligono.setEnabled(true);
            String query;
            if(i==0){
                query = querys.SQL_POLIGONO;
            }
            else{
                query = querys.SQL_AND_POLIGONO;
            }
            SQL_QUERY+=query;
            i++;
            status[1] = true;
        }
        else{
            i--;
            restart();
            status[1] = false;
        }
    }//GEN-LAST:event_cb_2ActionPerformed

    private void cb_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_3ActionPerformed
        
        if(cb_3.isSelected()){
            tf_ug.setEnabled(true);
            String query;
            if(i==0){
                query = querys.SQL_UNIDAD_GEOGRAFICA;
            }
            else{
                query = querys.SQL_AND_UNIDAD_GEOGRAFICA;
            }
            SQL_QUERY+=query;
            i++;
            status[2] = true;
        
        }
        else{
            i--;
            restart();
            status[2] = false;
        }
    }//GEN-LAST:event_cb_3ActionPerformed

    private void cb_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_4ActionPerformed
       
        if(cb_4.isSelected()){
            tf_zde.setEnabled(true);
            String query;
            if(i==0){
                query = querys.SQL_ZONA_ESTUDIO;
            }
            else{
                query = querys.SQL_AND_ZONA_ESTUDIO;
            }
            SQL_QUERY+=query;
            i++;
            status[3] = true;
        }
        else{
            i--;
            restart();
            status[3] = false;
        }
    }//GEN-LAST:event_cb_4ActionPerformed

    private void cb_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_5ActionPerformed
      
        if(cb_5.isSelected()){
            tf_especie.setEnabled(true);
            String query;
            if(i==0){
                query = querys.SQL_ESPECIE;
            }
            else{
                query = querys.SQL_AND_ESPECIE;
            }
            SQL_QUERY+=query;
            i++;
            status[4] = true;
        }
        else{
            i--;
            restart();
            status[4] = false;
        }
    }//GEN-LAST:event_cb_5ActionPerformed

    private void cb_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_6ActionPerformed
     
        if(cb_6.isSelected()){
            tf_nc.setEnabled(true);
            String query;
            if(i==0){
                query = querys.SQL_ESPECIE_NC;
            }
            else{
                query = querys.SQL_AND_ESPECIE_NC;
            }
            SQL_QUERY+=query;
            i++;
            status[5] = true;
            
        }
        else{
            i--;
            restart();
            status[5] = false;
        }
    }//GEN-LAST:event_cb_6ActionPerformed

    private void cb_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_7ActionPerformed

        if(cb_7.isSelected()){
            tf_ecr.setEnabled(true);
            String query;
            if(i==0){
                query = querys.SQL_ECR;
            }
            else{
                query = querys.SQL_AND_ECR;
            }
            SQL_QUERY+=query;
            i++;
            status[6] = true;
        }
        else{
            i--;
            restart();
            status[6] = false;
        }
    }//GEN-LAST:event_cb_7ActionPerformed
    void restart(){
        cb_1.setSelected(false);
        cb_2.setSelected(false);
        cb_3.setSelected(false);
        cb_4.setSelected(false);
        cb_5.setSelected(false);
        cb_6.setSelected(false);
        cb_7.setSelected(false);
        tf_subproyecto.setEnabled(false);
        tf_poligono.setEnabled(false);
        tf_ug.setEnabled(false);
        tf_especie.setEnabled(false);
        tf_nc.setEnabled(false);
        tf_zde.setEnabled(false);
        tf_ecr.setEnabled(false);
        this.i = 0;
        this.SQL_QUERY = querys.SQL_JOIN_ALL;
        for(int in = 0;in<status.length;in++){
            status[in] = false;
        }
    }
    
    
    public SwingWorker createWorker(String SQL_QUERY){
        return new SwingWorker<Boolean,String>() {
            
            @Override
            protected Boolean doInBackground() throws Exception {
                int index = 1;
                PreparedStatement ps;
                try {
                    ps = DB.getConnection().prepareStatement(SQL_QUERY);
                    if(status[0]){
                        ps.setString(index, tf_subproyecto.getText());
                        index++;
                    }
                    if(status[1]){
                        ps.setString(index, tf_poligono.getText());
                        index++;
                    }
                    if(status[2]){
                        ps.setString(index, tf_ug.getText());
                        index++;
                    }
                    if(status[3]){
                        ps.setString(index, tf_zde.getText());
                        index++;
                    }
                    if(status[4]){
                        ps.setString(index, tf_especie.getText());
                        index++;
                    }
                    if(status[5]){
                        ps.setString(index, tf_nc.getText());
                        index++;
                    }
                    if(status[6]){
                        ps.setString(index, tf_ecr.getText());
                        index++;
                    }
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        DAO.dao nuevo = new dao(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getFloat(8),rs.getFloat(9),rs.getFloat(8)+"-"+rs.getFloat(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getFloat(22));
                        listdaos.add(nuevo);
                    }

                    } catch (SQLException ex) {
                        Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                    return true; 
                    }

            @Override
            protected void done() {
               boolean bstatus = false;
                try {
                    bstatus = get();
                } catch (Exception ex) {
                    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Finish with status: " + bstatus);
            }
                      
        };
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JCheckBox cb_1;
    private javax.swing.JCheckBox cb_2;
    private javax.swing.JCheckBox cb_3;
    private javax.swing.JCheckBox cb_4;
    private javax.swing.JCheckBox cb_5;
    private javax.swing.JCheckBox cb_6;
    private javax.swing.JCheckBox cb_7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tf_ecr;
    private javax.swing.JTextField tf_especie;
    private javax.swing.JTextField tf_nc;
    private javax.swing.JTextField tf_poligono;
    private javax.swing.JTextField tf_subproyecto;
    private javax.swing.JTextField tf_ug;
    private javax.swing.JTextField tf_zde;
    // End of variables declaration//GEN-END:variables
}
