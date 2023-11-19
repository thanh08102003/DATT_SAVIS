package com.example.demo.repository;

import com.example.demo.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon, Long> {
    @Query("Select hd from HoaDon hd where hd.trangThai=:tt order by hd.ngayTao asc")
    List<HoaDon> findByTrangThai(@Param("tt") Integer trangThai);

    @Query("Select hd from HoaDon hd where hd.trangThai !=-1 order by hd.ngaySua desc")
    List<HoaDon> findAllOrderByNgaySua();

    @Query("Select hd from HoaDon hd where hd.maHoaDon=:ma")
    HoaDon findByMa(@Param("ma") String ma);

    @Query("select COUNT(hd) from HoaDon hd where hd.trangThai = -1")
    Integer countHoaDonTreo();

    @Query("Select hd from HoaDon hd where hd.trangThai=:tt order by hd.ngaySua desc")
    List<HoaDon> find5ByTrangThai(@Param("tt") Integer trangThai);
}
