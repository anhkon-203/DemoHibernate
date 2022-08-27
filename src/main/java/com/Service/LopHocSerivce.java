/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Service;

import com.Model.LopHoc;
import com.Model.boMon;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public interface LopHocSerivce {

    public ArrayList<LopHoc> getList();

    public ArrayList<LopHoc> timKiem(int id);

    public ArrayList<boMon> addCBb();

    public Boolean them(LopHoc lopHoc);

    public Boolean sua(String id, LopHoc lopHoc);

    public boolean xoa(LopHoc lopHoc);

}
