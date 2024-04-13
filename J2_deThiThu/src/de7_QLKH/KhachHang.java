package de7_QLKH;

import java.io.Serializable;
public class KhachHang implements Serializable{
    public String maKH;
    public String tenKH;
    public String gioiTinh;
    public String sdt;
    public String nhomKH;
    public int giamGia;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String gioiTinh, String sdt, String nhomKH, int giamGia) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.nhomKH = nhomKH;
        this.giamGia = giamGia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNhomKH() {
        return nhomKH;
    }

    public void setNhomKH(String nhomKH) {
        this.nhomKH = nhomKH;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ", nhomKH=" + nhomKH + ", giamGia=" + giamGia + '}';
    }

   

    
}
