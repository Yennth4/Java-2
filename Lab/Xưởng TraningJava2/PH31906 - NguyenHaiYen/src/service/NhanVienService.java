package service;

import java.util.ArrayList;
import java.util.List;
import model.NhanVien;

public class NhanVienService {

    List<NhanVien> service = new ArrayList<>();

    public List<NhanVien> getService() {
        return service;
    }

    public void setService(List<NhanVien> service) {
        this.service = service;
    }

    public void them(NhanVien nv) {
        service.add(nv);
    }

    public void sua(int index, NhanVien nv) {
        service.set(index, nv);
    }

    public void xoa(int index) {
        service.remove(index);
    }
    
    public List<NhanVien> fakeData(){
        
        service.add(new NhanVien("KHv@1", "Nguyễn Thúy Hằng", false, 2));
        service.add(new NhanVien("KHv@2", "Trần Tuấn Phong", true, 14));
        service.add(new NhanVien("KHv@3", "Vũ Văn Nguyên", true, 13));
        service.add(new NhanVien("KHv@4", "Nguyễn Hoàng Tiến", true, 1));
        service.add(new NhanVien("KHv@5", "Chu Thị Ngân", false, 5));
        return service;
    }
}
