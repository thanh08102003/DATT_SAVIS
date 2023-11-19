package com.example.demo.service;

import com.example.demo.entity.LoaiDe;

import java.util.List;

public interface LoaiDeService {

    List<LoaiDe> findAll();

    List<LoaiDe> getAllDangHoatDong();

    List<LoaiDe> getAllNgungHoatDong();

    void deleteById(Long id);

    LoaiDe save(LoaiDe loaiDe);

    boolean checkTenTrung(String ten);

    boolean checkTenTrungSua(Long id, String ten);

    LoaiDe update(LoaiDe loaiDe);

    LoaiDe getById(Long id);

}
