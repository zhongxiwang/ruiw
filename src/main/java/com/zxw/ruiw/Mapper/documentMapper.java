package com.zxw.ruiw.Mapper;

import com.zxw.ruiw.Model.document;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("documentopers")
public interface documentMapper {

    @Select("select * from document where id=#{id}")
    public document GetdocumentById(int id);


    //@Insert("insert into document(Title,Content)values(#{Title},#{Content})")
    @Insert("insert into document(Title,Content,lastupdate)values(#{Title},#{Content},#{lastupdate})")
    public void Insertdocument(document doc);

    @Update("update document set Title=#{Title},Content=#{Content},lastupdate=#{lastupdate} where id=#{id}")
    public void Update(document doc);

    @Delete("delete from document where id=#{id}")
    public  void Delete(int id);

    @Select("select currval('document_id_seq')")
    public  int GetId();
}
