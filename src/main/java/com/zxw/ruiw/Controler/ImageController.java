package com.zxw.ruiw.Controler;

import com.zxw.ruiw.Model.menum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import  com.extend.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@Controller
public class ImageController {

    @Value("${ImagePath}")
    String ImagePath;

    @Value("${UseCurrentPath}")
    Boolean UseCurrentPath;


    @RequestMapping(value = "/Image/{id}",method = RequestMethod.GET)
    @ResponseBody
    public   byte[] GetImage(@PathVariable String id,HttpServletRequest request,
                             HttpServletResponse response) throws IOException {
        //获取当前路径
        String CurrentPath=ImagePath;
        if(UseCurrentPath)CurrentPath=System.getProperty("user.dir")+"\\"+ImagePath;
        //RandomAccessFile f = new RandomAccessFile("/home/vivex/apache-tomcat-7.0.59/tmpFiles/1.jpg", "r");
        byte[] tmp= ZFile.ReadFile(CurrentPath+"\\"+id);
        return  tmp;
    }
}
