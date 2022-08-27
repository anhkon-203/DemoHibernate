/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.repository;

import com.Model.LopHoc;
import com.Model.boMon;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author anhkon
 */
public class LopHocRepository {

    public ArrayList<LopHoc> getListDB() {
        Session session = ConnectDB.getFACTORY().openSession();
        ArrayList<LopHoc> lstLop = (ArrayList<LopHoc>) session.createCriteria(LopHoc.class).list();
        return lstLop;
    }

    public ArrayList<boMon> addCbb() {
        Session session = ConnectDB.getFACTORY().openSession();
        ArrayList<boMon> lstMons = (ArrayList<boMon>) session.createCriteria(boMon.class).list();
        return lstMons;
    }

    public boolean them(LopHoc lopHoc) {
        Transaction transaction = null;
        try ( Session session = ConnectDB.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.save(lopHoc);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    public boolean xoa(LopHoc lopHoc) {
        Transaction transaction = null;
        try ( Session session = ConnectDB.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.delete(lopHoc);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    public boolean sua(String id, LopHoc lopHoc) {
        Transaction transaction = null;
        try ( Session session = ConnectDB.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(id, lopHoc);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return false;
    }

    public ArrayList<LopHoc> timKiem(int id) {
        ArrayList<LopHoc> lstLop = new ArrayList<>();
        LopHoc lopHoc = new LopHoc();
        try ( Session session = ConnectDB.getFACTORY().openSession()) {
            lopHoc = session.get(LopHoc.class, id);
            lstLop.add(lopHoc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstLop;

    }

    public static void main(String[] args) {
        ArrayList<LopHoc> list = new LopHocRepository().getListDB();
        for (LopHoc x : list) {
            System.out.println(x.toString());
        }
    }
}
