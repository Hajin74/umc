package com.example.moamoa;

public class MyData {

    private long _id;
    private String title;
    private String text;
    private String point;

    public MyData() {

    }

    public MyData(long _id, String title, String text, String point) {
        this._id = _id;
        this.title = title;
        this.text = text;
        this.point = point;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }
}
