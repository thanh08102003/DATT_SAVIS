package com.example.demo.service;

import com.example.demo.entity.KichCo;

import java.util.List;

public interface KichCoService {

    List<KichCo> findAll();

    List<KichCo> getAllDangHoatDong();

    List<KichCo> getAllNgungHoatDong();

    void deleteById(Long id);

    KichCo save(KichCo kichCo);

    boolean checkTenTrung(Integer ten);

    boolean checkTenTrungSua(Long id, Integer ten);

    KichCo update(KichCo kichCo);

    KichCo getById(Long id);

}
