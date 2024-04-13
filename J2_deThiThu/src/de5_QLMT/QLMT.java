package de5_QLMT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLMT extends javax.swing.JFrame {

    // tao moi 
    DefaultTableModel dtm = new DefaultTableModel();
    List<MayTinh> listMT = new ArrayList<>();
    MayTinhService mtService = new MayTinhService(); // lien ket voi Service

    public QLMT() {
        initComponents();
        listMT = mtService.fakeData();
        loadTable(listMT);

        MayTinh mt = listMT.get(0); // lay ra
        show(mt);
        // xong

    }

    // 1.loadTable
    public void loadTable(List<MayTinh> lis) {

        DefaultTableModel dtm = (DefaultTableModel) this.tblMayTinh.getModel();
        dtm.setRowCount(0);

        int stt = 0;
        for (MayTinh mt : lis) {
            Object[] rowData = {
                stt, mt.getMaDT(),
                mt.getHang(),
                mt.getMauSac(),
                mt.getBoNho(),
                mt.getGia(),
                mt.trangThai(),
                mt.isGioiTinh() ? "Nam" : "Nu"
            };
            dtm.addRow(rowData);
            stt++;
            //xong 
        }
    }

    // 2.showRow
    public void show(MayTinh mt) { // leen truyen doi tuong 

        // set
        txtMa.setText(mt.getMaDT());
        txtGia.setText(mt.getGia().toString());
        cbbHang.setSelectedItem(mt.getHang().toString());
        cbbBoNho.setSelectedItem(mt.getBoNho().toString());

        if (mt.getMauSac().equalsIgnoreCase("Den")) {
            rdoDen.setSelected(true);
        } else if (mt.getMauSac().equalsIgnoreCase("Trang")) {
            rdoTrang.setSelected(true);
        } else {
            rdoVang.setSelected(true);
        }

        if (mt.isGioiTinh() == true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
// xong
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbHang = new javax.swing.JComboBox<>();
        rdoDen = new javax.swing.JRadioButton();
        rdoVang = new javax.swing.JRadioButton();
        rdoTrang = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cbbBoNho = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMayTinh = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QLMT");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Quản Lý Máy Tính");

        jLabel2.setText("Mã");

        jLabel3.setText("Giá");

        jLabel4.setText("Màu sắc");

        jLabel5.setText("Hãng");

        cbbHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dell", "Vivo", "Asus" }));

        buttonGroup1.add(rdoDen);
        rdoDen.setSelected(true);
        rdoDen.setText("Đen");

        buttonGroup1.add(rdoVang);
        rdoVang.setText("Vàng");

        buttonGroup1.add(rdoTrang);
        rdoTrang.setText("Trắng");

        jLabel6.setText("Bộ nhớ");

        cbbBoNho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "64", "128", "256", "512" }));

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnDoc.setText("Doc");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        tblMayTinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã", "Hãng", "Màu sắc", "Bộ nhớ", "Giá", "Trạng thái", "GioiTinh"
            }
        ));
        tblMayTinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMayTinhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMayTinh);

        jLabel7.setText("GioiTinh");

        buttonGroup2.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup2.add(rdoNu);
        rdoNu.setText("Nu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbBoNho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(rdoDen)
                                            .addGap(34, 34, 34)
                                            .addComponent(rdoTrang)
                                            .addGap(50, 50, 50)
                                            .addComponent(rdoVang))
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel7)
                                        .addGap(38, 38, 38)
                                        .addComponent(rdoNam)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoNu))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnThem)
                                .addGap(28, 28, 28)
                                .addComponent(btnSua)
                                .addGap(46, 46, 46)
                                .addComponent(btnXoa)
                                .addGap(39, 39, 39)
                                .addComponent(btnGhi)
                                .addGap(31, 31, 31)
                                .addComponent(btnDoc)))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(rdoNam)
                        .addComponent(rdoNu)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoDen)
                        .addComponent(rdoVang)
                        .addComponent(rdoTrang)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbBoNho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnGhi)
                    .addComponent(btnDoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// 3.mouse Click
    private void tblMayTinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMayTinhMouseClicked

        int row = tblMayTinh.getSelectedRow(); // lay dong tu bang
        if (row < 0) {
            return;
        }

        // lay từ trên
        MayTinh mt = listMT.get(row); // new chi co trong GetFrom con lai la lay tu list
        show(mt);
    }//GEN-LAST:event_tblMayTinhMouseClicked
// 4.GhiF
    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn tiếp tục không ?", "Thông báo", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {

            try {
                FileOutputStream fileOut = new FileOutputStream("f.txt");
                ObjectOutput oos = new ObjectOutputStream(fileOut);
                oos.writeObject(listMT);
                oos.close();
                JOptionPane.showMessageDialog(this, "Ghi thanh cong");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ghi failed");
            }
        }
    }//GEN-LAST:event_btnGhiActionPerformed
// 5.DocF
    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn tiếp tục không ?", "Thông báo", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {

            try {
                FileInputStream fileIn = new FileInputStream("f.txt");
                ObjectInputStream ois = new ObjectInputStream(fileIn);

                List<MayTinh> listmt = new ArrayList<>();
                listmt = (List<MayTinh>) ois.readObject();
                ois.close();
                loadTable(listmt);

                // note
                int dong = listmt.size() - 1;
                MayTinh mt = listmt.get(dong);
                show(mt);
                JOptionPane.showMessageDialog(this, "doc thanh cong");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Doc failed");
            }
        }
    }//GEN-LAST:event_btnDocActionPerformed

    // 6.GetForm
    public MayTinh GetForm() {

        String ma = txtMa.getText().trim();
        String gia = txtGia.getText().trim();
        String hang = cbbHang.getSelectedItem().toString();
        String boNho = cbbBoNho.getSelectedItem().toString();

        String mauS = "";
        if (rdoDen.isSelected()) {
            mauS = "Den";
        } else if (rdoTrang.isSelected()) {
            mauS = "Trang";
        } else {
            mauS = "Vang";
        }

        // gioiTinh
        Boolean gioiTinh;
        if (rdoNam.isSelected()) {
            gioiTinh = true;
        } else {
            gioiTinh = false;
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
        int so = Integer.parseInt(gia);
        if (so <= 50) {
            JOptionPane.showMessageDialog(this, "Kh dc de trong");
            return null;
        }
        MayTinh mt = new MayTinh(ma, mauS, Integer.parseInt(boNho), hang, Integer.parseInt(gia), gioiTinh);
        return mt;
    }
// 7.Them
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn tiếp tục không ?", "Thông báo", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {

            MayTinh mt = GetForm();
            if (mt == null) {
                return;
            }

            mtService.them(mt);
            loadTable(listMT);
            JOptionPane.showMessageDialog(this, "Them thanh cong");
        }
    }//GEN-LAST:event_btnThemActionPerformed
// 8.Sua
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn tiếp tục không ?", "Thông báo", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {

            MayTinh mt = GetForm();
            if (mt == null) {
                return;
            }
            int row = tblMayTinh.getSelectedRow(); // lay dong tu bang
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Hay chon dong");
                return;
            }

            mtService.sua(row, mt);
            loadTable(listMT);
            JOptionPane.showMessageDialog(this, "Sua thanh cong");

        }
    }//GEN-LAST:event_btnSuaActionPerformed
// 9.Xoa
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn tiếp tục không ?", "Thông báo", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {

            int row = tblMayTinh.getSelectedRow(); // lay dong tu bang
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Hay chon dong");
                return;
            }

            mtService.xoa(row);
            loadTable(listMT);
            JOptionPane.showMessageDialog(this, "Xoa thanh cong");
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLMT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbBoNho;
    private javax.swing.JComboBox<String> cbbHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoDen;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoTrang;
    private javax.swing.JRadioButton rdoVang;
    private javax.swing.JTable tblMayTinh;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMa;
    // End of variables declaration//GEN-END:variables
}
