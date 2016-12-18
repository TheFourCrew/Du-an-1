/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.Receipt;
import com.javaweb.model.ReceiptDetail;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MinhNguyen
 */
public class ReceiptServices {

    //Hàm thêm sửa hóa đơn
    public boolean InsertOrUpdateReceipt(Receipt rt) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(rt);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }

        return false;
    }

    //Hàm thêm sửa chi tiết hóa đơn
    public boolean InsertOrUpdateReceiptDetail(ReceiptDetail rdl) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(rdl);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return false;
    }

    //Hàm lấy hóa đơn theo số hóa đơn
    public Receipt getReceiptByNumber(String receiptNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Receipt rt = null;
        try {
            tx = session.getTransaction();
            tx.begin();

            Query query = session.createQuery("from Receipt where receipt_number = '" + receiptNumber + "'");
            rt = (Receipt) query.uniqueResult();
            tx.commit();
            return rt;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return null;
    }

    //Hàm phân trang 
    public int receiptcount = 0;

    public ArrayList<Receipt> getAllReceipt(int pageSize, int pageNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<Receipt> art = null;
        try {
            tx = session.getTransaction();
            tx.begin();

            Query query = session.createQuery("from Receipt order by idreceipt desc");
            receiptcount = query.list().size();
            query = query.setFirstResult(pageSize * (pageNumber - 1));
            query.setMaxResults(pageSize);
            art = (ArrayList) query.list();
            
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return art;
    }
}
