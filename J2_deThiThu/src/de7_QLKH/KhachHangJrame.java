package de7_QLKH;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class KhachHangJrame extends javax.swing.JFrame {

    KhachHangService khService = new KhachHangService();
    public String filename = "khachhang.dat";

    public KhachHangJrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void loadData() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblkhach.getModel();
        dtm.setRowCount(0);
        for (KhachHang kh : this.khService.getDskh()) {
            Object[] dskh = {
                kh.getMaKH(), kh.getTenKH(), kh.getGioiTinh(), kh.getNhomKH(), kh.getSdt(), kh.getGiamGia()
            };
            dtm.addRow(dskh);
        }

    }

    public KhachHang getForm() {
        String ma = this.txtma.getText().trim();
        String name = this.txtname.getText().trim();
        String sdt = this.txtsdt.getText().trim();
        String saleText = this.txtgiam.getText().trim();
        if (ma.length() == 0 || name.length() == 0 || sdt.length() == 0 || saleText.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        String maSinh = "";
        if (ma.length() == 1) {
            maSinh = "KHv@" + ma;
        } else {
            JOptionPane.showMessageDialog(this, "Quá độ dài quy định của mã tự sinh");
            return null;
        }
        if (sdt.charAt(0) != '0') {
            JOptionPane.showMessageDialog(this, "Số điện thoại phải bắt đầu bằng số 0");
            return null;
        }
        try {
            Integer.parseInt(sdt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số điện phải là số");
            return null;
        }
        try {
            Double.parseDouble(saleText);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mã giảm giá phải là số");
            return null;
        }

        String gt = this.rdoNam.isSelected() == true ? "Nam" : "Nữ";
        String loai = this.cbbnhom.getSelectedItem().toString();

        int sale = Integer.parseInt(saleText);
        KhachHang kh = new KhachHang(maSinh, name, gt, sdt, loai, sale);
        return kh;
    }    
   //
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbbnhom = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkhach = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtgiam = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnwrite = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Khách Hàng");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        jLabel2.setText("Mã khách hàng");

        jLabel3.setText("Tên khách hàng");

        jLabel4.setText("Giới Tính ");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel5.setText("Nhóm khách hàng");

        cbbnhom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Thân Thiết", "New" }));

        tblkhach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Giới Tinh", "Nhóm KH", "SĐT", "Giảm Giá"
            }
        ));
        tblkhach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkhachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkhach);

        jLabel6.setText("SĐT");

        jLabel7.setText("Giảm giá");

        btnadd.setText("Thêm");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnwrite.setText("Ghi file");
        btnwrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwriteActionPerformed(evt);
            }
        });

        btnOpen.setText("Mở file");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                            .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(43, 43, 43))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtgiam, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                .addComponent(txtsdt)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbbnhom, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtname)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnwrite, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnadd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOpen, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnadd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnwrite))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rdoNu, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rdoNam))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnOpen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbbnhom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtgiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClear)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        KhachHang kh = this.getForm();
        if (kh == null) {
            return;
        }
        this.khService.insert(kh);
        this.loadData();
        JOptionPane.showMessageDialog(this, "Thêm Thành Công");
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnwriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwriteActionPerformed
        // TODO add your handling code here:
        File f = new File(filename);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(this.khService.getDskh());
            JOptionPane.showMessageDialog(this, "Ghi file thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ghi file thất bại");
        } finally {
            if (oos == null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_btnwriteActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        File f = new File(filename);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ArrayList<KhachHang> dskh = (ArrayList) ois.readObject();
            this.khService.setDskh(dskh);
            JOptionPane.showMessageDialog(this, "Đọc file thành công");
            this.loadData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đọc file thất bại");
        } finally {
            if (ois == null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void tblkhachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkhachMouseClicked
        // TODO add your handling code here:
        int row = this.tblkhach.getSelectedRow();
        if (row == -1) {
            return;
        }

        KhachHang kh = this.khService.getDskh().get(row);
        this.txtname.setText(kh.getTenKH());
        this.txtma.setText(kh.getMaKH());
        this.txtgiam.setText(kh.getGiamGia() + "");
        this.txtsdt.setText(kh.getSdt());

        if (kh.getGioiTinh().equalsIgnoreCase("Nam")) {
            this.rdoNam.setSelected(true);
        } else {
            this.rdoNu.setSelected(true);
        }

        this.cbbnhom.setSelectedItem(kh.getNhomKH());
    }//GEN-LAST:event_tblkhachMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.khService.insert(new KhachHang("KHv@1", "Nguyễn Thúy Hằng", "Nữ", "0987654321", "VIP", 10));
        this.khService.insert(new KhachHang("KHv@2", "Trần Tuấn Phong", "Nam", "0973124321", "VIP", 10));
        this.khService.insert(new KhachHang("KHv@3", "Vũ Văn Nguyên", "Nữ", "0856124321", "Thân thiết", 5));
        this.khService.insert(new KhachHang("KHv@4", "Nguyễn Hoàng Tiến", "Nữ", "0972554321", "New", 8));
        this.khService.insert(new KhachHang("KHv@5", "Chu Thị Ngân", "Nam", "0912334321", "New", 8));
        this.loadData();

        txtma.setText((String) tblkhach.getValueAt(0, 0));
        txtname.setText((String) tblkhach.getValueAt(0, 1));
        String gioiTinh = (String) tblkhach.getValueAt(0, 2);
        if (gioiTinh.equalsIgnoreCase("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        cbbnhom.setSelectedItem(tblkhach.getValueAt(0, 3));
        txtsdt.setText((String) tblkhach.getValueAt(0, 4));
        txtgiam.setText(tblkhach.getValueAt(0, 5).toString());

    }//GEN-LAST:event_formWindowOpened

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtgiam.setText("");
        txtma.setText("");
        txtname.setText("");
        txtsdt.setText("");
        cbbnhom.setSelectedIndex(0);
        rdoNam.setSelected(true);
    }//GEN-LAST:event_btnClearActionPerformed
    public KhachHangJrame(JButton btnOpen, JButton btnadd, JButton btnwrite, ButtonGroup buttonGroup1, JComboBox<String> cbbnhom, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JPanel jPanel1, JScrollPane jScrollPane1, JTable jTable1, JRadioButton rdoNam, JRadioButton rdoNu, JTextField txtgiam, JTextField txtma, JTextField txtname, JTextField txtsdt) throws HeadlessException {
        this.btnOpen = btnOpen;
        this.btnadd = btnadd;
        this.btnwrite = btnwrite;
        this.buttonGroup1 = buttonGroup1;
        this.cbbnhom = cbbnhom;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jPanel1 = jPanel1;
        this.jScrollPane1 = jScrollPane1;
        this.tblkhach = jTable1;
        this.rdoNam = rdoNam;
        this.rdoNu = rdoNu;
        this.txtgiam = txtgiam;
        this.txtma = txtma;
        this.txtname = txtname;
        this.txtsdt = txtsdt;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhachHangJrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangJrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangJrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangJrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangJrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnwrite;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbnhom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblkhach;
    private javax.swing.JTextField txtgiam;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables
}
