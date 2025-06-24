package com.example.ph51724_24062025.P2;
import java.util.*;
public class SanPhamService {
    private Map<String, SanPham> danhSach = new HashMap<>();

    public boolean them(SanPham entity) {
        if (entity == null || entity.getMa() == null || entity.getMa().isBlank()) return false;
        if (danhSach.containsKey(entity.getMa())) return false;
        if (entity.getTen() == null || entity.getTen().isBlank()) return false;
        danhSach.put(entity.getMa(), entity);
        return true;
    }

    public boolean sua(SanPham entity) {
        if (!danhSach.containsKey(entity.getMa())) return false;
        if (entity.getTen() == null || entity.getTen().isBlank()) return false;
        danhSach.put(entity.getMa(), entity);
        return true;
    }
    public SanPham timTheoMa(String ma) {
        return danhSach.get(ma);
    }
}
