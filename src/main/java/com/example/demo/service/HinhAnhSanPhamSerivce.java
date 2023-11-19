package com.example.demo.service;

import com.example.demo.entity.HinhAnhSanPham;
import com.example.demo.entity.SanPham;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface HinhAnhSanPhamSerivce {

    void saveImage(List<MultipartFile> files, SanPham sanPham);

    void saveWhenEditingImage(List<MultipartFile> files, Long id);

    List<HinhAnhSanPham> listHinhAnh(Long id);

    void deleteByID(Long id);

}
