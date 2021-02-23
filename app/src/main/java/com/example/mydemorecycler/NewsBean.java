package com.example.mydemorecycler;

/**
 * Created on 2/23/21
 * Author: hyplo
 * Email: haibowen088@gmail.com
 * Description: show me the code change the world
 */
public class NewsBean {

    public String name;
    public String imageSrc;

    public NewsBean(String name, String imageSrc) {
        this.name = name;
        this.imageSrc = imageSrc;
    }

    public String getName() {
        return name;
    }

    public NewsBean setName(String name) {
        this.name = name;
        return this;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public NewsBean setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
        return this;
    }
}
