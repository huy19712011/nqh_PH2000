package com.mycompany.nqh_ph2000.entity;

public class SinhVien {
    private String ma;
    private String ten;
    private boolean gioiTinh; // 0 = nu, 1 = nam
    private int namSinh;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, boolean gioiTinh, int namSinh) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", namSinh=" + namSinh + '}';
    }

    
}
