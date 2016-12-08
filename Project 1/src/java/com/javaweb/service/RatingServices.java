package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.ProductRating;
import com.javaweb.model.Rating;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MinhNguyen
 */
public class RatingServices {
    //Hàm đánh giá
    public boolean InsertRating(Rating rg) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(rg);
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

    //Hàm thêm vào product rating
    public boolean InsertProductRating(ProductRating prg) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(prg);
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
    
    //Hàm lấy id rating bằng
    public Rating getIdRating(String ten){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Rating rg = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Rating where name_user = '"+ten+"'");
            rg = (Rating) query.uniqueResult();
            tx.commit();
            return rg;
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
}
