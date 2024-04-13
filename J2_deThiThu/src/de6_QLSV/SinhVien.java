package de6_QLSV;

import java.io.Serializable;

public class SinhVien implements Serializable {

    private String maSV;
    private String tenSV;
    private Boolean gioTinh;
    private Integer namSinh;
    private String SDT;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, Boolean gioTinh, Integer namSinh, String SDT) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioTinh = gioTinh;
        this.namSinh = namSinh;
        this.SDT = SDT;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public Boolean getGioTinh() {
        return gioTinh;
    }

    public void setGioTinh(Boolean gioTinh) {
        this.gioTinh = gioTinh;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Integer tinhTuoi() {
        return 2023 - namSinh;
    }
}
