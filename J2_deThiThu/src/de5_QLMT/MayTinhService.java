package de5_QLMT;

import java.util.ArrayList;
import java.util.List;


public class MayTinhService {
    
    List<MayTinh> listMT = new ArrayList<>();

    public List<MayTinh> getListMT() {
        return listMT;
    }

    public void setListMT(List<MayTinh> listMT) {
        this.listMT = listMT;
    }
    
    public void them(MayTinh mt){
        listMT.add(mt);
    }
    
    public void sua(int index , MayTinh mt){
        listMT.set(index, mt);
    }
    
    public void xoa(int index){
        listMT.remove(index);
    }
    
    List<MayTinh> fakeData(){
        
        listMT.add(new MayTinh("Ma1", "Den", 128, "Dell", 2000, true));
        listMT.add(new MayTinh("Ma2", "Trang", 64, "Vivo", 5000, false));
        listMT.add(new MayTinh("Ma3", "Den", 256, "Dell", 10000, true));
        listMT.add(new MayTinh("Ma4", "Vang", 512, "Asus", 2000, false));
        listMT.add(new MayTinh("Ma5", "Trang", 512, "Vivo", 1000, true));
        return listMT;
    }
}
