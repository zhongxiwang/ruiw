package com.zxw.ruiw.Services;

import com.zxw.ruiw.Mapper.UserMapper;
import com.zxw.ruiw.Model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServicelimp")
public class UserServicelimp implements  UserService {

    @Autowired
    private UserMapper urm;

    @Override
    public List<user> GetUserbyName(String name) {

        return urm.GetUserByUsername(name);
    }

    @Override
    public void Insert(user us) {
        urm.Insert(us);
    }
}
