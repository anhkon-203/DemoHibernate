/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Model;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author anhkon
 */

@Entity
@Table
public class LopHoc implements Serializable{
    @Id
    @Column(name = "ma_lop_hoc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maLopHoc;
    
    @Column(name = "ten_lop")
    private String tenLop;
    
    @ManyToOne
    @JoinColumn(name = "ma_bo_mon")
    private boMon bMon;
    
    @Column(name = "si_so")
    private Integer siSo;

    public LopHoc() {
    }

    public LopHoc(Integer maLopHoc, String tenLop, boMon bMon, Integer siSo) {
        this.maLopHoc = maLopHoc;
        this.tenLop = tenLop;
        this.bMon = bMon;
        this.siSo = siSo;
    }

    public Integer getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(Integer maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public boMon getbMon() {
        return bMon;
    }

    public void setbMon(boMon bMon) {
        this.bMon = bMon;
    }

    public Integer getsiSO() {
        return siSo;
    }

    public void setsiSO(Integer maSo) {
        this.siSo = maSo;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "maLopHoc=" + maLopHoc + ", tenLop=" + tenLop + ", bMon=" + bMon.getTenBoMon() + ", siSo=" + siSo + '}';
    }
    
    
}
