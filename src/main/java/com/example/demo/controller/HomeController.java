package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/home")
public class HomeController {

    private Long idTaiKhoan = Long.valueOf(4);

    @Autowired
    private ChiTietSanPhamSerivce chiTietSanPhamSerivce;

    @Autowired
    private KichCoService kichCoService;

    @Autowired
    private MauSacService mauSacService;

    @Autowired
    private LoaiDeService loaiDeService;

    @Autowired
    private GioHangService gioHangService;



    @Autowired
    private VoucherService voucherService;

    @Autowired
    private GioHangChiTietService gioHangChiTietService;

    private Date currentDate = new Date();

    @GetMapping("/home")
    public String home() {

        return "/customer-template/ban-hang-customer";

    }

    @GetMapping("/dang-nhap")
    public String dangNhap() {

        return "/customer-template/dang-nhap";
    }

    @GetMapping("/dang-ky")
    public String dangKy() {

        return "/customer-template/dang-ky";
    }

    @GetMapping("/cart")
    public String cart(
            Model model
    )

    @GetMapping("/cart/detele/{id}")
    public String deleteCart(
            @PathVariable("id") Long id
    ) {
        gioHangChiTietService.deleteById(id);
        return "redirect:/cart";
    }

    @GetMapping("/cart/update/{id}")
    public String updateCart(
            @PathVariable("id") Long id,
            @RequestParam("soLuong") String soLuong
    ) {
        GioHangChiTiet gioHangChiTiet = gioHangChiTietService.fillById(id);
        gioHangChiTiet.setSoLuong(Integer.valueOf(soLuong));
        gioHangChiTietService.update(gioHangChiTiet);
        return "redirect:/cart";
    }

    @PostMapping("/gio-hang-chi-tiet/add/{idChiTietSpAdd}/{soLuongAdd}")
    public String addGioHangChiTiet(
            @PathVariable String idChiTietSpAdd,
            @PathVariable String soLuongAdd
    )

    @PostMapping("/gio-hang-chi-tiet/add-fast/{idChiTietSpAdd}/{soLuongAdd}")
    public String addGioHangChiTietNhanh(
            @PathVariable String idChiTietSpAdd,
            @PathVariable String soLuongAdd
    )

    @PostMapping("/dia-chi/update")
    public String updateDiaChi(
            @RequestParam("idDiaChi") Long idDiaChi,
            @RequestParam("phuongXa") String phuongXa,
            @RequestParam("quanHuyen") String quanHuyen,
            @RequestParam("thanhPho") String thanhPho,
            @RequestParam("diaChiCuThe") String diaChiCuThe,
            @RequestParam("trangThai") Integer trangThai
    )



        return "redirect:/cart";
    }

    @PostMapping("/dia-chi/add")
    public String adđDiaChi(
            @RequestParam("phuongXaID") String phuongXa,
            @RequestParam("quanHuyenID") String quanHuyen,
            @RequestParam("thanhPhoID") String thanhPho,
            @RequestParam("diaChiCuThe") String diaChiCuThe
    ) {

    }

    @GetMapping("/checkout")
    public String checkout(
            @RequestParam String options,
            Model model
    )

    @PostMapping("/checkout/add")
    public String addHoaDon(
            @RequestParam("idGioHangChiTiet") String idGioHangChiTiet,
            @RequestParam("tongTien") String tongTien,
            @RequestParam("tongTienAndSale") String tongTienAndSale,
            @RequestParam("hoVaTen") String hoVaTen,
            @RequestParam("soDienThoai") String soDienThoai,
            @RequestParam("tienShip") String tienShip,
            @RequestParam("email") String email,
            @RequestParam("voucher") String voucher,
            @RequestParam("diaChiCuThe") String diaChiCuThe,
            @RequestParam("ghiChu") String ghiChu,
            @RequestParam("phuongXaID") String phuongXaID,
            @RequestParam("quanHuyenID") String quanHuyenID,
            @RequestParam("thanhPhoID") String thanhPhoID
    ) {
        String[] optionArray = idGioHangChiTiet.split(",");
        List<String> listIdString = Arrays.asList(optionArray);

        Voucher voucherGet = voucherService.fillByMaVoucher();
        if (voucherGet.getMaVoucher().equalsIgnoreCase(voucher)) {
            gioHangChiTietService.addHoaDon(listIdString, Long.valueOf(tongTien), Long.valueOf(tongTienAndSale), hoVaTen,
        } else {
            gioHangChiTietService.addHoaDon(listIdString, Long.valueOf(tongTien), Long.valueOf(tongTienAndSale), hoVaTen,
        }
        return "redirect:/thankyou";
    }

    @GetMapping("/shop")
    public String shop(
            Model model
    ) {
        model.addAttribute("listChiTietSP", chiTietSanPhamSerivce.getAllCtspOneSanPham());
        model.addAttribute("listMauSac", mauSacService.findAll());

        model.addAttribute("listKichCo", kichCoService.findAll());
        model.addAttribute("listLoaiDe", loaiDeService.findAll());
        return "/customer-template/shop";
    }

//    @PostMapping("/gio-hang/add")
//    public String addGioHang(
//    ) {
//        GioHang gioHang = new GioHang();
//        gioHang.setMaGioHang("GH" + gioHangService.genMaTuDong());
//        gioHang.setGhiChu("");
//        gioHang.setNgayTao(currentDate);
//        gioHang.setNgayTao(currentDate);
//        gioHang.setTaiKhoan(TaiKhoan.builder().id(idTaiKhoan).build());
//        gioHang.setTrangThai(0);
//        gioHangService.save(gioHang);
//        return "redirect:/shop";
//    }


    @GetMapping("/chi-tiet-san-pham/{idSanPham}/{idMauSac}")
    @ResponseBody
    public List<ChiTietSanPham> getAllbyIdSPAndIdMS(
            @PathVariable String idSanPham,
            @PathVariable String idMauSac
    ) {
        List<ChiTietSanPham> listChiTietSanPham1 = chiTietSanPhamSerivce.getAllbyIdSPAndIdMS(Long.valueOf(idSanPham), Long.valueOf(idMauSac));
        return listChiTietSanPham1;
    }

    @GetMapping("/shop-single/{id}")
    public String shopSingle(
            @PathVariable("id") String id,
            Model model
    ) {
        ChiTietSanPham ChiTietSanPham = chiTietSanPhamSerivce.getAllById(Long.valueOf(id)).get(0);
        List<ChiTietSanPham> listChiTietSanPham = chiTietSanPhamSerivce.getAllById(Long.valueOf(id));

        model.addAttribute("chiTietSp", ChiTietSanPham);
        model.addAttribute("listChiTietSp", listChiTietSanPham);
        return "/customer-template/shop-single";
    }

    @GetMapping("/about")
    public String about() {

        return "/customer-template/about";
    }

    @GetMapping("/thankyou")
    public String thankYou() {

        return "/customer-template/thankyou";
    }


}
