package proyecto;

import db.db;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author axel
 */
public final class consulta extends javax.swing.JFrame {
    DefaultTableModel modelo;
    String cabecera[]={"Subproyecto","Poligono","Unidad Geografica","Zona de Estudio","Fecha","Estacion","Zona UTM","Este","Norte","Coord concatenada","Profundidad","Sustrato","Ecosistema","Presencia de Replicas","N replicas","Replica","SP","NC","ECL","ECR","medida","unidad medida","valor"};
    String datos[][]={};
    db DB;
    ArrayList<DAO.dao> aux;
    public consulta(db DB,ArrayList<DAO.dao> data) throws SQLException {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(this);
        modelo = new DefaultTableModel(datos, cabecera);
        table_data.setModel(modelo);
        table_data.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        this.DB = DB;
        this.aux = data;
        txt_tipo_consulta.setText("TOTAL RESULTADOS: "+data.size());
        MostrarDatosTabla(data);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_tipo_consulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_data = new javax.swing.JTable();
        btn_exit = new javax.swing.JButton();
        btn_csv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_tipo_consulta.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_tipo_consulta.setText("RESULTADO");

        table_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_data);

        btn_exit.setBackground(new java.awt.Color(153, 0, 0));
        btn_exit.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("Salir");
        btn_exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_csv.setBackground(new java.awt.Color(0, 153, 51));
        btn_csv.setForeground(new java.awt.Color(255, 255, 255));
        btn_csv.setText("Exportar CSV");
        btn_csv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_csv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_csvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_tipo_consulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_csv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exit)
                    .addComponent(txt_tipo_consulta)
                    .addComponent(btn_csv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        menu m = new menu(this.DB);
        m.show(true);
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_csvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_csvActionPerformed
        String FILE_HEAD = "Subproyecto,Poligono,Unidad Geografica,Zona de Estudio,Fecha,Estacion,Zona UTM,Este,Norte,Coord concatenada,Profundidad,Sustrato,Ecosistema,Presencia de Replicas,N replicas,Replica,SP,NC,ECL,ECR,medida,unidad medida,valor";
        String COMMA_DELIMITER = ",";
        String NEW_LINE_SEPARATOR = "\n";
        SimpleDateFormat sdf = new SimpleDateFormat("hh_mm_ss");
        String filename = sdf.format(new Date())+".csv";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename);
            fileWriter.append(FILE_HEAD);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(DAO.dao _dao : aux){
                fileWriter.append(_dao.getSubProyecto());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getPoligono());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getUnidad_geografica());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getZona_de_estudio());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getFecha());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getEstacion());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getZona_utm());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(_dao.getEste()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(_dao.getNorte()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getCoord_concatenada());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(_dao.getProfundidad()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getSustrato());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getEcosistema());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getPresencia_replicas());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(_dao.getN_replicas()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getReplica());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getSp());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getNc());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getEcl());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getEcr());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getMedida());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(_dao.getUnidad_medida());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(_dao.getValor()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            JOptionPane.showMessageDialog(this, "El archivo "+filename+" ha sido generado con exito!");
            
        } catch (Exception e) {
            System.out.println("Error al crear el archivo");
            e.printStackTrace();
        } finally{
            try {
               fileWriter.flush();
               fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_btn_csvActionPerformed

   public void MostrarDatosTabla(ArrayList<DAO.dao> data){
            int dim=data.size();
            Object dat[][]=new Object[dim][23];
            for (int i = 0; i < dim; i++) {
                DAO.dao nuevo = data.get(i);
                Object o[]={nuevo.getSubProyecto(),nuevo.getPoligono(),nuevo.getUnidad_geografica(),nuevo.getZona_de_estudio(),nuevo.getFecha(),nuevo.getEstacion(),nuevo.getZona_utm(),nuevo.getEste(),nuevo.getNorte(),nuevo.getCoord_concatenada(),nuevo.getProfundidad(),nuevo.getSustrato(),nuevo.getEcosistema(),nuevo.getPresencia_replicas(),nuevo.getN_replicas(),nuevo.getReplica(),nuevo.getSp(),nuevo.getNc(),nuevo.getEcl(),nuevo.getEcr(),nuevo.getMedida(),nuevo.getUnidad_medida(),nuevo.getValor()};
                for (int j = 0; j < o.length; j++) {
                    dat[i][j]= o[j];
                }    
            }
          modelo.setDataVector(dat, cabecera);
          ajustar();
    }

   
    public void ajustar(){
        TableColumnModel columnModel = table_data.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(200);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(3).setPreferredWidth(200);
        columnModel.getColumn(9).setPreferredWidth(200);
        columnModel.getColumn(11).setPreferredWidth(200);
        columnModel.getColumn(15).setPreferredWidth(150);
        columnModel.getColumn(16).setPreferredWidth(200);
        columnModel.getColumn(17).setPreferredWidth(200);
        columnModel.getColumn(20).setPreferredWidth(150);
        columnModel.getColumn(21).setPreferredWidth(200);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_csv;
    private javax.swing.JButton btn_exit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_data;
    private javax.swing.JLabel txt_tipo_consulta;
    // End of variables declaration//GEN-END:variables
}
