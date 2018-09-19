package com.zxw.ruiw.Mapper;

import com.zxw.ruiw.Model.menum;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("Menusoperss")
public interface menumMapper {
    @Select("select * from menum where id=#{id}")
    public menum GetMenumById(int id);

    @Select("select * from menum where paretmenum=#{id}")
    public List<menum> GetMenumByParentId(int id);


    @Insert("insert into menum(MenumName,paretmenum,documentid)values(#{MenumName},#{paretmenum},#{documentid})")
    public void InsertMenum(menum menum);

    @Update("update menum set MenumName=#{MenumName},paretmenum=#{paretmenum},documentid=#{documentid} where id=#{id}")
    public void Update(menum menum);

    @Update("update menum set MenumName=#{MenumName} where id=#{id}")
    public void UpdateName(String MenumName,int id);

    @Delete("delete from menum where id=#{id}")
    public  void Delete(int id);


}
