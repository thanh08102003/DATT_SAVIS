package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "kich_co")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KichCo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ten")
    @NotNull(message = "Không được trống kích cỡ")
    @Min(value = 35,message = "Kích cỡ nhỏ nhất là 35")
    @Max(value = 45,message = "Kích cỡ lớn nhất là 45")
    private Integer ten;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "trang_thai")
    private Integer trangThai;

}
