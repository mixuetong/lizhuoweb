package com.lizhuo.model;


import java.io.Serializable;

/**
 * Created by lizhuo6 on 2017/5/16.
 */
public class UserDo implements Serializable {
    private int id ;
    private String tel ;
    private String token ;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTel(){
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public String getToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }

}
