package com.example.demo.service;

import com.example.demo.entity.HoaDon;

import java.util.List;


public interface HoaDonService {
    List<HoaDon> findAll();

    HoaDon findById(Long id);

    void deleteById(Long id);

    void saveOrUpdate(HoaDon hoaDon);

    List<HoaDon> findByTrangThai(Integer trangThai);

    Integer countHoaDonTreo();

    List<HoaDon> find5ByTrangThai(Integer trangThai);

    HoaDon findByMa(String ma);
    List<HoaDon> findAllOrderByNgaySua();
}
