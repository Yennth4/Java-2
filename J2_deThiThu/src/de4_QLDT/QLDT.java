package de4_QLDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLDT extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    private List<Dienthoai> listdt = new ArrayList<>();
    Dienthoaiservice dtService = new Dienthoaiservice();

    public QLDT() {
        initComponents();
        setLocationRelativeTo(null);
        listdt = dtService.fakeData();
        loadTable(listdt);

        // in dòng đầu lên 
        Dienthoai dt = listdt.get(0);
        showData(dt); // ok

    }

    // 1.loadTable
    public void loadTable(List<Dienthoai> list) {

        DefaultTableModel dtm = (DefaultTableModel) this.tblDienThoai.getModel();
        dtm.setRowCount(0); // setRowCount : load tu dong dau

        int STT = 0;
        for (Dienthoai dt : list) {
            Object[] rowData = {
                STT, dt.getMaDT(), dt.getHang(), dt.getMauSac(), dt.getBoNho(), dt.getGia(), dt.trangThai()
            };
            dtm.addRow(rowData);
            STT++;
        }
    }

    // 2. show len Form
    public void showData(Dienthoai dt) {

        txtMa.setText(dt.getMaDT());
        txtGia.setText(dt.getGia().toString());
        cbbBoNho.setSelectedItem(dt.getBoNho().toString());
        cbbHang.setSelectedItem(dt.getHang());

        // rdo
        if (dt.getMauSac().equalsIgnoreCase("Đen")) {
            rdoDen.setSelected(true);
        } else if (dt.getMauSac().equalsIgnoreCase("Trắng")) {
            rdoTrang.setSelected(true);
        } else {
            rdoVang.setSelected(true);
        }
    }

    // mouse click
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        rdoDen = new javax.swing.JRadioButton();
        rdoTrang = new javax.swing.JRadioButton();
        rdoVang = new javax.swing.JRadioButton();
        cbbBoNho = new javax.swing.JComboBox<>();
        cbbHang = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaForm = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDienThoai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QLDT");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Quản Lý Điện Thoại");

        jLabel2.setText("Mã");

        jLabel3.setText("Hãng");

        jLabel4.setText("Bộ nhớ");

        jLabel5.setText("Màu sắc");

        jLabel6.setText("Giá");

        buttonGroup1.add(rdoDen);
        rdoDen.setSelected(true);
        rdoDen.setText("Đen");

        buttonGroup1.add(rdoTrang);
        rdoTrang.setText("Trắng");

        buttonGroup1.add(rdoVang);
        rdoVang.setText("Vàng");

        cbbBoNho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "64", "128", "256", "512", " " }));

        cbbHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apple", "Samsung", "Oppo", " " }));

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnXoaForm.setText("XoaForm");

        btnExit.setText("Exit");

        btnDoc.setText("Doc");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        tblDienThoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Hãng", "Màu sắc", "Bộ nhớ", "Giá", "Trạng thái"
            }
        ));
        tblDienThoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDienThoaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDienThoai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(55, 55, 55)
                                            .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(276, 276, 276))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbbBoNho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdoDen)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdoTrang)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdoVang))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaForm))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(btnGhi)
                                .addGap(18, 18, 18)
                                .addComponent(btnDoc)
                                .addGap(31, 31, 31)
                                .addComponent(btnExit)))
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdoDen)
                    .addComponent(rdoTrang)
                    .addComponent(rdoVang))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbBoNho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaForm))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGhi)
                    .addComponent(btnDoc)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// 3. Mouse Click copy showdata dòng 20-21 > thêm biến lấy dòng dc chọn ròi truyền vô biến show
    private void tblDienThoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDienThoaiMouseClicked
        int so = tblDienThoai.getSelectedRow();
        Dienthoai dt = listdt.get(so);
        showData(dt); // ok
    }//GEN-LAST:event_tblDienThoaiMouseClicked

    // 4. getForm (validate)
    public Dienthoai getForm() {
        // get vì thêm từ trên form xuống
        // set là show lên

        String ma = txtMa.getText().trim();
        String gia = txtGia.getText().trim();
        String hang = cbbHang.getSelectedItem().toString();  // cứ cbb là toString() 
        String boNho = cbbBoNho.getSelectedItem().toString();

        // rdo
        String mau = "";
        if (rdoDen.isSelected()) {
            mau = "Đen";
        } else if (rdoTrang.isSelected()) {
            mau = "Trắng";
        } else {
            mau = "Vàng";
        }

        // validate
        if (ma.length() == 0) {
            JOptionPane.showMessageDialog(this, "Kh dc de trong");
            return null;
        }
        if (gia.length() == 0) {
            JOptionPane.showMessageDialog(this, "Kh dc de trong");
            return null;
        }

        // check Number
        try {
            int so = Integer.parseInt(gia);
            if (so <= 100) {
                JOptionPane.showMessageDialog(this, "Phải là số nguyên và lớn hơn 100");
                return null;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Phải là số");
            return null;
        }

        // xong
        Dienthoai dt = new Dienthoai(ma, hang, mau, Integer.parseInt(boNho), Integer.parseInt(gia));
        return dt;
    }

    // 5.Them
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        int hoi = JOptionPane.showConfirmDialog(this, "Bạn chắc chưa ", "Thông báo", WIDTH);
//        if (hoi == JOptionPane.YES_OPTION) {
        Dienthoai dt = getForm();
        if (dt == null) {
            return;
        }
        dtService.Them(dt);
        loadTable(listdt);
        JOptionPane.showMessageDialog(this, "Thêm thành công");
//        }
    }//GEN-LAST:event_btnThemActionPerformed
//  6.GhiF
    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn chắc chưa ", "Thông báo", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {

            try {
                FileOutputStream fis = new FileOutputStream("file.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fis);
                oos.writeObject(listdt); // ghi vô ArrayList
                oos.close();
                JOptionPane.showMessageDialog(this, "Ghi thành công");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ghi failed");

            }
        }
    }//GEN-LAST:event_btnGhiActionPerformed
// 7. ĐọcF
    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn chắc chưa ", "Thông báo", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {
            try {
                FileInputStream fileIn = new FileInputStream("file.txt");
                ObjectInputStream ois = new ObjectInputStream(fileIn);
                ois.readObject();
                ois.close();
                loadTable(listdt);

                int row = listdt.size() - 1;
                Dienthoai dt = listdt.get(row);
                showData(dt); // ok

                JOptionPane.showMessageDialog(this, "Đọc thành công");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Đọc failed");
// 
            }
        }
    }//GEN-LAST:event_btnDocActionPerformed
// bonus 1 : Sửa
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        int row = tblDienThoai.getSelectedRow();
        if (row < 0) {
            return;
        }

        // láy từ getForm check validate > sửa từ ser
        Dienthoai dt = getForm();
        if (dt == null) {
            return;
        }

        dtService.Sua(row, dt);
        loadTable(listdt);
        JOptionPane.showMessageDialog(this, "Sửa thành công");

    }//GEN-LAST:event_btnSuaActionPerformed
// bonus 2: Xóa
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tblDienThoai.getSelectedRow();
        if (row < 0) {
            return;
        }

        dtService.Xoa(row);
        loadTable(listdt);
        JOptionPane.showMessageDialog(this, "Xóa thành công");

    }//GEN-LAST:event_btnXoaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaForm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbBoNho;
    private javax.swing.JComboBox<String> cbbHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoDen;
    private javax.swing.JRadioButton rdoTrang;
    private javax.swing.JRadioButton rdoVang;
    private javax.swing.JTable tblDienThoai;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMa;
    // End of variables declaration//GEN-END:variables

}
