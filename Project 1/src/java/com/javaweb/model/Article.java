package com.javaweb.model;
// Generated Nov 19, 2016 12:01:31 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Article generated by hbm2java
 */
public class Article  implements java.io.Serializable {


     private Integer idarticle;
     private User user;
     private String titleArticle;
     private String headline;
     private Date createdDate;
     private Date modifiedDate;
     private String content;
     private String thumbnail;
     private String note;
     private Boolean public_;
     private Set<ArticleTags> articleTagses = new HashSet<ArticleTags>(0);
     private Set<Comment> comments = new HashSet<Comment>(0);
     private Set<ArticleDetailImages> articleDetailImageses = new HashSet<ArticleDetailImages>(0);
     private Set<LikeDislike> likeDislikes = new HashSet<LikeDislike>(0);

    public Article() {
    }

	
    public Article(User user, String titleArticle, String headline, Date createdDate, String content) {
        this.user = user;
        this.titleArticle = titleArticle;
        this.headline = headline;
        this.createdDate = createdDate;
        this.content = content;
    }
    public Article(User user, String titleArticle, String headline, Date createdDate, Date modifiedDate, String content, String thumbnail, String note, Boolean public_, Set<ArticleTags> articleTagses, Set<Comment> comments, Set<ArticleDetailImages> articleDetailImageses, Set<LikeDislike> likeDislikes) {
       this.user = user;
       this.titleArticle = titleArticle;
       this.headline = headline;
       this.createdDate = createdDate;
       this.modifiedDate = modifiedDate;
       this.content = content;
       this.thumbnail = thumbnail;
       this.note = note;
       this.public_ = public_;
       this.articleTagses = articleTagses;
       this.comments = comments;
       this.articleDetailImageses = articleDetailImageses;
       this.likeDislikes = likeDislikes;
    }
   
    public Integer getIdarticle() {
        return this.idarticle;
    }
    
    public void setIdarticle(Integer idarticle) {
        this.idarticle = idarticle;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getTitleArticle() {
        return this.titleArticle;
    }
    
    public void setTitleArticle(String titleArticle) {
        this.titleArticle = titleArticle;
    }
    public String getHeadline() {
        return this.headline;
    }
    
    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }
    
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    public Boolean getPublic_() {
        return this.public_;
    }
    
    public void setPublic_(Boolean public_) {
        this.public_ = public_;
    }
    public Set<ArticleTags> getArticleTagses() {
        return this.articleTagses;
    }
    
    public void setArticleTagses(Set<ArticleTags> articleTagses) {
        this.articleTagses = articleTagses;
    }
    public Set<Comment> getComments() {
        return this.comments;
    }
    
    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
    public Set<ArticleDetailImages> getArticleDetailImageses() {
        return this.articleDetailImageses;
    }
    
    public void setArticleDetailImageses(Set<ArticleDetailImages> articleDetailImageses) {
        this.articleDetailImageses = articleDetailImageses;
    }
    public Set<LikeDislike> getLikeDislikes() {
        return this.likeDislikes;
    }
    
    public void setLikeDislikes(Set<LikeDislike> likeDislikes) {
        this.likeDislikes = likeDislikes;
    }




}


