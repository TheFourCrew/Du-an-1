package com.javaweb.service;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

/**
 *
 * @author MinhNguyen
 */
public class Email {
    public static void sendEmail(String host, String port,
            final String name, final String password, String sender,
            String subject, String message, String senderName) throws AddressException, MessagingException {

        //set SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        //create a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(name, password);
            }
        };

        Session session = Session.getInstance(properties, auth);

        //creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(sender));
//        Address[] replyto  = sender;
        msg.setReplyTo(new InternetAddress[] {new InternetAddress(sender)});
        
        InternetAddress[] toAddresses = {new InternetAddress("minhncpk00629@fpt.edu.vn")};
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        try {
            msg.setSubject(MimeUtility.encodeText(subject, "utf-8", null));
            msg.setSentDate(new Date());
            msg.setText(message);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            Date date = new Date();
            msg.setContent("Thời gian: "+sdf.format(date)
                    +"<br/>Họ tên: <b>"+senderName+"</b>"
                    +"<br/>Email: "+sender
                    +"<br/><br/><b>Lời nhắn:</b> "+message, "text/html; charset=UTF-8");

        } catch (UnsupportedEncodingException e) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, e);
        }

        //send email
        Transport.send(msg);
    }
}
