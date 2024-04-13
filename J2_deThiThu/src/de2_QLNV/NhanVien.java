package de2_QLNV;

import java.io.Serializable;

public class NhanVien implements Serializable{
    private String maNV;
    private String tenNV;
    private int gioiTinh;
    private int thamNien;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, int gioiTinh, int thamNien) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.thamNien = thamNien;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    
    public int Thuong(){
        if (this.thamNien > 11){
            return 500;
        }
        return 200;
    }
    

}
