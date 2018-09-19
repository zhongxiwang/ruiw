package com.zxw.ruiw.Controler;

import com.zxw.ruiw.Model.Recording;
import com.zxw.ruiw.Model.St_User;
import com.zxw.ruiw.Model.user;
import com.zxw.ruiw.Services.RecodingService;
import com.zxw.ruiw.Services.StUserService;
import com.zxw.ruiw.Services.UserService;
import com.zxw.ruiw.Services.UserServicelimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    UserServicelimp usm;
    @Autowired
    StUserService us;
    @Autowired
    RecodingService Rs;

    @RequestMapping("/hello")
    public List<user> Hello(){
        return usm.GetUserbyName("zxw");
    }


    @RequestMapping("/test")
    public  List<St_User> test(){ return us.GetStUserByLoginName("zxw"); }
    @RequestMapping("/ins")
    public  String Inser(){
        user us= new user();
        us.setAge(88);
        us.setUsername("ys");

        usm.Insert(us);
        return  "Ok";
    }
    @RequestMapping("/Rec")
    public  String InserRec(){
        Recording rec=new Recording();
        rec.setContent("test");
        rec.setLogin_name("test");
        rec.setRecdate(new Date());
        Rs.Insert(rec);
        return "Ok";
    }
}
