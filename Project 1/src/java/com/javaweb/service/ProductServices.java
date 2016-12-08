package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.Product;
import com.javaweb.model.ProductParameters;
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
public class ProductServices {

    public boolean InsertOrUpdateProduct(Product sp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(sp);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return false;
    }

    //Hàm lấy tất cả dữ liệu
    public ArrayList<Product> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList<Product> listProduct = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from Product";
            Query query = session.createQuery(strQuery);
            listProduct = (ArrayList<Product>) query.list();
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return listProduct;
    }

    //Hàm xóa sp
    public boolean DeleteProduct(Product pt) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.delete(pt);
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

    //Lấy sản phẩm theo id
    public Product GetById(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Product product = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from Product where idproduct = " + id;
            Query query = session.createQuery(strQuery);
            product = (Product) query.uniqueResult();
            tx.commit();
            return product;
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

    //Lấy sản phẩm theo tên
    public Product GetProductByName(String prodName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Product product = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            String strQuery = "from Product where product_name = '" + prodName + "'";
            Query query = session.createQuery(strQuery);
            product = (Product) query.uniqueResult();
            tx.commit();
            return product;
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

    //Thêm hoặc cập nhật thông số sản phẩm
    public boolean InsertOrUpdateParameters(ProductParameters parameter) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(parameter);
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

    //Hàm kiểm tra tên sản phẩm
    public boolean isProductExists(String tenSP) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        boolean result = false;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Product where product_name = '" + tenSP+"'");
            Product pt = (Product) query.uniqueResult();
            tx.commit();
            if (pt != null) {
                result = true;
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
//            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return result;
    }

}
