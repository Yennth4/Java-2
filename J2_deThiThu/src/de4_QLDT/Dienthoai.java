package de4_QLDT;

import java.io.Serializable;

public class Dienthoai implements Serializable{
    private String maDT ;
    private String hang ;
    private String mauSac ;
    private Integer boNho ;
    private Integer gia ;

    public Dienthoai() {
    }

    public Dienthoai(String maDT, String hang, String mauSac, Integer boNho, Integer gia) {
        this.maDT = maDT;
        this.hang = hang;
        this.mauSac = mauSac;
        this.boNho = boNho;
        this.gia = gia;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
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

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }
    
    public String trangThai(){
        
        if(gia >= 5000){
            return "SP dat";
        }else {
            return "SP binh thuong";
        }
    }
}
