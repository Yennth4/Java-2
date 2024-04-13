package de1_QLSP;

import java.util.ArrayList;

public class SanPhamService implements SanPhamInterface<SanPham>{
    
    private ArrayList<SanPham> listSP; 
    
    public SanPhamService()
    {
        this.listSP = new ArrayList<>();
    }
    
    @Override
    public void insert(SanPham sp)
    {
        this.listSP.add(sp);
    }
    
    @Override
    public void update(int viTri, SanPham sp)
    {
        this.listSP.set(viTri, sp);
    }
    
    @Override
    public void delete(int viTri)
    {
        this.listSP.remove(viTri);
    }

    public ArrayList<SanPham> getListSP() {
        return listSP;
    }

    public void setListSv(ArrayList<SanPham> listSP) {
        this.listSP = listSP;
    }
}

