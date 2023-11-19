package com.example.demo.service.impl;

import com.example.demo.entity.GioHang;
import com.example.demo.repository.GioHangRepository;
import com.example.demo.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangServiceImpl implements GioHangService {

    @Autowired
    private GioHangRepository repository;

    @Override
    public List<GioHang> findAll() {
        return repository.findAll();
    }

    @Override
    public GioHang findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public GioHang save(GioHang gioHang) {
        return repository.save(gioHang);
    }

    @Override
    public GioHang update(GioHang gioHang) {
        return repository.save(gioHang);
    }

    @Override
    public Integer genMaTuDong() {

        String maStr = "";
        try {
            if (repository.index() != null) {
                maStr = repository.index().toString();
            } else {
                maStr = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (maStr == null) {
            maStr = "0";
            int ma = Integer.parseInt(maStr);
            return ++ma;
        }
        int ma = Integer.parseInt(maStr);
        return ++ma;

    }

    @Override
    public List<GioHang> findByTrangThai(Integer trangThai) {
        return null;
    }
}
