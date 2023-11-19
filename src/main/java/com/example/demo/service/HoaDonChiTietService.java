package com.example.demo.service;



import com.example.demo.entity.HoaDonChiTiet;

import java.util.List;

public interface HoaDonChiTietService {
    List<HoaDonChiTiet> findAll();
    HoaDonChiTiet findById(Long id);
    void deleteById(Long id);
    void saveOrUpdate(HoaDonChiTiet hoaDonChiTiet);
    List<HoaDonChiTiet> findByIdHoaDon(Long idHoaDon);
}
