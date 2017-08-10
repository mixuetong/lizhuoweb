package com.lizhuo.service;

import com.lizhuo.idao.IUserDAO;
import com.lizhuo.iservice.IUserService;
import com.lizhuo.model.UserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lizhuo6 on 2017/5/16.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDAO userDAO ;

    @Override
    public List<UserDo> findAllUser() {
        return userDAO.findAllUser();
    }

    @Override
    public UserDo getUser(String tel) {
        return userDAO.getUser(tel);
    }

//    @Override
//    public int addUser(UserDo userDo) {
//        return userDAO.addUser(userDo);
//    }
}
