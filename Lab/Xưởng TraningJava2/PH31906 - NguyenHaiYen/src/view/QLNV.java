package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import service.NhanVienService;

public class QLNV extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    NhanVienService service = new NhanVienService();
    List<NhanVien> listNV = new ArrayList<>();

    public QLNV() {
        initComponents();
        listNV = service.fakeData();
        loadTable(listNV);
        loadComboBox();

        NhanVien nv = listNV.get(1);
        showData(nv);
    }

    public void loadTable(List<NhanVien> list) {
        DefaultTableModel dtm = (DefaultTableModel) tblNhanVien.getModel();
        dtm.setRowCount(0);
        for (NhanVien nv : list) {
            Object[] rowData = {
                nv.getMaNV(), nv.getTenNV(), nv.getGioiTinh() ? "Nam" : "Nu", nv.getThamNien(), nv.tinhThuong()
            };
            dtm.addRow(rowData);
        }
    }

    public void loadComboBox() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cbbThamNien.getModel();
        for (int i = 1; i <= 100; i++) {
            dcbm.addElement(i);
        }
    }

    public void showData(NhanVien nv) {
        txtMa.setText(nv.getMaNV());
        txtTen.setText(nv.getTenNV());
        cbbThamNien.setSelectedItem(nv.getThamNien());

        if (nv.getGioiTinh() == true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        cbbThamNien = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        lbDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Nhân Viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setText("Mã ");

        jLabel3.setText("Tên");

        jLabel4.setText("Thâm niên");

        jLabel5.setText("Giới tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        cbbThamNien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));

        jLabel6.setText("Tháng");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnGhi.setText("GhiFile");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Giới Tính", "Thâm niên", "Thưởng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDoc.setText("DocFile");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        lbDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDate.setText("00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbbThamNien, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoNam)
                                        .addGap(33, 33, 33)
                                        .addComponent(rdoNu)))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnThem)
                                .addGap(36, 36, 36)
                                .addComponent(btnSua)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnGhi)
                                .addGap(18, 18, 18)
                                .addComponent(btnDoc)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit)))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdoNam)
                                .addComponent(rdoNu)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cbbThamNien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(lbDate)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnGhi)
                    .addComponent(btnDoc)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        int row = tblNhanVien.getSelectedRow();
        if (row < 0) {
            return;
        }

        NhanVien nv = listNV.get(row);
        showData(nv);
    }//GEN-LAST:event_tblNhanVienMouseClicked

    public NhanVien getForm() {
        String tenNV = txtTen.getText().trim();
        String maNV = txtMa.getText().trim();
        String thamNien = cbbThamNien.getSelectedItem().toString();

        Boolean gioiTinh;
        if (rdoNam.isSelected()) {
            gioiTinh = true;
        } else {
            gioiTinh = false;
        }

        if (maNV.length() == 0) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong ma nhan vien");
            return null;
        }

        if (tenNV.length() == 0) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong ten nhan vien");
            return null;
        }

        NhanVien nv = new NhanVien(maNV, tenNV, gioiTinh, Integer.parseInt(thamNien));
        return nv;
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon tiep tuc khong ? ", "Thong bao", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {
            NhanVien nv = getForm();
            if (nv == null) {
                return;
            }

            service.them(nv);
            loadTable(listNV);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon tiep tuc khong ? ", "Thong bao", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {

            int row = tblNhanVien.getSelectedRow();
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Vui long chon dong can sua");
                return;
            }

            NhanVien nv = getForm();
            service.sua(row, nv);
            loadTable(listNV);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon tiep tuc khong ? ", "Thong bao", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {
            int row = tblNhanVien.getSelectedRow();
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Vui long chon dong can xoa");
                return;
            }

            service.xoa(row);
            loadTable(listNV);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed

        int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon tiep tuc khong ? ", "Thong bao", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {
            try {
                FileOutputStream fileOut = new FileOutputStream("f.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fileOut);
                oos.writeObject(listNV);
                oos.close();
                JOptionPane.showMessageDialog(this, "Ghi sucess");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ghi failed");
            }
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon tiep tuc khong ? ", "Thong bao", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed

        int hoi = JOptionPane.showConfirmDialog(this, "Ban co muon tiep tuc khong ? ", "Thong bao", WIDTH);
        if (hoi == JOptionPane.YES_OPTION) {
            try {
                FileInputStream fileIn = new FileInputStream("f.txt");
                ObjectInputStream ois = new ObjectInputStream(fileIn);
                List<NhanVien> list = new ArrayList<>();
                list = (List<NhanVien>) ois.readObject();
                listNV = list;
                loadTable(list);
                ois.close();
                JOptionPane.showMessageDialog(this, "Doc sucess");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Doc failed");
            }
        }
    }//GEN-LAST:event_btnDocActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(){
            @Override
            public void run() {
                while(true){
                    Date now = new Date();
                    SimpleDateFormat fm = new SimpleDateFormat("dd MM YYYY HH:MM:ss aa ");
                    lbDate.setText(fm.format(now));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();   
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNV().setVisible(true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbThamNien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
