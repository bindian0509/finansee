package com.bharat.finansee.controller;

import java.util.StringJoiner;

/**
 * @author : bharat.verma
 * @created : 10/04/22, Sunday
 **/
public class HelloWorldBean {

    String msg;

    public HelloWorldBean(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", HelloWorldBean.class.getSimpleName() + "[", "]")
                .add("msg='" + msg + "'")
                .toString();
    }
}
