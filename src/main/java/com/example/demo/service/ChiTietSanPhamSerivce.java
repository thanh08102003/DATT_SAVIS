package com.example.demo.service;

import com.example.demo.entity.ChiTietSanPham;

import java.util.List;

public interface ChiTietSanPhamSerivce {

    List<ChiTietSanPham> getAll();

    List<ChiTietSanPham> getAllCtspOneSanPham();

    List<ChiTietSanPham> getAllDangHoatDong();

    List<ChiTietSanPham> getAllNgungHoatDong();

    List<ChiTietSanPham> add(
            List<String> listSanPham, List<String> listKichCo,
            List<String> listMauSac, List<String> listLoaiDe,
            List<String> listSoLuong, List<String> listDonGia);

    List<ChiTietSanPham> updateAllCtsp(
            List<String> listIdChiTietSp, List<String> listSanPham,
            List<String> listKichCo, List<String> listMauSac,
            List<String> listLoaiDe, List<String> listTrangThai,
            List<String> listSoLuong, List<String> listDonGia);

    ChiTietSanPham update(ChiTietSanPham chiTietSanPham);

    void remove(Long id);

    ChiTietSanPham getById(Long id);

    List<ChiTietSanPham> getAllById(Long id);

    List<ChiTietSanPham> getAllbyIdSPAndIdMS(Long idSanPham,Long idMauSac);

    List<ChiTietSanPham> getAllCtspByIdSanPham(Long idSanPham);

    List<ChiTietSanPham> fillAllDangHoatDongLonHon0();

}
