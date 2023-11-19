package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "gio_hang")
@Builder
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_gio_hang", length = 20)
    private String maGioHang;

    @Column(name = "ghi_chu", length = 255)
    private String ghiChu;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "trang_thai")
    private Integer trangThai;

//    @ManyToOne(fetch = FetchType.LAZY )


    //    @OneToMany
//    private List<GioHangChiTiet> listGioHangChiTiet;
//
//    public Double tongTienHoaDon (){
//        Double total = (double) 0;
//        for (GioHangChiTiet gioHangChiTiet : listGioHangChiTiet) {
//            total+=gioHangChiTiet.tongTien();
//        }
//        return total;
//    }

}
