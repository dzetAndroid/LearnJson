package com.zet.learnjson.model;

/**
 * Created by Zet on 2017/6/11.
 */

public class Tupian {

    @Override
    public String toString() {
        return "Tupian{" +
                "title='" + title + '\'' +
                ", thumburl='" + thumburl + '\'' +
                ", sourceurl='" + sourceurl + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", classX='" + classX + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    /**
     * title : 给狗狗买的新玩具！
     * thumburl : http://ww3.sinaimg.cn/large/e4e2bea6jw1et836ononvj20c80vo0ut.jpg
     * sourceurl : http://down.laifudao.com/images/tupian/2015618111756.jpg
     * height : 1140
     * width : 440
     * class : 5
     * url : http://www.laifudao.com/tupian/45125.htm
     */

    private String title;
    private String thumburl;
    private String sourceurl;
    private String height;
    private String width;
    private String classX;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumburl() {
        return thumburl;
    }

    public void setThumburl(String thumburl) {
        this.thumburl = thumburl;
    }

    public String getSourceurl() {
        return sourceurl;
    }

    public void setSourceurl(String sourceurl) {
        this.sourceurl = sourceurl;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getClassX() {
        return classX;
    }

    public void setClassX(String classX) {
        this.classX = classX;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
