package com.example.demo.service;

import com.example.demo.entity.ThuongHieu;

import java.util.List;

public interface ThuongHieuService {

    List<ThuongHieu> findAll();

    List<ThuongHieu> getAllDangHoatDong();

    List<ThuongHieu> getAllNgungHoatDong();

    void deleteById(Long id);

    ThuongHieu save(ThuongHieu thuongHieu);

    boolean checkTenTrung(String ten);

    boolean checkTenTrungSua(Long id, String ten);

    ThuongHieu update(ThuongHieu thuongHieu);

    ThuongHieu getById(Long id);

}
