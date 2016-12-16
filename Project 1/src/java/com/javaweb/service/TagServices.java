/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.ProductTags;
import com.javaweb.model.Tags;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MinhNguyen
 */
public class TagServices {
    //Thêm hoặc cập nhật thẻ
    public boolean InsertOrUpdateTags(Tags tag) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(tag);
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

    //Lấy thẻ theo tên
    public Tags GetByTagName(String tagName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Tags tag = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from Tags where tag_name = '" + tagName + "'";
            Query query = session.createQuery(strQuery);
            tag = (Tags) query.uniqueResult();
            tx.commit();
            return tag;
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

    //Thêm hoặc cập nhật sản phẩm thẻ chi tiết
    public boolean InsertOrUpdateProductTags(ProductTags proTag) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(proTag);
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

    //Lấy thẻ theo id
    public Tags GetByTagsId(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Tags tag = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from Tags where idtags = " + id;
            Query query = session.createQuery(strQuery);
            tag = (Tags) query.uniqueResult();
            tx.commit();
            return tag;
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

    //Lấy chi tiết thẻ theo id
    public ArrayList<ProductTags> GetProductTagsById(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<ProductTags> prodTag = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from ProductTags where id_product = " + id;
            Query query = session.createQuery(strQuery);
            prodTag = (ArrayList<ProductTags>) query.list();
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return prodTag;
    }

    //Lấy chi tiết thẻ theo id sản phẩm
    public ProductTags GetProductTagByIdProdnTag(String idProd, String idTag) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ProductTags prodTag = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from ProductTags where id_product = '" + idProd + "' and id_tag = '" + idTag + "'";
            Query query = session.createQuery(strQuery);
            prodTag = (ProductTags) query.uniqueResult();
            tx.commit();
            return prodTag;
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
    //from ProductTags where id_product = 37
    
}
