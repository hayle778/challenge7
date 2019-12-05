package com.example.demo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
public class Job {

       @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
       private long id ;

      @NotNull
        @Size(min=3)
        private String title;

      @NotNull
        @Size(min=10)
        private String description;

        @NotNull
        @Size(min=3)
        private long postdate;

        @NotNull
        @Size(min=5)
        private String author;

        @NotNull
        @Size(min=3)
        private long phone;

        @NotNull
        @Size(min=5)
        private String Features ;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPostdate() {
        return postdate;
    }

    public void setPostdate(long postdate) {
        this.postdate = postdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getFeatures() {
        return Features;
    }

    public void setFeatures(String features) {
        Features = features;
    }
}

