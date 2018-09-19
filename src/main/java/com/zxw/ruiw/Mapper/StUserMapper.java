package com.zxw.ruiw.Mapper;

import com.zxw.ruiw.Model.St_User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("StUserMapper")
public interface StUserMapper {
    @Select("select * from st_user where login_name=#{login_name}")
    public List<St_User> GetSt_UserByLoginName(@Param("login_name") String login_name);

    public  void Insert(St_User user);
}
