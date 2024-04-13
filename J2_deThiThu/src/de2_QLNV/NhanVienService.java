package de2_QLNV;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    public List<NhanVien> nhanVienService ;

    public NhanVienService() {
        nhanVienService = new ArrayList<>();
    }

    public void them(NhanVien nv) {
        this.nhanVienService.add(nv);
    }

    public void sua(int viTri, NhanVien nv) {
        this.nhanVienService.set(viTri, nv);
    }

    public void xoa(int viTri) {
        this.nhanVienService.remove(viTri);
    }
    
    public List<NhanVien> fillAll() {     
        this.nhanVienService.add(new NhanVien("NV1", "NguyenThuyHang", 0, 11));
        this.nhanVienService.add(new NhanVien("NV2", "TranTuanPhong", 1, 14));
        this.nhanVienService.add(new NhanVien("NV3", "VuVanNguyen", 1, 3));
        this.nhanVienService.add(new NhanVien("NV4", "NguyenHoangTien", 1, 23));
        this.nhanVienService.add(new NhanVien("NV5", "ChuThiNgan", 0, 23));
        return nhanVienService;
    }

}
