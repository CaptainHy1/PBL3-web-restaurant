package com.example.dao;



import java.util.List;

import com.example.models.KhuyenMai;

public class test {
    public static void main(String[] args) throws Exception {
        KhuyenMaiDAO dao = new KhuyenMaiDAO();

        // Test thêm
        KhuyenMai km = new KhuyenMai("6", 20.0, "GG20", 
                                      java.time.LocalDate.of(2023, 10, 1), 
                                      java.time.LocalDate.of(2023, 10, 31));
        dao.insert(km);

        // Test lấy danh sách
        List<KhuyenMai> danhSach = dao.getAll();
        for (KhuyenMai k : danhSach) {
            System.out.println("ID: " + k.getProId() + ", Discount: " + k.getDiscount() + 
                               ", Code: " + k.getMaGiamGia() + 
                               ", Start Date: " + k.getStartDate() + 
                               ", End Date: " + k.getEndDate());
        }
    }
}
