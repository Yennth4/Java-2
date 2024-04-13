package de1_QLSP;

public interface SanPhamInterface<T> {

    public void insert(T sp);

    public void update(int viTri, T sp);

    public void delete(int viTri);
}
