package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "san_pham")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ma", length = 50, nullable = false)
    private String ma;

    @Column(name = "ten", length = 255)
    @NotBlank(message = "Tên sản phẩm không được trống")
    private String ten;

    @Column(name = "mo_ta")
    @NotBlank(message = "Mô tả sản phẩm không được trống")
    private String moTa;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "nguoi_tao", length = 100)
    private String nguoiTao;

    @Column(name = "nguoi_sua", length = 100)
    private String nguoiSua;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "thuong_hieu_id", referencedColumnName = "id")
    private ThuongHieu thuongHieu;

    @OneToMany(mappedBy = "sanPham",cascade = CascadeType.ALL)
    private List<HinhAnhSanPham> listHinhAnhSanPham = new ArrayList<>();

}
