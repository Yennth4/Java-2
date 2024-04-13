package de4_QLDT;


import java.util.ArrayList;
import java.util.List;

public class Dienthoaiservice {
    
    // List để thêm sửa xóa bên service rồi hiển thị sang JFrame
    List<Dienthoai> listdt = new ArrayList<>();

    public List<Dienthoai> getListdt() {
        return listdt;
    }

    public void setListdt(List<Dienthoai> listdt) {
        this.listdt = listdt;
    }
    
    public void Them(Dienthoai dt){
        listdt.add(dt);
    }
    public void Sua(int index, Dienthoai dt){
        listdt.set(index, dt);
        
    }
    
    public void Xoa(int index){
        listdt.remove(index);
    }
    List<Dienthoai> fakeData(){
        
        listdt.add(new Dienthoai("NV1", "Oppo", "Đen", 128, 5000));
        listdt.add(new Dienthoai("NV2", "Samsung", "Trắng", 64, 2000));
        listdt.add(new Dienthoai("NV3", "Apple", "Vàng", 256, 10000));
        listdt.add(new Dienthoai("NV4", "Oppo", "Đen", 128, 1000));
        listdt.add(new Dienthoai("NV5", "Oppo", "Đen", 512, 3000));
        return listdt;
    }
}