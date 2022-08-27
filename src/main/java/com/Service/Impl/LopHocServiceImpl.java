/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Service.Impl;

import com.Model.LopHoc;
import com.Model.boMon;
import com.Service.LopHocSerivce;
import com.repository.LopHocRepository;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class LopHocServiceImpl implements LopHocSerivce {

    private LopHocRepository lstRepo = new LopHocRepository();

    @Override
    public ArrayList<LopHoc> getList() {
        return lstRepo.getListDB();
    }

    @Override
    public ArrayList<boMon> addCBb() {
        return lstRepo.addCbb();
    }

    @Override
    public Boolean them(LopHoc lopHoc) {
        return lstRepo.them(lopHoc);
    }

    @Override
    public Boolean sua(String id,LopHoc lopHoc) {
        return lstRepo.sua(id,lopHoc);
    }

    @Override
   public boolean xoa(LopHoc lopHoc) {
       return lstRepo.xoa(lopHoc);
    }

    @Override
    public ArrayList<LopHoc> timKiem(int id) {
        return lstRepo.timKiem(id);
    }

}
