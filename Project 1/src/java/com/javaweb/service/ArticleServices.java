/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.Article;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ilove
 */
public class ArticleServices {
    public boolean InsertNews(Article news){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(news);
            tx.commit();
        } catch (Exception e) {
            if(tx != null){
                tx.rollback();
                return false;
            }
        }finally{
            session.close();
        }
        return true;
    }
    
    public Article GetNewsByID(String newsID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Article news = null;
        Transaction tx = null;

        try {
            tx = session.getTransaction();
            tx.begin();

            Query query = session.createQuery("from Article where id = " + newsID);
            news = (Article) query.uniqueResult();
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return news;
    }
    public boolean DeleteNews(Article news) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.delete(news);
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
    
     public int newscount = 0;
    public ArrayList<Article> getAllNews(int pageSize, int pageNumber){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList listNews = new ArrayList<Article>();
        
        try {
            tx = session.getTransaction();
            tx.begin();
            
            Query query = session.createQuery("from Article order by datecreated desc");
            newscount = query.list().size();
            query = query.setFirstResult(pageSize * (pageNumber - 1));
            query.setMaxResults(pageSize);            
            listNews = (ArrayList) query.list();
            
            tx.commit();
            
        } catch (Exception e) {
            if(tx!=null){
                tx.rollback();
            }
            
        }finally{
            session.close();
        }
        
        return listNews;
    }
}
