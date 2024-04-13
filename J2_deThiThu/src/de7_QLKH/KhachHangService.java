package de7_QLKH;

import java.util.ArrayList;
import java.util.List;
public class KhachHangService {
    private List<KhachHang> dskh = new ArrayList<>();
    public void insert(KhachHang kh){
        dskh.add(kh);
    }

    public List<KhachHang> getDskh() {
        return dskh;
    }

    public void setDskh(List<KhachHang> dskh) {
        this.dskh = dskh;
    }
    
}
