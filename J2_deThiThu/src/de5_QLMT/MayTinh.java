package de5_QLMT;

import java.io.Serializable;

public class MayTinh implements Serializable{
    private String maDT;
    private String mauSac;
    private Integer boNho;
    private String hang;
    private Integer gia;
    private boolean gioiTinh;

    public MayTinh() {
    }

    public MayTinh(String maDT, String mauSac, Integer boNho, String hang, Integer gia, boolean gioiTinh) {
        this.maDT = maDT;
        this.mauSac = mauSac;
        this.boNho = boNho;
        this.hang = hang;
        this.gia = gia;
        this.gioiTinh = gioiTinh;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public Integer getBoNho() {
        return boNho;
    }

    public void setBoNho(Integer boNho) {
        this.boNho = boNho;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String trangThai(){
        if(gia >= 5000){
            return "SP dat";
        } else {
            return "SP bth";
        }
    }
    
}
