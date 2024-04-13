package lesson8_Daymonthyear;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        btnClickMe = new javax.swing.JButton();
        txtNsx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCheckDate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Giá");

        btnClickMe.setText("Click me");
        btnClickMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickMeActionPerformed(evt);
            }
        });

        jLabel2.setText("NSX");

        btnCheckDate.setText("Kiểm tra ngày");
        btnCheckDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckDateActionPerformed(evt);
            }
        });

        jLabel3.setText("dd/mm/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNsx)
                            .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClickMe)
                            .addComponent(btnCheckDate))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClickMe))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnCheckDate))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickMeActionPerformed
        String s = this.txtGia.getText();
        
        try {
            Double d = Double.parseDouble(s);
            System.out.println(d);
            JOptionPane.showMessageDialog(this, "Đúng định dạng");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá phải là số");
            e.printStackTrace();
        }
        
        System.out.println("Hoàn thành");
    }//GEN-LAST:event_btnClickMeActionPerformed

    private void btnCheckDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckDateActionPerformed
        String s = this.txtNsx.getText();
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/mm/yyyy");
        Date d;
        try {
            d = sdf.parse(s);
            JOptionPane.showMessageDialog(this, "Đúng định dạng");

            JOptionPane.showMessageDialog(this, sdf.format(d));
        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Sai định dạng");
        }  
    }//GEN-LAST:event_btnCheckDateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckDate;
    private javax.swing.JButton btnClickMe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtNsx;
    // End of variables declaration//GEN-END:variables
}
