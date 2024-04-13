package model;

import java.io.Serializable;

public class NhanVien implements Serializable {

    private String maNV;
    private String tenNV;
    private Boolean gioiTinh;
    private Integer thamNien;

    public NhanVien() {
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

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getThamNien() {
        return thamNien;
    }

    public void setThamNien(Integer thamNien) {
        this.thamNien = thamNien;
    }

    public NhanVien(String maNV, String tenNV, Boolean gioiTinh, Integer thamNien) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.thamNien = thamNien;
    }

    public Integer tinhThuong() {
        if (thamNien > 12) {
            return 500000;
        }
        return 200000;
    }

}
