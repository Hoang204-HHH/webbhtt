package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String getProducts(Model model) {
        // Thêm sản phẩm vào model
        model.addAttribute("productName", "Laptop");
        model.addAttribute("price", 1500);
        return "sanpham";  // Trả về view sanpham.html
    }

    @GetMapping("/delete-product")
    public String deleteProduct() {
        // Code để xử lý việc xóa sản phẩm (giả lập)
        System.out.println("Sản phẩm đã bị xóa");
        return "sanpham"; // Trả về view sau khi xóa
    }

    @GetMapping("/edit-product")
    public String editProduct(Model model) {
        // Giả lập sửa sản phẩm
        model.addAttribute("productName", "Laptop - Đã sửa");
        model.addAttribute("price", 1200);
        return "sanpham";
    }
}
