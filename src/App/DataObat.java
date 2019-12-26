/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class DataObat extends javax.swing.JPanel {

    DefaultTableModel model;
    
    public DataObat() {
        initComponents();
        
        Object[] header = {"NO","","Nama Obat","Jumlah Obat","Deskripsi"};
        model = new DefaultTableModel(header, 0);
        tblObat.setModel(model);
        tblObat.setRowHeight(30);
        tblObat.getColumnModel().getColumn(0).setMinWidth(50);
        tblObat.getColumnModel().getColumn(0).setMaxWidth(50);
        tblObat.getColumnModel().getColumn(1).setMinWidth(0);
        tblObat.getColumnModel().getColumn(1).setMaxWidth(0);
        tblObat.getColumnModel().getColumn(3).setMinWidth(80);
        tblObat.getColumnModel().getColumn(3).setMaxWidth(80);
        loadData("");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tblObat = new javax.swing.JTable();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnTambah = new keeptoo.KButton();
        btnEdit = new keeptoo.KButton();
        btnHapus = new keeptoo.KButton();

        setPreferredSize(new java.awt.Dimension(500, 501));
        setLayout(new java.awt.GridBagLayout());

        tblObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblObat);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 488;
        gridBagConstraints.ipady = 621;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane1, gridBagConstraints);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(153, 153, 153));
        rSPanelGradiente1.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cari");

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah Data");
        btnTambah.setkBorderRadius(45);
        btnTambah.setkEndColor(new java.awt.Color(51, 0, 204));
        btnTambah.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        btnTambah.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnTambah.setkHoverStartColor(new java.awt.Color(51, 0, 204));
        btnTambah.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btnTambah.setkStartColor(new java.awt.Color(0, 204, 204));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit Data");
        btnEdit.setkBorderRadius(45);
        btnEdit.setkEndColor(new java.awt.Color(51, 0, 204));
        btnEdit.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        btnEdit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEdit.setkHoverStartColor(new java.awt.Color(51, 0, 204));
        btnEdit.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btnEdit.setkStartColor(new java.awt.Color(0, 204, 204));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus Data");
        btnHapus.setkBorderRadius(45);
        btnHapus.setkEndColor(new java.awt.Color(51, 0, 204));
        btnHapus.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        btnHapus.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnHapus.setkHoverStartColor(new java.awt.Color(51, 0, 204));
        btnHapus.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btnHapus.setkStartColor(new java.awt.Color(0, 204, 204));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 83;
        gridBagConstraints.ipady = 406;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        add(rSPanelGradiente1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tblObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObatMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblObatMouseClicked

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCariActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        // TODO add your handling code here:
        String key = txtCari.getText();
        if (key.isEmpty()) {
            loadData("");
        }else{
            loadData(key);
        }
    }//GEN-LAST:event_txtCariKeyReleased

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int baris = tblObat.getSelectedRow();
        if (baris != -1) {
            int id = Integer.parseInt(tblObat.getValueAt(baris, 1).toString()) ;
            String nama = tblObat.getValueAt(baris, 2).toString();
            String jumlah = tblObat.getValueAt(baris, 3).toString();
            String deskripsi = tblObat.getValueAt(baris, 4).toString();

            Resource d=new Resource();
            d.setId(id);
            d.setNama_obat(nama);
            d.setJumlah_obat(jumlah);
            d.setDeskripsi(deskripsi);
            MainActivity.TambahComponent(new UbahObat(d));
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        MainActivity.TambahComponent(new TambahObat());
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int r = tblObat.getSelectedRow();
        if (r != -1) {
            int id = Integer.parseInt(tblObat.getValueAt(r, 1).toString());
            int pilih = JOptionPane.showConfirmDialog(this,""
                + "Apakah anda yakin ?","Konfirmasi",
                JOptionPane.YES_NO_OPTION);
            if (pilih == 0) {
                try {
                    Connection c = Koneksi.MySQl();
                    Statement st = c.createStatement();
                    String q = "DELETE FROM tb_obat WHERE id_obat="+id+"";
                    st.executeUpdate(q);
                    loadData("");
                    JOptionPane.showMessageDialog(this, "Data telah dihapus");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        } else {
        }
    }//GEN-LAST:event_btnHapusActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnEdit;
    private keeptoo.KButton btnHapus;
    private keeptoo.KButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private javax.swing.JTable tblObat;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

    private void loadData(String key) {
        try {
            model.setRowCount(0);
            Connection c = Koneksi.MySQl();
            Statement st = c.createStatement();            
            String where = key.isEmpty()?"":" WHERE nama_obat LIKE '%"+key+"%' OR jumlah_obat LIKE '%"+key+"' OR deskripsi LIKE '%"+key+"'";
            
            
            ResultSet rs = st.executeQuery("SELECT * FROM tb_obat"+where);
            int no = 0;
            while (rs.next()) {                
                no++;
                int id = rs.getInt("id_obat");
                String nama = rs.getString("nama_obat");
                int jlmh_obat = rs.getInt("jumlah_obat");
                String deskripsi = rs.getString("deskripsi");
                Object[] data = {no,id,nama,jlmh_obat,deskripsi};
                model.addRow(data);
            }
            
            
        } catch (SQLException e) {
        }
    }
}
