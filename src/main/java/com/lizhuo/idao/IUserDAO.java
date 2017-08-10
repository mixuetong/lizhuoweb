package com.lizhuo.idao;

import com.lizhuo.model.UserDo;

import java.util.List;

/**
 * Created by lizhuo6 on 2017/5/16.
 */
public interface IUserDAO {
    public List<UserDo> findAllUser();

    public UserDo getUser(String tel);

//    public int addUser(UserDo userDo);
}
