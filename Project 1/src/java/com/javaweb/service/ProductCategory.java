package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MinhNguyen
 */
public class ProductCategory {

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
}
