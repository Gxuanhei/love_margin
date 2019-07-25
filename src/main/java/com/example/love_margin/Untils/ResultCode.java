package com.example.love_margin.Untils;


import lombok.Data;

import java.io.Serializable;

//返回状态码
public enum ResultCode implements Serializable {
    /**
     * 成功
     */
    SUCCESS(200, "成功");




    ResultCode(int value, String msg) {
        this.val = value;
        this.msg = msg;

    }


    public int val() {
        return val;
    }

    public String msg() {
        return msg;
    }


    public void setdata(Object data) {
        this.data = data;
    }

    public void setdata1(String data) {
        this.data = data;
    }

    private int val;

    private String msg;

    private Object data = null;
    private String data1 = null;
    public Object result1(String data1) {
        result1 res = new result1();
        res.setData(data1);
        res.setMsg(this.msg);
        res.setVal(this.val);
        return res;

    }

    private int data2 = 0;
    public Object result2(int data2) {
        result2 res = new result2();
        res.setData(data2);
        res.setMsg(this.msg);
        res.setVal(this.val);
        return res;

    }
    public Object result(Object data) {
        result res = new result();
        res.setData(data);
        res.setMsg(this.msg);
        res.setVal(this.val);
        return res;
    }

    @Data
    class result {

        private int val;
        private String msg;
        private Object data = null;


    }
    @Data
    class result1 {

        private int val;
        private String msg;
        private String data = null;


    }

    @Data
    class result2 {

        private int val;
        private String msg;
        private int data = 0;


    }

}