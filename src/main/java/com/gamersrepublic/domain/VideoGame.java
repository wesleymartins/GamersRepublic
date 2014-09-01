/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gamersrepublic.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Wesley
 */
@Entity
public class VideoGame implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String gameId;
    private String title;
    private String genre;
    private String synopsis;
    private Date release;
    private String trailer;
    private String screenshot;
    private String review;
    private Double price;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getGameId() {
        return gameId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Date getRelease() {
        return release;
    }

    public String getTrailer() {
        return trailer;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public String getReview() {
        return review;
    }

    public Double getPrice() {
        return price;
    }
    
      private VideoGame(Builder build) {
        id = build.id;
        gameId = build.gameId;
        title  = build.title;
        genre = build.genre;
        synopsis = build.synopsis;       
        release = build.release;
        trailer = build.trailer;
        screenshot = build.screenshot;
        review = build.review;
        price = build.price;
       
    }
     
     public static class Builder{
        
        private Long id;
        private String gameId;
        private String title;
        private String genre;
        private String synopsis;
        private Date release;
        private String trailer;
        private String screenshot;
        private String review;
        private Double price;

        
         public Builder(String gameId){
            this.gameId = gameId;
        }
        
        public Builder id(Long n){            
            id = n ;
            return this;
        }
        
        public Builder title(String t){            
            title = t ;
            return this;
        }
        
         public Builder genre(String g){            
            genre = g;
            return this;
        }        
        
        public Builder synopsis(String s){
            synopsis = s;
            return this;
        }
        
         public Builder release(Date r){
            release = r;
            return this;
        }
         
          public Builder trailer(String t){
           trailer = t;
            return this;
        }
          
           public Builder screenshot(String s){
            screenshot = s;
            return this;
        }
           
            public Builder review(String r){
            review = r;
            return this;
        }
            
             public Builder price(Double p){
             price = p;
            return this;
        }
           
           
        
        public VideoGame build(){
            return new VideoGame(this);
        }
        
     }   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VideoGame)) {
            return false;
        }
        VideoGame other = (VideoGame) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gamersrepublic.domain.VideoGame[ id=" + id + " ]";
    }
    
}
