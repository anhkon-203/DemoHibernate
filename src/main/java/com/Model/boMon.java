/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author anhkon
 */

@Entity
@Table
public class boMon implements Serializable{
       @Id
       @Column(name = "ma_bo_mon" , nullable = false)
       private String maBoMon;
       
       @Column(name = "ten_bo_mon")
       private String tenBoMon;

    public boMon() {
    }

    public boMon(String maBoMon, String tenBoMon) {
        this.maBoMon = maBoMon;
        this.tenBoMon = tenBoMon;
    }

    public String getMaBoMon() {
        return maBoMon;
    }

    public void setMaBoMon(String maBoMon) {
        this.maBoMon = maBoMon;
    }

    public String getTenBoMon() {
        return tenBoMon;
    }

    public void setTenBoMon(String tenBoMon) {
        this.tenBoMon = tenBoMon;
    }

    @Override
    public String toString() {
        return "boMon{" + "maBoMon=" + maBoMon + ", tenBoMon=" + tenBoMon + '}';
    }
       
}
