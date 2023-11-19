package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@Table(name = "chi_tiet_san_pham")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "so_luong")
    @NotNull(message = "Số lượng không được trống.")
    @Min(value = 0, message = "Số lượng nhỏ nhất là 0")
    @Max(value = 99999, message = "Số lượng lớn nhất là 99999")
    private Integer soLuong;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @Column(name = "gia_hien_hanh")
    @NotNull(message = "Giá không được trống.")
    @Min(value = 10000, message = "Giá  nhỏ nhất là 10000")
    @Max(value = 1000000000, message = "Giá lớn nhất là 1000000000")
    private Long giaHienHanh;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "san_pham_id", referencedColumnName = "id")
    private SanPham sanPham;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kich_co_id", referencedColumnName = "id")
    private KichCo kichCo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "mau_sac_id", referencedColumnName = "id")
    private MauSac mauSac;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "loai_de_id", referencedColumnName = "id")
    private LoaiDe loaiDe;

//    @OneToMany(mappedBy = "chiTietSanPham",cascade = CascadeType.ALL)
//    private List<GioHangChiTiet> listGioHangChiTiet = new ArrayList<>();
}
