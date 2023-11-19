package com.example.demo.service.impl;


import com.example.demo.entity.HoaDonChiTiet;
import com.example.demo.repository.HoaDonChiTietRepository;
import com.example.demo.service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {

    @Autowired
    HoaDonChiTietRepository hoaDonChiTietRepository;

    @Override
    public List<HoaDonChiTiet> findAll() {
        return hoaDonChiTietRepository.findAll();
    }

    @Override
    public HoaDonChiTiet findById(Long id) {
        return hoaDonChiTietRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        hoaDonChiTietRepository.deleteById(id);
    }

    @Override
    public void saveOrUpdate(HoaDonChiTiet hoaDonChiTiet) {
        hoaDonChiTietRepository.save(hoaDonChiTiet);
    }

    @Override
    public List<HoaDonChiTiet> findByIdHoaDon(Long idHoaDon) {
        // TODO Auto-generated method stub
        return hoaDonChiTietRepository.findByIdHoaDon(idHoaDon);
    }
}
