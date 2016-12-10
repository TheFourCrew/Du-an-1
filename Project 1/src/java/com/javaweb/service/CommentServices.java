package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.Comment;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MinhNguyen
 */
public class CommentServices {

    //Hàm thêm cmt
    public boolean InsertOrUpdateComment(Comment cmt) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(cmt);
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

    //Hàm lấy tất cả dữ liệu
    public ArrayList<Comment> getAll(String idsp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<Comment> cmt = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from Comment where comment_reply = 0 and id_article = " + idsp;
            Query query = session.createQuery(strQuery);
            cmt = (ArrayList<Comment>) query.list();
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return cmt;
    }

    //Hàm lấy cmt bằng idreply và idsp
    public ArrayList<Comment> getByIdspAndReply(String reply, String idSP) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<Comment> cmt = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from Comment where comment_reply = " + reply + " and id_article =" + idSP;
            Query query = session.createQuery(strQuery);
            cmt = (ArrayList<Comment>) query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return cmt;
    }

    //Hàm lấy tổng số comment
    public long getCountComment(String idSP) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        long countCMT = 0;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "select count(*) from Comment where id_article = " + idSP + "";
            Query query = session.createQuery(strQuery);
            countCMT = (long) query.uniqueResult();
            tx.commit();
            return countCMT;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return 0;
    }
}
