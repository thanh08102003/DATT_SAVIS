package com.example.demo.service;

import com.example.demo.entity.GioHangChiTiet;
import com.example.demo.entity.HoaDonChiTiet;

import java.util.List;

public interface GioHangChiTietService {

    List<GioHangChiTiet> findAll();

    List<GioHangChiTiet> findAllByIdGioHang(Long idGioHang);

    GioHangChiTiet fillById(Long id);

    Integer soLuongSPGioHangCT(Long idGioHang);

    List<GioHangChiTiet> findAllById(List<String> listIdString,Long idGioHang);

    HoaDonChiTiet addHoaDon(List<String> listStringIdGioHangCT, Long tongTien, Long tongTienSale,
                            String hoVaTen, String soDienThoai, String tienShip, String email,
                            String voucher, String diaChiCuThe, String ghiChu,
                            String phuongXaID, String quanHuyenID, String thanhPhoID,Long idGioHang);

    void deleteById(Long id);

    GioHangChiTiet save(Long idGioHang, Long idChiTietSp, Integer soLuong);

    GioHangChiTiet update(GioHangChiTiet gioHangChiTiet);

    List<GioHangChiTiet> findByTrangThai(Integer trangThai);

}
