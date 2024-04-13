package sp01;

public class SinhVien {
    private String ma;
    private String hoTen;
    private String email;
    private String pwd;
    private int gioiTinh;
    private String cNganh;
    private String trangThai;
    
    @Override
    public String toString() {
        return ma + "|" + hoTen + "|" + email + "|" +
            pwd + "|" + gioiTinh + "|" + cNganh;
    }

    public SinhVien() {
    }

    public SinhVien(String ma, String hoTen, String email, String pwd, int gioiTinh, String cNganh, String trangThai) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.email = email;
        this.pwd = pwd;
        this.gioiTinh = gioiTinh;
        this.cNganh = cNganh;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getcNganh() {
        return cNganh;
    }

    public void setcNganh(String cNganh) {
        this.cNganh = cNganh;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
