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

    //Hàm xóa hóa đơn
    public boolean DeleteReceipt(Receipt rt) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.delete(rt);
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

    //Hàm xóa chi tiết hóa đơn
    public boolean DeleteReceiptDetail(ReceiptDetail rdl) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.delete(rdl);
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

    //Hàm lấy hóa đơn theo mã hóa đơn
    public Receipt getReceiptById(String idRt) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Receipt rt = null;
        try {
            tx = session.getTransaction();
            tx.begin();

            Query query = session.createQuery("from Receipt where idreceipt = '" + idRt + "'");
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

    //Hàm lấy chi tiết hóa đơn theo mã hóa đơn
    public ArrayList<ReceiptDetail> getReceiptDetailByIdReceipt(String idRt) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<ReceiptDetail> rt = null;
        try {
            tx = session.getTransaction();
            tx.begin();

            Query query = session.createQuery("from ReceiptDetail where id_receipt = '" + idRt + "'");
            rt = (ArrayList<ReceiptDetail>) query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return rt;
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

    public ArrayList<Object[]> getTopSale() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<Object[]> aRDL = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "select sum(rd.quantity) as tong, rd.idProduct from ReceiptDetail rd group by rd.idProduct order by tong desc";
            Query query = session.createQuery(strQuery);
            query = query.setFirstResult(0);
            query.setMaxResults(1);
            aRDL = (ArrayList<Object[]>) query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return aRDL;
    }

    public ReceiptDetail getByIdPtAndIdRt(String idPt, String idRt) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ReceiptDetail rtdl = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from ReceiptDetail where id_receipt = " + idRt + " and id_product = " + idPt;
            Query query = session.createQuery(strQuery);
            rtdl = (ReceiptDetail) query.uniqueResult();
            tx.commit();
            return rtdl;
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
