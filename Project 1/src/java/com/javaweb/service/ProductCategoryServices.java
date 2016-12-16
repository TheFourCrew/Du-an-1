package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.ProductCategory;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MinhNguyen
 */
public class ProductCategoryServices {

    //Lấy tất cả dữ liệu
    public ArrayList<ProductCategory> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<ProductCategory> aPC = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from ProductCategory";
            Query query = session.createQuery(strQuery);
            aPC = (ArrayList<ProductCategory>) query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return aPC;
    }

    //Lấy theo id sản phảm
    public ProductCategory getbyid(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ProductCategory aPC = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from ProductCategory where idproduct_category = " + id;
            Query query = session.createQuery(strQuery);
            aPC = (ProductCategory) query.uniqueResult();
            tx.commit();
            return aPC;
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

    //Thêm dữ liệu
    public boolean InsertOrUpdate(ProductCategory pcy) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(pcy);
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
    
    //Lấy tất cả dữ liệu theo id cha
    public ArrayList<ProductCategory> getAllByIdParent(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<ProductCategory> aPC = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from ProductCategory where c_parent = "+id;
            Query query = session.createQuery(strQuery);
            aPC = (ArrayList<ProductCategory>) query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return aPC;
    }
}
