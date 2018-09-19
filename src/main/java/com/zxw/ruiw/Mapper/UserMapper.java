package com.zxw.ruiw.Mapper;

import com.zxw.ruiw.Model.user;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("UserMapperMapper")
public interface UserMapper {
    @Select("SELECT username,age from user where username=#{username}")
    List<user> GetUserByUsername(@Param("username") String username);

    @Insert("insert into user(username,age)values(#{username},#{age})")
    void  Insert(user use);

    @Update("UPDATE users SET username=#{userName},age=#{age} WHERE age =#{age}")
    void update(user user);

    @Delete("DELETE FROM user WHERE age =#{id}")
    void delete(Long age);
}
