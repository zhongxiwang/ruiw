package com.zxw.ruiw.Mapper;

import com.zxw.ruiw.Controler.TestController;
import com.zxw.ruiw.Model.Recording;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("qian dao")
public interface RecodingMappser {
    @Select("select * from st_recording where login_name=#{loginame}")
    public List<Recording> GetLoginName(String loginname);

    @Insert("Insert into st_recording(login_name,content)values(#{lgoin_name},#{content},#{recdate})")
    public void Insert(Recording recod);

}
