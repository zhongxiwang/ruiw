package com.zxw.ruiw.Services;

import com.zxw.ruiw.Mapper.StUserMapper;
import com.zxw.ruiw.Model.St_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StUserService {
    @Autowired
    private StUserMapper stu;
    public List<St_User> GetStUserByLoginName(String loginame){
        return stu.GetSt_UserByLoginName(loginame);
    }

}
