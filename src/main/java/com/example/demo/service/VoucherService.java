package com.example.demo.service;


import com.example.demo.entity.Voucher;

import java.util.List;

public interface VoucherService {

    Voucher fillByMaVoucher();

    List<Voucher> findAll();

    Voucher findById(Long id);

    void deleteById(Long id);

    List<Voucher> fillAllDangDienRa();

    List<Voucher> fillAll();

    List<Voucher> fillAllDaKetThuc();

    List<Voucher> fillAllSapDienRa();

    Voucher save(Voucher voucher);

    boolean checkMaTrung(String ma);

    boolean checkMaTrungSua(String ma, String ten);

    boolean checkTenTrung(String ten);

    boolean checkTenTrungSua(String ma, String ten);

    boolean checkName(Long id, String ten);

    boolean checkCode(Long id, String ma);

    Voucher update(Voucher voucher);

    Voucher getById(Long id);

    public void updateVoucherStatus();
}
