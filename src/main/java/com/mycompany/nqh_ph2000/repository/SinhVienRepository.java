package com.mycompany.nqh_ph2000.repository;

import com.mycompany.nqh_ph2000.entity.SinhVien;
import java.util.ArrayList;
import java.util.List;

public class SinhVienRepository {

    public static List<SinhVien> list = new ArrayList<>();

    static {
        list.add(new SinhVien("sv01", "sinhVien 1", false, 2005));
        list.add(new SinhVien("sv02", "sinhVien 2", true, 2004));
        list.add(new SinhVien("sv03", "sinhVien 3", true, 2003));
        list.add(new SinhVien("sv04", "sinhVien 4", false, 2005));
    }

    public List<SinhVien> getAll() {
        return list;
    }

    public void add(SinhVien sv) {
        list.add(sv);
    }

    public SinhVien findSinhVien(String maSV, List<SinhVien> list) {
        for (SinhVien sv : list) {
            if (sv.getMa().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }

}
