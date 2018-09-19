package com.zxw.ruiw.Controler;

import com.zxw.ruiw.Model.Tree;
import com.zxw.ruiw.Services.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class TreeController {
    @Autowired
    private TreeService Service;




    @RequestMapping(value="/tree",method = RequestMethod.GET)
    public  @ResponseBody
    List<Tree> GetTree(int id){

        return  Service.GetTree(id);
    }

}
