package com.zxw.ruiw.Services;

import com.zxw.ruiw.Model.user;

import java.util.List;

public interface UserService {
    List<user> GetUserbyName(String name);
    void Insert(user us);
}
