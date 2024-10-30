package com.example.demo.controller;

public class HANGHOA {
    private String mahang;
    private String tennhang;
    private int dongia;
    private String xuatxu;
    private String maloaihang;

    public HANGHOA(String mahang, String tennhang, int dongia, String xuatxu, String maloaihang) {
        this.mahang = mahang;
        this.tennhang = tennhang;
        this.dongia = dongia;
        this.xuatxu = xuatxu;
        this.maloaihang = maloaihang;
    }

    // Getters and Setters
    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTennhang() {
        return tennhang;
    }

    public void setTennhang(String tennhang) {
        this.tennhang = tennhang;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getMaloaihang() {
        return maloaihang;
    }

    public void setMaloaihang(String maloaihang) {
        this.maloaihang = maloaihang;
    }

    @Override
    public String toString() {
        return "HANGHOA [mahang=" + mahang + ", tennhang="
                + tennhang + ", dongia=" + dongia +
                ", xuatxu=" + xuatxu +
                ", maloaihang=" + maloaihang + "]";
    }
}
