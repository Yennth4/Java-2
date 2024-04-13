package de1_QLSP;

import java.io.Serializable;
import javax.swing.JTextField;

public class SanPham implements Serializable{

    private String tenSanPham;
    private String maSanPham;
    private String danhMuc;
    private int tinhTrang;
    private String donGia;

    public SanPham() {
    }

    public SanPham(String tenSanPham, String maSanPham, String danhMuc, int tinhTrang, String donGia) {
        this.tenSanPham = tenSanPham;
        this.maSanPham = maSanPham;
        this.danhMuc = danhMuc;
        this.tinhTrang = tinhTrang;
        this.donGia = donGia;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }
    
    
    
    
}
