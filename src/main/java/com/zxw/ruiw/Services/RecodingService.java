package com.zxw.ruiw.Services;

import com.zxw.ruiw.Mapper.RecodingMappser;
import com.zxw.ruiw.Model.Recording;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecodingService {
    @Autowired
    RecodingMappser rm;
    public List<Recording> GetRec(String LoginName){
        return rm.GetLoginName(LoginName);
    }
    public  void Insert(Recording Rec){
        rm.Insert(Rec);
    }
}
