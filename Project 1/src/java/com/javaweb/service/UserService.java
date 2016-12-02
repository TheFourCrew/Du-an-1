/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.service;

import com.javaweb.hibernate.util.HibernateUtil;
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
}
