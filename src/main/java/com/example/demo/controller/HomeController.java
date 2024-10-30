package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index") // Thêm dấu "/" để dễ dùng
    public String Index() {
        return "index"; // trả về tên view "index"
    }
    @RequestMapping("/gioithieu")
    public String gioithieu() {
        return "gioithieu"; // trả về trang gioithieu.html
    }
    @RequestMapping("/sanpham")
    public String sanpham() {
        return "sanpham"; // trả về trang sanpham.html
    }
    @RequestMapping("/lienhe")
    public String lienhe() {
        return "lienhe"; // trả về trang lienhe.html
    }
    @RequestMapping("/dangky")
    public String dangky() {
        return "dangky"; // trả về trang dangki.html
    }
    @RequestMapping("/dangnhap")
    public String dangnhap() {
        return "dangnhap"; // trả về trang dangnhap.html
    }
    @RequestMapping("/giohang")
    public String giohang() {
        return "giohang"; // trả về trang dangnhap.html
    }
}
