package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.Product;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.commons.fileupload.FileItemStream;
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

    //Hàm thực hiện ghi file vào thư mục có sẵn
    public static boolean processFile(String path, FileItemStream item) {
        try {
            File f = new File(path + File.separator + "uploads");
            if (!f.exists()) {
                f.mkdir();
            }
            File savedFile = new File(f.getAbsolutePath() + File.separator + item.getName());
            FileOutputStream fos = new FileOutputStream(savedFile);
            InputStream is = item.openStream();

            int x = 0;
            byte[] b = new byte[1024];

            while ((x = is.read(b)) != -1) {
                fos.write(b, 0, x);
            }

            fos.flush();
            fos.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
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
}
