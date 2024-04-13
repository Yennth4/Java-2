package de6_QLSV;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> service = new ArrayList<>();

    public List<SinhVien> getService() {
        return service;
    }

    public void setService(List<SinhVien> service) {
        this.service = service;
    }
    
    public void xoa(int viTri){
        service.remove(viTri);
    }
    
    List<SinhVien> fakeData(){
        
        service.add(new SinhVien("1", "NV1", true, 2012, "0982"));
        service.add(new SinhVien("2", "NV2", false, 2000, "01282"));
        service.add(new SinhVien("3", "NV3", true, 2012, "0232"));
        service.add(new SinhVien("4", "NV4", false, 2008, "0382"));
        service.add(new SinhVien("5", "NV5", true, 2006, "05282"));
        return service;
    }
}
