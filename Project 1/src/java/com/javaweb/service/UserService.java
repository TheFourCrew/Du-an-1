package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
import com.javaweb.model.Product;
import com.javaweb.model.RoleUser;
import com.javaweb.model.User;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class UserService {
    //Hàm kiểm tra đăng nhập
    public boolean CheckLogin(String giaTri,String password){
        User user=GetUserByEmailOrUserName(giaTri);
        if(user!=null){
            if(user.getPassword().equals(password)){
                return true;
            }else{
                return false;
            }
            
        }else{
            
            return false;
        }
    }
    //Hàm lấy thông tin bằng email hoặc tên đn
    public User GetUserByEmailOrUserName(String gt){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        User user=null;
        try {
            tx=session.getTransaction();
            tx.begin();
            String strQuery="from User where email='"+gt+"' or username='"+gt+"'";
            Query query=session.createQuery(strQuery);
            user=(User)query.uniqueResult();
            tx.commit();
            
        } catch (Exception e) {
            if(tx!=null){
                tx.rollback();
            }
            System.out.println(e.toString());
        }finally{
            session.close();
        }
        return user;
        }
    
    //Hàm lấy thông tin theo id
     public User getUserByID(String userID){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        try {
            tx=session.getTransaction();
            tx.begin();
            String strQuery="from User where iduser="+userID;
            Query query=session.createQuery(strQuery);
            User user=(User)query.uniqueResult();
            tx.commit();
            return user;
        } catch (Exception e) {
            if(tx!=null){
                tx.rollback();
            }
            System.out.println(e.toString());
        }finally{
            session.close();
        }
        return null;
    }
     
     //Hàm thêm hoặc cập nhật user
     public boolean InserUser(User user){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction tx= null;
        try {
            
            tx=session.getTransaction();
            tx.begin();
            session.saveOrUpdate(user);
            tx.commit();
            return true;
        } catch (Exception e) {
            if(tx!=null){
                tx.rollback();
            }
            System.out.println(e.toString());
        }finally{
            session.close();
        }
        return false;
    }
     
     //Hàm lấy tất cả thông tin
     public ArrayList<User>GetAllUsers(){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        ArrayList<User>listUsers=new ArrayList<User>();
        try {
            tx=session.getTransaction();
            tx.begin();
            Query query=session.createQuery("from User");
            listUsers=(ArrayList) query.list();
            tx.commit();
        } catch (Exception e) {
            if(tx!=null){
                tx.rollback();
            }
            System.out.println(e.toString());
        }finally{
            session.close();
        }
        return listUsers;
    }
     //Hàm lấy tất cả thông tin quyền
     public ArrayList<RoleUser>GetAllRole(){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        ArrayList<RoleUser>listRole=new ArrayList<RoleUser>();
        try {
            tx=session.getTransaction();
            tx.begin();
            Query query=session.createQuery("from RoleUser");
            listRole=(ArrayList) query.list();
            tx.commit();
        } catch (Exception e) {
            if(tx!=null){
                tx.rollback();
            }
            System.out.println(e.toString());
        }finally{
            session.close();
        }
        return listRole;
    }
     
     //Hàm xóa thông tin
     public boolean DeleteUser(User user){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        try {
            tx=session.getTransaction();
            tx.begin();
            session.delete(user);
            tx.commit();
            return true;
        } catch (Exception e) {
            if(tx!=null){
                tx.rollback();
            }
            System.out.println(e.toString());
        }finally{
        session.close();
    }
        return false;
}
     //Hàm kiểm tra tên người dùng
    public boolean isUserExists(String tenND) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        boolean result = false;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from User where username = '" + tenND + "'");
            User pt = (User) query.uniqueResult();
            tx.commit();
            if (pt != null) {
                result = true;
            }
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }
        return result;
    }
    public int usertcount = 0;
    public ArrayList<User> getAllUser(int pageSize, int pageNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        ArrayList listUsers = new ArrayList<User>();

        try {
            tx = session.getTransaction();
            tx.begin();

            Query query = session.createQuery("from User order by iduser desc");
            usertcount = query.list().size();
            query = query.setFirstResult(pageSize * (pageNumber - 1));
            query.setMaxResults(pageSize);
            listUsers = (ArrayList) query.list();

            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.toString());
        } finally {
            session.close();
        }

        return listUsers;
    }
}
